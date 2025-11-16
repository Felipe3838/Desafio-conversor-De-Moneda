package PrincipalCodigo;

import java.util.Scanner;

public class Menu {

    // 1. MÉTODO PRINCIPAL: PUNTO DE ENTRADA DEL PROGRAMA
    public static void main(String[] args) {
        // Creamos una instancia de Menu para llamar al método iniciar()
        Menu menuApp = new Menu();
        menuApp.iniciar();
    }

    public void iniciar() {
        // Instanciamos todas las clases que vamos a necesitar
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        ConsultarMonedaApi consultaApi = new ConsultarMonedaApi();
        AnalizandoJson parser = new AnalizandoJson();

        int opcion = 0;

        // Bucle de repetición (while) para mantener el menú activo
        while (opcion != 7) {

            // --- INTERFAZ TEXTUAL CON LAS OPCIONES DEL MENÚ ACTUALIZADAS ---
            System.out.println("\n====================================================================");
            System.out.println("            SEAN BIENVENIDOS AL CONVERSOR DE MONEDAS"                   );
            System.out.println("Deberas ingresar el número correspondiente para realizar la conversión");
            System.out.println("=======================================================================");

            // Opciones de conversión con USD, COP, ARS, CLP, BRL, BOB.
            System.out.println("1. USD ➝ COP (Peso Colombiano)");
            System.out.println("2. USD ➝ ARS (Peso Argentino)");
            System.out.println("3. USD ➝ CLP (Peso Chileno)"); // NUEVA
            System.out.println("4. USD ➝ BRL (Real Brasileño)");
            System.out.println("5. USD ➝ BOB (Boliviano Boliviano)"); // NUEVA
            System.out.println("6. COP ➝ USD (Inverso)");

            System.out.println("7. Salir");
            System.out.println("=======================================================================");
            System.out.print("Elija una opción válida: ");

            try {
                // Captura la opción del usuario.
                opcion = Integer.parseInt(scanner.nextLine());

                // Manejo de la opción Salir (7)
                if (opcion == 7) {
                    System.out.println("Saliendo del conversor... ¡Hasta luego!");
                    break;
                }

                // Si la opción está fuera del rango (1-6)
                if (opcion < 1 || opcion > 6) {
                    System.out.println("Opción inválida. Intente nuevamente.\n");
                    continue; // Vuelve al inicio del bucle
                }

                // --- 1. Definir Monedas a partir de la opción (ACTUALIZADO) ---
                String monedaBase = "";
                String monedaDestino = "";

                switch (opcion) {
                    case 1: monedaBase = "USD"; monedaDestino = "COP"; break;
                    case 2: monedaBase = "USD"; monedaDestino = "ARS"; break;
                    case 3: monedaBase = "USD"; monedaDestino = "CLP"; break; // CLP
                    case 4: monedaBase = "USD"; monedaDestino = "BRL"; break;
                    case 5: monedaBase = "USD"; monedaDestino = "BOB"; break; // BOB
                    case 6: monedaBase = "COP"; monedaDestino = "USD"; break; // COP -> USD
                }

                // --- 2. Pedir Cantidad ---
                System.out.print("Ingrese la cantidad de " + monedaBase + " a convertir: ");
                double cantidad = Double.parseDouble(scanner.nextLine());

                // --- 3. Lógica de Conversión (Llamando a tus clases) ---
                String jsonRespuesta = consultaApi.obtenerDatos(monedaBase);
                double tasa = parser.obtenerTasa(jsonRespuesta, monedaDestino);
                double resultado = conversor.convertir(cantidad, tasa);

                // --- 4. Mostrar Resultado ---
                System.out.printf("\n====================================================");
                System.out.printf("\nEl valor de %.2f [%s] equivale a %.2f [%s]\n",
                        cantidad, monedaBase, resultado, monedaDestino);
                System.out.println("======================================================");

            } catch (NumberFormatException e) {
                // Maneja si el usuario introduce letras en la opción o en la cantidad
                System.out.println("\nError: Debe ingresar solo números válidos. Intente de nuevo.");
            } catch (Exception e) {
                // Captura errores de la API, de parsing
                System.out.println("\nError fatal en la conversión: " + e.getMessage());
            }
        }
        scanner.close(); // Cierra el Scanner al salir del bucle
    }
}