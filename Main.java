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
                    if (clase.isEstado()){
                        System.out.println("Ingrese el grado al que desea ajustar la temperatura");
                        int incremento = scanner.nextInt();
                        clase.ajustarTemperatura(incremento);
                        System.out.println("Temperatura ajustada a: " + clase.getTemperatura() + "°C");
                    } else {
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 4:
                    if(clase.isEstado()){
                        clase.activarModoAutomatico();
                        System.out.println("Modo Automatico activado con éxito");
                    } else {
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    
                    break;

                case 5:
                    if(clase.isEstado()){
                        System.out.print("Ingrese la distribución de aire (frontal/pies): ");
                        String distribucion = scanner.nextLine();
                        clase.configurarDistribucionAire(distribucion);
                        System.out.println("Distribución de aire configurada a: " + clase.getDistribucionAire());
                    } else {
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 6:
                    if(clase.isEstado()){
                        clase.activarDesempañador();
                        System.out.println("Desempañador activado.");
                    } else {
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 7:
                    if(clase.isEstado()){
                        clase.desactivarDesempañador();
                        System.out.println("Desempañador desactivado.");
                    } else{
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 8:
                    if(clase.isEstado()){
                        System.out.print("Ingrese el nivel de ventilación (bajo/medio/alto): ");
                        String nivelVent = scanner.nextLine();
                        clase.setNivelVentilacion(nivelVent);
                        System.out.println("Nivel de ventilación ajustado a: " + clase.getNivelVentilacion());
                    } else{
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 9:
                    if(clase.isEstado()){
                        System.out.print("Ingrese la zona de ventilación (parabrisas/pies): ");
                        String zonaVent = scanner.nextLine();
                        clase.setZonaVentilacion(zonaVent);
                        System.out.println("Zona de ventilación configurada a: " + clase.getZonaVentilacion());
                    } else{
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 10:
                    if(clase.isEstado()){
                        clase.activarModoSilencioso();
                        System.out.println("Modo silencioso activado.");
                    } else {
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 11:
                    if(clase.isEstado()){
                        System.out.print("Ingrese el nivel de humedad (bajo/medio/alto): ");
                        String nivelHumedad = scanner.nextLine();
                        clase.setNivelHumedad(nivelHumedad);
                        System.out.println("Nivel de humedad ajustado a: " + clase.getNivelHumedad());
                    } else {
                        System.out.println("El sistema se encuentra apagado. Opcion no disponible");
                    }
                    break;

                case 12:
                    System.out.println("Estado del sistema: " + (clase.isEstado() ? "Encendido" : "Apagado"));
                    System.out.println("Temperatura actual: " + clase.getTemperatura() + "°C");
                    System.out.println("Modo automático: " + (clase.isModoAutomatico() ? "Activo" : "Inactivo"));
                    System.out.println("Distribución de aire: " + clase.getDistribucionAire());
                    System.out.println("Desempañador: " + (clase.isDesempañadorActivo() ? "Activo" : "Inactivo"));
                    System.out.println("Nivel de ventilación: " + clase.getNivelVentilacion());
                    System.out.println("Zona de ventilación: " + clase.getZonaVentilacion());
                    System.out.println("Modo silencioso: " + (clase.isModoSilencioso() ? "Activo" : "Inactivo"));
                    System.out.println("Nivel de humedad: " + clase.getNivelHumedad());
                    System.out.println("Indicador de humedad: " + clase.getIndicadorHumedad() + "%");

                    break;

                case 13:
                    System.out.println("Saliendo... FELIZ DIA :D");
                    break;

                default:
                    System.out.println("Ingrese una opcion correcta");
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
