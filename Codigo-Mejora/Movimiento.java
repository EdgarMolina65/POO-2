public abstract class Movimiento implements Calculable {
    protected String nombre;

    public Movimiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarOpciones();
}
