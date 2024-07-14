import java.io.IOException;
import java.util.Scanner;

public class ConversorDeMonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la moneda base:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");
            System.out.println("7. Salir");

            int opcionBase = scanner.nextInt();
            if (opcionBase == 7) {
                continuar = false;
                break;
            }
            String monedaBase = obtenerCodigoMoneda(opcionBase);

            System.out.println("Seleccione la moneda objetivo:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");

            int opcionObjetivo = scanner.nextInt();
            String monedaObjetivo = obtenerCodigoMoneda(opcionObjetivo);

            System.out.println("Ingrese el monto a convertir:");
            double monto = scanner.nextDouble();

            try {
                double tasaCambio = APICliente.obtenerTasaCambio(monedaBase, monedaObjetivo);
                double resultado = monto * tasaCambio;
                System.out.printf("El monto convertido es: %.2f %s\n", resultado, monedaObjetivo);
            } catch (IOException | InterruptedException e) {
                System.err.println("Error al obtener la tasa de cambio: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Gracias por usar el conversor de monedas.");
    }

    private static String obtenerCodigoMoneda(int opcion) {
        return switch (opcion) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> throw new IllegalArgumentException("Opción no válida.");
        };
    }
}
