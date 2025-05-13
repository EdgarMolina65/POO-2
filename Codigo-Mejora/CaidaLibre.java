import javax.swing.JOptionPane;

public class CaidaLibre extends Movimiento {

    public CaidaLibre() {
        super("Caída Libre");
    }

    @Override
    public void mostrarOpciones() {
        String[] opciones = {
            "Altura (m)",
            "Tiempo (s)",
            "Velocidad final (m/s)"
        };
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué deseas calcular?", "Caída Libre",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0 -> calcularAltura();
            case 1 -> calcularTiempo();
            case 2 -> calcularVelocidadFinal();
        }
    }

    @Override
    public void calcular() {
        mostrarOpciones();
    }

    private void calcularAltura() {
        double t = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de caída (s):"));
        double h = 0.5 * 9.8 * t * t;
        JOptionPane.showMessageDialog(null, "Altura: " + h + " m");
    }

    private void calcularTiempo() {
        double h = Double.parseDouble(JOptionPane.showInputDialog("Altura (m):"));
        double t = Math.sqrt(2 * h / 9.8);
        JOptionPane.showMessageDialog(null, "Tiempo: " + t + " s");
    }

    private void calcularVelocidadFinal() {
        double t = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de caída (s):"));
        double v = 9.8 * t;
        JOptionPane.showMessageDialog(null, "Velocidad final: " + v + " m/s");
    }
}
