import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClaseC clase = new ClaseC();

        int op;
        System.out.println("------MENU-----");

        System.out.println("1. Encender sistema");
        System.out.println("2. Apagar sistema");
        System.out.println("3. Ajustar temperatura");
        System.out.println("4. Activar modo automático");
        System.out.println("5. Configurar distribución de aire");
        System.out.println("6. Activar desempañador");
        System.out.println("7. Desactivar desempañador");
        System.out.println("8. Ajustar nivel de ventilación");
        System.out.println("9. Configurar zona de ventilación");
        System.out.println("10. Activar modo silencioso");
        System.out.println("11. Ajustar nivel de humedad");
        System.out.println("12. Ver estado del sistema");
        System.out.println("13. Salir");

        op = scanner.nextInt();
        scanner.nextLine();

        while (op != 13) {

            switch (op) {
                case 1:

                    break;

                default:
                    break;
            }

        }

    }
}
