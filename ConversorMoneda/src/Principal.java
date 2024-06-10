import javax.swing.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaConversor consulta = new ConsultaConversor();
        GeneradorDeHistorial generadorDeHistorial = new GeneradorDeHistorial();

        while (true) {
            System.out.println("""
                    ***************************************************************
                    Sea bienvenido/a al Conversor de Moneda
                                        
                    1) Dólar => Peso Argentino
                    2) Peso Argentino => Dólar
                    3) Dólar => Real Brasileño
                    4) Real Brasileño => Dólar
                    5) Dólar => Peso Colombiano
                    6) Peso Colombiano => Dólar
                    7) Dólar => Peso Mexicano
                    8) Peso Mexicano => Dólar
                    9) Ver Historial de Conversiones
                    10) Salir
                                        
                    Elija una opción válida:
                    ***************************************************************
                    """);
            try {
                String input = lectura.nextLine().trim();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Campo vacío, favor de ingresar una opción");
                }

                int opcionConversor = Integer.parseInt(input);

                if (opcionConversor == 9) {
                    System.out.println(generadorDeHistorial.imprimirHistorialJson());
                    continue;
                }
                if (opcionConversor == 10) {
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                    break;
                }
                if (opcionConversor < 1 || opcionConversor > 10) {
                    System.out.println("Opcion no valida. Por favor Elija una opción");
                    continue;
                }

                System.out.print("Ingrese la cantidad a convertir: ");
                double cantidad = lectura.nextDouble();
                lectura.nextLine();

                String conversorMoneda = "";
                switch (opcionConversor) {
                    case 1:
                        conversorMoneda = "USD/ARS";
                        break;
                    case 2:
                        conversorMoneda = "ARS/USD";
                        break;
                    case 3:
                        conversorMoneda = "USD/BRL";
                        break;
                    case 4:
                        conversorMoneda = "BRL/USD";
                        break;
                    case 5:
                        conversorMoneda = "USD/COP";
                        break;
                    case 6:
                        conversorMoneda = "COP/USD";
                        break;
                    case 7:
                        conversorMoneda = "USD/MXN";
                        break;
                    case 8:
                        conversorMoneda = "MXN/USD";
                        break;
                }

                try {
                    Moneda moneda = consulta.buscaMoneda(conversorMoneda, cantidad);
                    System.out.println("El valor: " + cantidad + " [" + moneda.base_code() + "] "
                            + "corresponde al valor final de =>> " + moneda.conversion_result()
                            + " [" + moneda.target_code() + "] ");
                    System.out.println("Conversion guardada en su historial");
                    generadorDeHistorial.guardarHistorial(moneda);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                } catch (IOException e) {
                    System.out.println("Error al guardar el historial" + e.getMessage());
                }


            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opción válida");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Ingrese una cantidad válida");
                //lectura.nextLine();
            }
        }

        lectura.close();
    }
}
