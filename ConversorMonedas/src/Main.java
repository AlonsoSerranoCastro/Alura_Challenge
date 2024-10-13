import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();  // Instancia para consultar tasas de la API

        // Obtenemos las tasas de conversión de la API para USD y MXN
        Moneda monedaUSD = consultaMoneda.buscaMoneda("USD");
        Moneda monedaEUR = consultaMoneda.buscaMoneda("EUR");
        Moneda monedaMXN = consultaMoneda.buscaMoneda("MXN");

        // Mapa de tasas de conversión para USD y MXN
        Map<String, Double> conversionRatesUSD = monedaUSD.conversion_rates();
        Map<String, Double> conversionRatesEUR = monedaEUR.conversion_rates();
        Map<String, Double> conversionRatesMXN = monedaMXN.conversion_rates();

        String menu = """
                *******************************************
                Sea bienvenido/a al conversor de monedas.
                
                1) Dolar --> Peso mexicano
                2) Peso mexicano --> Dolar
                3) Dolar --> Euro
                4) Euro --> Dolar
                5) Euro --> Peso mexicano
                6) Peso mexicano --> Euro
                7) Salir
                
                *******************************************""";

    /*ConsultaMoneda consulta = new ConsultaMoneda();
    Moneda moneda = consulta.buscaMoneda("MXN");
        System.out.println(moneda);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();*/

        int opcion = 0;

        // Ciclo para mostrar el menú hasta que el usuario elija la opción de salir
        while (opcion != 7) {
            System.out.println(menu);

            // Leer opción del usuario
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();

                // Leer la cantidad que el usuario desea convertir
                System.out.print("Ingresa la cantidad que deseas convertir: ");
                double cantidad = scanner.nextDouble();

                // Procesar la opción seleccionada
                switch (opcion) {
                    case 1: {
                        // Dolar (USD) a Peso mexicano (MXN)
                        double tasa = conversionRatesUSD.get("MXN");
                        double resultado = cantidad * tasa;
                        System.out.println(cantidad + " USD son " + resultado + " MXN");
                        break;
                    }
                    case 2: {
                        // Peso mexicano (MXN) a Dolar (USD)
                        double tasa = conversionRatesMXN.get("USD");
                        double resultado = cantidad * tasa;
                        System.out.println(cantidad + " MXN son " + resultado + " USD");
                        break;
                    }
                    case 3: {
                        // Dolar (USD) a Euro (EUR)
                        double tasa = conversionRatesUSD.get("EUR");
                        double resultado = cantidad * tasa;
                        System.out.println(cantidad + " USD son " + resultado + " EUR");
                        break;
                    }
                    case 4: {
                        // Euro (EUR) a Dolar (USD)
                        double tasa = conversionRatesEUR.get("USD");
                        double resultado = cantidad * tasa;
                        System.out.println(cantidad + " EUR son " + resultado + " USD");
                        break;
                    }
                    case 5: {
                        // Euro (EUR) a Peso mexicano (MXN)
                        double tasa = conversionRatesEUR.get("MXN");
                        double resultado = cantidad * tasa;
                        System.out.println(cantidad + " EUR son " + resultado + " MXN");
                        break;

                    }
                    case 6: {
                        // Peso mexicano (MXN) a Euro (EUR)
                        double tasa = conversionRatesMXN.get("EUR");
                        double resultado = cantidad * tasa;
                        System.out.println(cantidad + " MXN son " + resultado + " EUR");
                        break;
                    }
                    case 7:
                        System.out.println("Saliendo del conversor de monedas");
                        break;
                    default:
                        System.out.println("Opción inválida, intenta de nuevo.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor ingresa un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        // Cerrar el scanner al final
        scanner.close();
    }
}
