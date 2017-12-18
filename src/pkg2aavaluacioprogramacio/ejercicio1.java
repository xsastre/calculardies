//Daniel Espinosa Górriz. Crea un array de 10 posicions de números amb valors demanats des de teclat
//Importamos el Scanner, necesario para introducir valores por teclado
import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {
		//Introducimos la variable para introducir valores
		Scanner keyboard = new Scanner(System.in);
		//Iniciamos la matriz de 10 posiciones
		int[] array = new int [10];
		//introducimos el try para evitar que se introduzcan letras en vez de numeros
		try{
			//Las posiciones del bucle van desde x=0 a x<10 para que sean 10 posiciones
		for (int x = 0; x<10;x++) {
			System.out.println ("Introduce un numero: ");
			//Nos pide el siguiente numero, hasta llegar a la posicion 9
			int numero = keyboard.nextInt();
			array[x]=numero;
		} 
			//Aqui hacemos que nos imprima el valor de la matriz por pantalla 
			System.out.println();
		for (int y=0; y<10; y++) {
			System.out.println("El valor de la posicion "+ y +" es: " +array[y]);
		}
		}
		//Introducimos el error para evitar que se pongan letras, en caso de introducirla que imprima por pantalla la siguiente frase
		catch (Exception e) {
			System.out.println("\nNo ha introducido un numero.\n\nVuelva a intentarlo mas tarde.");
		}
		
			
		}
}
