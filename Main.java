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
                    clase.encender();
                    System.out.println("Sistema encendido");
                    break;

                case 2:
                    clase.apagar();
                    System.out.println("Sistema apagado");
                    break;

                case 3:
                    System.out.println("Ingrese cuanto desea incrementar la temperatura");
                    int incremento = scanner.nextInt();
                    clase.ajustarTemperatura(incremento);
                    break;

                case 4:
                    clase.activarModoAutomatico();
                    break;

                case 5:
                    System.out.print("Ingrese la distribución de aire (frontal/pies): ");
                    String distribucion = scanner.nextLine();
                    clase.configurarDistribucionAire(distribucion);
                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:

                    break;

                case 13:

                    break;

                default:
                    break;
            }

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

        }
        scanner.close();
    }
}
