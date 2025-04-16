public class Vista {
    private final Consola consola = new Consola();

    // Códigos de colores ANSI
    private static final String RESET = "\033[0m";
    private static final String ROJO = "\033[31m";
    private static final String CIAN = "\033[36m";
    private static final String AZUL = "\033[34m";
    private static final String AMARILLO = "\033[33m";
    private static final String FONDO_NEGRO = "\033[40m";

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println(FONDO_NEGRO + AZUL + "\n=== Calculadora de Movimiento ===" + RESET);
            System.out.println(FONDO_NEGRO + CIAN + "1. Movimiento Rectilíneo Uniforme (MRU)" + RESET);
            System.out.println(FONDO_NEGRO + CIAN + "2. Movimiento Rectilíneo Uniformemente Acelerado (MRUA)" + RESET);
            System.out.println(FONDO_NEGRO + CIAN + "3. Caída Libre" + RESET);
            System.out.println(FONDO_NEGRO + CIAN + "4. Movimiento en dos dimensiones" + RESET);
            System.out.println(ROJO + "5. Salir" + RESET);
            

            opcion = consola.leerEntero("Elige una opción (1-5): ");

            switch (opcion) {
                case 1 -> mostrarSubMenuMRU();
                case 2 -> mostrarSubMenuMRUA();
                case 3 -> mostrarSubMenuCaidaLibre();
                case 4 -> mostrarSubMenuMovimiento2D();
                case 5 -> System.out.println(ROJO + "Saliendo del programa... ¡Hasta pronto!" + RESET);
                default -> System.out.println(AMARILLO + "Opción inválida. Intenta de nuevo." + RESET);
            }
        } while (opcion != 5);
    }

    private void mostrarSubMenuMRU() {
        System.out.println(FONDO_NEGRO + AZUL + "\n=== Movimiento Rectilíneo Uniforme (MRU) ===" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "1. Calcular distancia" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "2. Calcular velocidad" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "3. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-3): ");
        switch (opcion) {
            case 1 -> {
                Movimiento mru = new MRU();
                mru.calcular(consola);
            }
            case 2 -> {
                double distancia = consola.leerDouble("Ingresa la distancia (m): ");
                double tiempo = consola.leerDoublePositivo("Ingresa el tiempo (s): ");
                double velocidad = distancia / tiempo;
                System.out.println("Velocidad: " + velocidad + " m/s");
            }
            case 3 -> {
                return;
            }
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }

    private void mostrarSubMenuMRUA() {
        System.out.println(FONDO_NEGRO + AZUL + "\n=== Movimiento Rectilíneo Uniformemente Acelerado (MRUA) ===" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "1. Calcular distancia" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "2. Calcular velocidad final" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "3. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-3): ");
        switch (opcion) {
            case 1 -> {
                Movimiento mrua = new MRUA();
                mrua.calcular(consola);
            }
            case 2 -> {
                double v0 = consola.leerDouble("Ingresa la velocidad inicial (m/s): ");
                double a = consola.leerDouble("Ingresa la aceleración (m/s²): ");
                double t = consola.leerDoublePositivo("Ingresa el tiempo (s): ");
                double velocidadFinal = v0 + a * t;
                System.out.println("Velocidad final: " + velocidadFinal + " m/s");
            }
            case 3 -> {
                return;
            }
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }

    private void mostrarSubMenuCaidaLibre() {
        System.out.println(FONDO_NEGRO + AZUL + "\n=== Caída Libre ===" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "1. Calcular altura" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "2. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-2): ");
        switch (opcion) {
            case 1 -> {
                Movimiento caidaLibre = new CaidaLibre();
                caidaLibre.calcular(consola);
            }
            case 2 -> {
                return;
            }
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }

    private void mostrarSubMenuMovimiento2D() {
        System.out.println(FONDO_NEGRO + AZUL + "\n=== Movimiento en dos dimensiones ===" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "1. Calcular posición en X y Y" + RESET);
        System.out.println(FONDO_NEGRO + CIAN + "2. Volver al menú principal" + RESET);

        int opcion = consola.leerEntero("Elige una opción (1-2): ");
        switch (opcion) {
            case 1 -> {
                Movimiento movimiento2D = new Movimiento2D();
                movimiento2D.calcular(consola);
            }
            case 2 -> {
                return;
            }
            default -> System.out.println(ROJO + "Opción inválida. Intenta de nuevo." + RESET);
        }
    }
}
