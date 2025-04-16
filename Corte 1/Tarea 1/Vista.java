public class Vista {
    private final Consola consola = new Consola();

    // Códigos de colores ANSI
    private static final String RESET = "\033[0m";
    private static final String FONDO_NEGRO = "\033[40m";
    private static final String ROJO = FONDO_NEGRO + "\033[31m";
    private static final String CIAN = FONDO_NEGRO + "\033[36m";
    private static final String AZUL = FONDO_NEGRO + "\033[34m";
    private static final String AMARILLO = FONDO_NEGRO + "\033[33m";

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println(AZUL + "\n=== Calculadora de Movimiento ===" + RESET);
            System.out.println(CIAN + "1. Movimiento Rectilíneo Uniforme (MRU)" + RESET);
            System.out.println(CIAN + "2. Movimiento Rectilíneo Uniformemente Acelerado (MRUA)" + RESET);
            System.out.println(CIAN + "3. Caída Libre" + RESET);
            System.out.println(CIAN + "4. Movimiento en dos dimensiones" + RESET);
            System.out.println(ROJO + "5. Salir" + RESET);

            opcion = consola.leerEntero("Elige una opción (1-5): ");

            switch (opcion) {
                case 1 -> mostrarSubMenuMRU();
                case 2 -> mostrarSubMenuMRUA();
                case 3 -> mostrarSubMenuCaidaLibre();
                case 4 -> mostrarSubMenuMovimiento2D();
                case 5 -> System.out.println(ROJO + "Saliendo del programa. ¡Hasta pronto!" + RESET);
                default -> System.out.println(AMARILLO + "Opción inválida. Intenta de nuevo." + RESET);
            }
        } while (opcion != 5);
    }

    private void mostrarSubMenuMRU() {
        System.out.println(AZUL + "\n=== Movimiento Rectilíneo Uniforme (MRU) ===" + RESET);
        System.out.println(CIAN + "1. Calcular distancia" + RESET);
        System.out.println(CIAN + "2. Calcular velocidad" + RESET);
        System.out.println(CIAN + "3. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-3): ");
        switch (opcion) {
            case 1 -> new MRU().calcular(consola);
            case 2 -> System.out.println(AMARILLO + "Función para calcular velocidad aún no implementada." + RESET);
            case 3 -> {}
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }

    private void mostrarSubMenuMRUA() {
        System.out.println(AZUL + "\n=== Movimiento Rectilíneo Uniformemente Acelerado (MRUA) ===" + RESET);
        System.out.println(CIAN + "1. Calcular distancia" + RESET);
        System.out.println(CIAN + "2. Calcular velocidad final" + RESET);
        System.out.println(CIAN + "3. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-3): ");
        switch (opcion) {
            case 1 -> new MRUA().calcular(consola);
            case 2 -> System.out.println(AMARILLO + "Función para calcular velocidad final aún no implementada." + RESET);
            case 3 -> {}
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }

    private void mostrarSubMenuCaidaLibre() {
        System.out.println(AZUL + "\n=== Caída Libre ===" + RESET);
        System.out.println(CIAN + "1. Calcular altura" + RESET);
        System.out.println(CIAN + "2. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-2): ");
        switch (opcion) {
            case 1 -> new CaidaLibre().calcular(consola);
            case 2 -> {}
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }

    private void mostrarSubMenuMovimiento2D() {
        System.out.println(AZUL + "\n=== Movimiento en dos dimensiones ===" + RESET);
        System.out.println(CIAN + "1. Calcular posición en X y Y" + RESET);
        System.out.println(CIAN + "2. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-2): ");
        switch (opcion) {
            case 1 -> new Movimiento2D().calcular(consola);
            case 2 -> {}
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }
}
