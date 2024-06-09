import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaConversor consulta = new ConsultaConversor();

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
                    9) Salir
                    
                    Elija una opción válida:
                    ***************************************************************
                    """);
            int opcionConversor = Integer.parseInt(lectura.nextLine().trim());

            if (opcionConversor == 9) {
                System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                break;
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
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 9.");
                    continue;
            }

            try {
                Moneda moneda = consulta.buscaMoneda(conversorMoneda, cantidad);
                System.out.println("El valor: " + cantidad + " ["+ moneda.base_code() + "] "
                                    +"corresponde al valor final de =>> " + moneda.conversion_result()
                                    + " [" + moneda.target_code() + "] ");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        lectura.close();
    }
}
