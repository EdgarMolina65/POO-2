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

    public String leerTexto(String mensaje) {
        System.out.print(mensaje + RESET);
        return scanner.nextLine();
    }
}
