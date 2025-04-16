public class Movimiento2D extends Movimiento {
    private final double g = 9.8;

    @Override
    public void calcular(Consola consola) {
        double v0x = consola.leerDouble("Ingresa la velocidad inicial en X (m/s): ");
        double v0y = consola.leerDouble("Ingresa la velocidad inicial en Y (m/s): ");
        double t = consola.leerDouble("Ingresa el tiempo (s): ");

        double x = v0x * t;
        double y = v0y * t - 0.5 * g * t * t;

        System.out.println("Posición en X: " + x + " metros");
        System.out.println("Posición en Y: " + y + " metros");
    }
}