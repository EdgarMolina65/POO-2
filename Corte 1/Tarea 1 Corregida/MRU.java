public class MRU extends Movimiento {
    @Override
    public void calcular(Consola consola) {
        double v = consola.leerDouble("Ingresa la velocidad (m/s): ");
        double t = consola.leerDoublePositivo("Ingresa el tiempo (s): ");
        double d = v * t;
        
        System.out.println("Distancia recorrida: " + d +" metros");
        System.out.println("Velocidad: " + v +" m/s");

    }
}