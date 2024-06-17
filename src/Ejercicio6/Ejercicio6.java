
package Ejercicio6;

import java.util.List;
import java.util.Scanner;

/**
 * Crear un programa que permita simular una alcancía digital. La alcancía
 * permite gestionar el ingreso de monedas, el usuario en todo momento puede
 * consultar la cantidad de dinero que posee y la cantidad de transacciones de
 * ingreso y egreso de dinero y cantidad de dinero en cada transacción.
 
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlcanciaDigital alcancia = new AlcanciaDigital();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Consultar transacciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de dinero a ingresar: $");
                    double cantidad = scanner.nextDouble();
                    alcancia.ingresarDinero(cantidad);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de dinero que desea retirar: $");
                    double cantidadEgreso = scanner.nextDouble();
                    alcancia.sacarDinero(cantidadEgreso);
                    break;
                case 3:
                    System.out.println("Saldo actual: $" + alcancia.consultarSaldo());
                    break;
                case 4:
                    List<Transaccion> transacciones = alcancia.consultarTransacciones();
                    System.out.println("Historial de transacciones:");
                    for (int i = 0; i < transacciones.size(); i++) {
                        System.out.println("Transacción " + (i + 1) + " " + transacciones.get(i));
                    }
                    break;
                case 5:
                    System.out.println("cerrando alcancia");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
