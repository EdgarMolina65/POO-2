import javax.swing.JOptionPane;

public class Movimiento2D extends Movimiento {

    public Movimiento2D() {
        super("Movimiento en 2D");
    }

    @Override
    public void mostrarOpciones() {
        String[] opciones = {"Alcance horizontal (m)", "Altura máxima (m)", "Tiempo total (s)"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué deseas calcular?", "Movimiento 2D",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0 -> calcularAlcance();
            case 1 -> calcularAlturaMax();
            case 2 -> calcularTiempoTotal();
        }
    }

    @Override
    public void calcular() {
        mostrarOpciones();
    }

    private void calcularAlcance() {
        double v = Double.parseDouble(JOptionPane.showInputDialog("Velocidad inicial (m/s):"));
        double angulo = Math.toRadians(Double.parseDouble(JOptionPane.showInputDialog("Ángulo de lanzamiento (grados):")));
        double alcance = (v * v * Math.sin(2 * angulo)) / 9.8;
        JOptionPane.showMessageDialog(null, "Alcance horizontal: " + alcance + " m");
    }

    private void calcularAlturaMax() {
        double v = Double.parseDouble(JOptionPane.showInputDialog("Velocidad inicial (m/s):"));
        double angulo = Math.toRadians(Double.parseDouble(JOptionPane.showInputDialog("Ángulo de lanzamiento (grados):")));
        double altura = (v * v * Math.pow(Math.sin(angulo), 2)) / (2 * 9.8);
        JOptionPane.showMessageDialog(null, "Altura máxima: " + altura + " m");
    }

    private void calcularTiempoTotal() {
        double v = Double.parseDouble(JOptionPane.showInputDialog("Velocidad inicial (m/s):"));
        double angulo = Math.toRadians(Double.parseDouble(JOptionPane.showInputDialog("Ángulo de lanzamiento (grados):")));
        double t = (2 * v * Math.sin(angulo)) / 9.8;
        JOptionPane.showMessageDialog(null, "Tiempo total de vuelo: " + t + " s");
    }
}
