import javax.swing.JOptionPane;

public class MRU extends Movimiento {

    public MRU() {
        super("MRU");
    }

    @Override
    public void mostrarOpciones() {
        String[] opciones = {"Calcular Distancia (m)", "Calcular Velocidad (m/s)", "Calcular Tiempo (s)"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué deseas calcular?", "MRU", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0 -> calcularDistancia();
            case 1 -> calcularVelocidad();
            case 2 -> calcularTiempo();
        }
    }

    @Override
    public void calcular() {
        mostrarOpciones();
    }

    private void calcularDistancia() {
        double v = Double.parseDouble(JOptionPane.showInputDialog("Velocidad (m/s):"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Tiempo (s):"));
        double d = v * t;
        JOptionPane.showMessageDialog(null, "Distancia: " + d + " m");
    }

    private void calcularVelocidad() {
        double d = Double.parseDouble(JOptionPane.showInputDialog("Distancia (m):"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Tiempo (s):"));
        double v = d / t;
        JOptionPane.showMessageDialog(null, "Velocidad: " + v + " m/s");
    }

    private void calcularTiempo() {
        double d = Double.parseDouble(JOptionPane.showInputDialog("Distancia (m):"));
        double v = Double.parseDouble(JOptionPane.showInputDialog("Velocidad (m/s):"));
        double t = d / v;
        JOptionPane.showMessageDialog(null, "Tiempo: " + t + " s");
    }
}
