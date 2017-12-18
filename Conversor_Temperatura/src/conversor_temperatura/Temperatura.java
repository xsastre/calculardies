/*
 * @author Salvador Bauza
 * 1º DAM
 */

//Importamos la utilidad de introduccion de datos por teclado "Scanner"
package conversor_temperatura;
import java.util.Scanner;

public class Temperatura {
    
/*Definimos nuestros dos meteodos, uno para convertir valores de Celsius 
* a Farenheit y otro de Farenheit a Celsius
*/
private static double FarenheitToCelsius() {
        //Pedimos el valor a convertir.
        System.out.println("Introduce el valor a convertir a Celsius.");
        Scanner num = new Scanner(System.in);
        int num2 = num.nextInt();
        
        //Aplicamos la formula para convertir.
        double resul = ( num2 - 32 ) / 1.8;
        
        //Enseñamos el resultado por pantalla.
        System.out.println(+num2+ " Grados Farenheit, es "+resul+" En Celsius.");
        System.out.println("");
        
        return resul;
    }
    
    private static double CelsiusToFarenheit() {
        //Pedimos el valor a convertir.
        System.out.println("Introdeuce el valor a convertir en FarenHeit.");
        Scanner num = new Scanner(System.in);
        int num2 = num.nextInt();
        
        //Aplicamos la formula para convertir.
        double resul = ((1.8*num2)+32);
        
        //Enseñamos el resultado por pantalla.
        System.out.println(+num2+ " Grados Celsius, son "+resul+" Farenheit.");
        System.out.println("");
        
        return resul;
    }

    
    
public static void main(String[] args) {
    
        //Creamos un bucle para posteriormente volver a ejecutar el programa.
        int repetir = 1;
        while (repetir == 1) {
            
        //Pedimos al usuario que tipo de conversion quiere realizar.
        Scanner seleccion = new Scanner(System.in);
        System.out.println("Escribe:\n1 para convertir de Celsius a Farenheit \n2 para convertir de Farenheit a Celsius.");
        
        int operador=seleccion.nextInt();
        double resultado = 0;
        
        //Creamos un switch para invocar el motodo seleccionado por el usuario.
        switch (operador) {
            case 1:
                resultado = CelsiusToFarenheit();
                break;
            case 2:
                resultado = FarenheitToCelsius();
                break;
            default:
                System.out.println("Por favor seleccione una opcion vàlida.");
                System.out.println("");
        }
        
        //Creamos otro bucle para pedir al usuario si quiere realizar otra conversion.
        int repetir2 = 0;
        while (repetir2 == 0) {
        System.out.println("¿Quieres realizar otra conversión?");
        System.out.println("Escribe:\n1.- Sí. \n2.- No.");
        Scanner rep = new Scanner(System.in);
        int rep2 = rep.nextInt();
        
        /*En funcion de su eleccion cerraremos el programa, lo repetiremos o enseñaremos
        * un mensaje de error en caso de introducir un valor no valido.
        */
        
        if (rep2 == 1 && rep2 != 2){
            break;
        }
        else if (rep2 == 2) {
            repetir++;
            repetir2++;
        }
        else {
        System.out.println("Por Favor introduce un valor válido.");
        }
    }
    } 
}
}