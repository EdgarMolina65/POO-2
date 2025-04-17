public class CaidaLibre extends Movimiento {
    private final double g = 9.8;

    @Override
    public void calcular(Consola consola) {
        double t = consola.leerDoublePositivo("Ingresa el tiempo de caída (s): ");
        double h = 0.5 * g * t * t;
        System.out.println("Altura de la caída: " + h + " metros");
    }
}
