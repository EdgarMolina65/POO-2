public class MRUA extends Movimiento {
    @Override
    public void calcular(Consola consola) {
        double v0 = consola.leerDouble("Ingresa la velocidad inicial (m/s): ");
        double a = consola.leerDouble("Ingresa la aceleración (m/s²): ");
        double t = consola.leerDouble("Ingresa el tiempo (s): ");
        double d = v0 * t + 0.5 * a * t * t;
        System.out.println("Distancia recorrida: " + d + " metros");
    }
}