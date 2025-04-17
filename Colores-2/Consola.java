import java.util.Scanner;

public class Consola {
    private final Scanner scanner = new Scanner(System.in);

 // Códigos de colores ANSI
    private static final String RESET = "\033[0m";
    private static final String ROJO = "\033[31;40m";
 
    public double leerDouble(String mensaje) {
        System.out.print(mensaje + RESET);
        while (!scanner.hasNextDouble()) {
            System.out.println(ROJO + "Entrada no válida. Intenta de nuevo." + RESET);
            scanner.next();
            System.out.print(mensaje + RESET);
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer
        return valor;
    }
    // Método para leer un número double positivo
    public double leerDoublePositivo(String mensaje) {
        double valor;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextDouble()) {
                System.out.println( ROJO + "Entrada no válida. Intenta de nuevo." + RESET);
                scanner.next();
                System.out.print(mensaje + RESET);
            }
            valor = scanner.nextDouble();
            scanner.nextLine(); // Limpia el buffer
            if (valor <= 0) {
                System.out.println(ROJO + "El valor debe ser mayor que cero. Intenta de nuevo." + RESET);
            }
        } while (valor <= 0);
        return valor;
    }

    // Método para leer un número entero
    public int leerEntero(String mensaje) {
        System.out.print(mensaje + RESET);
        while (!scanner.hasNextInt()) {
            System.out.println(ROJO + "Entrada no válida. Intenta de nuevo." + RESET);
            scanner.next();
            System.out.print(mensaje + RESET);
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        return valor;
    }

    // Método para leer texto (opcional)
    public String leerTexto(String mensaje) {
        System.out.print(mensaje + RESET);
        return scanner.nextLine();
    }
}