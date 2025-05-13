import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"MRU", "MRUA", "Caída Libre", "Movimiento 2D", "Salir"};
        Movimiento movimiento;

        while (true) {
            int opcion = JOptionPane.showOptionDialog(null,
                    "Selecciona el tipo de movimiento:",
                    "Calculadora Física",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (opcion == -1 || opcion == 4) break;

            switch (opcion) {
                case 0 -> movimiento = new MRU();
                case 1 -> movimiento = new MRUA();
                case 2 -> movimiento = new CaidaLibre();
                case 3 -> movimiento = new Movimiento2D();
                default -> throw new IllegalStateException("Opción inválida");
            }

            movimiento.calcular();
        }
    }
}
