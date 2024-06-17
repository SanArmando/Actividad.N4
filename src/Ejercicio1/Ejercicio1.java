
package Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author USR-79M2
 */
public class Ejercicio1{

    /**Crear una calculadora con 8 operaciones matemáticas,
     * se debe presentar un menú con el
    nombre de las operaciones (pedir 2 números)
    y mostrar el resultado. Una vez mostrado el
    resultado se debe mostrar otra vez el menú. Hacer validaciones de datos.

*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        //definicion de varibles u objetos 
        Scanner entrada = new Scanner(System.in);
        int suma=0, resta=0, multiplicacion=0 ,módulo=0, potencia=0;
        
        int numero1, numero2 , menu;
        float division=0;
        //mostrar menu
        
        while (true){
            System.out.println("Ingrese un número del menu : ");
            System.out.println("1. suma ");
            System.out.println("2. resta ");
            System.out.println("3. multiplicacion ") ;
            System.out.println("4. division ");
            System.out.println("5.potencia");
            System.out.println("6.módulo");
            System.out.println("7.división entera");
            System.out.println("8.raíz cuadrada");
            menu = entrada.nextInt();
            if (menu <9 && menu >0){
                System.out.println("correcto");
                
                System.out.print("Ingrese el número inicial: ");
                numero1 = entrada.nextInt();
                System.out.print("Ingrese el número final: ");
                numero2 = entrada.nextInt();
                 if (menu == 1){
                     suma= numero1 + numero2;
                     System.out.println("el resultado de la suma es " + suma);
                    entrada.nextLine();
                 }
                 else if (menu == 2){
                     resta= numero1 - numero2;
                     System.out.println("el resultado de la resta es " + resta);
                     entrada.nextLine();
                 }
                else if (menu == 3){
                     multiplicacion= numero1 * numero2;
                     System.out.println("el resultado de la multiplicacion es " + multiplicacion);
                     entrada.nextLine();
                }
                else if (menu == 4){
                     division= numero1 / numero2;
                     System.out.println("el resultado de la division es " + division);
                     entrada.nextLine();
                }
                else if (menu == 5){
                     potencia= numero1 / numero2;
                     System.out.println("el resultado de la potencia es " + potencia);
                     entrada.nextLine(); 
                }
                else if (menu == 6){
                     módulo= numero1 / numero2;
                     System.out.println("el resultado de la módulo es " + módulo );
                     entrada.nextLine();
                }
                //else if (menu == 7){
                  //   división entera= numero1 / numero2;
                    // System.out.println("el resultado de la división entera es " + división entera );
                    // entrada.nextLine();
                }
                //else if (menu == 8){
                  //   raíz cuadrada= numero1 / numero2;
                    // System.out.println("el resultado de la raíz cuadrada es " + raíz cuadrada );
                    // entrada.nextLine();
                    System.out.println("de enter porfavor para volver al menu ");
                } 
            
    }
                    
         
}
