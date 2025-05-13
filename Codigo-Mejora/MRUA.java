import javax.swing.JOptionPane;

public class MRUA extends Movimiento {

    public MRUA() {
        super("MRUA");
    }

    @Override
    public void mostrarOpciones() {
        String[] opciones = {
            "Velocidad Final (m/s)", 
            "Distancia (m)", 
            "Aceleración (m/s²)", 
            "Tiempo (s)"
        };
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué deseas calcular?", "MRUA",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0 -> calcularVelocidadFinal();
            case 1 -> calcularDistancia();
            case 2 -> calcularAceleracion();
            case 3 -> calcularTiempo();
        }
    }

    @Override
    public void calcular() {
        mostrarOpciones();
    }

    private void calcularVelocidadFinal() {
        double v0 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad inicial (m/s):"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Aceleración (m/s²):"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Tiempo (s):"));
        double vf = v0 + a * t;
        JOptionPane.showMessageDialog(null, "Velocidad final: " + vf + " m/s");
    }

    private void calcularDistancia() {
        double v0 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad inicial (m/s):"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Tiempo (s):"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Aceleración (m/s²):"));
        double d = v0 * t + 0.5 * a * t * t;
        JOptionPane.showMessageDialog(null, "Distancia: " + d + " m");
    }

    private void calcularAceleracion() {
        double vf = Double.parseDouble(JOptionPane.showInputDialog("Velocidad final (m/s):"));
        double v0 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad inicial (m/s):"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Tiempo (s):"));
        double a = (vf - v0) / t;
        JOptionPane.showMessageDialog(null, "Aceleración: " + a + " m/s²");
    }

    private void calcularTiempo() {
        double vf = Double.parseDouble(JOptionPane.showInputDialog("Velocidad final (m/s):"));
        double v0 = Double.parseDouble(JOptionPane.showInputDialog("Velocidad inicial (m/s):"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Aceleración (m/s²):"));
        double t = (vf - v0) / a;
        JOptionPane.showMessageDialog(null, "Tiempo: " + t + " s");
    }
}
