/*Daniel Espinosa Górriz. 
Crea un array de números on indicarem pel teclat la mida de l’array, omplirem l’array amb números aleatoris
entre 0 i 9, al final mostra per pantalla el valor de cada posició i la suma de tots els valors.
Fes un mètode per omplir l’array (que tengui com a paràmetres els números entre els que hagi de generar),
per mostrar el contingut i la suma de l’array i un mètode privat per generar un número aleatori
(es podrà emprar per altres exercicis).*/

//Importamos el Scanner, necesario para introducir valores por teclado
import java.util.Scanner;
public class ejercicio2 {
	
	private static int aleatorio(){
		int numeros=(int) (Math.random()*10);
		return numeros;
	}
	public static void main(String[] args) {
		//Introducimos la variable para introducir valores
		Scanner keyboard = new Scanner(System.in);
		System.out.println ("Introduce la cantidad de numeros que deseas sumar de forma aleatoria");
		int longitud=keyboard.nextInt();
		int resultado=0;
		//Iniciamos la matriz con la longitud previamente marcada
		int[] array = new int [longitud];
		for (int y=0; y<longitud;y++){
			array[y]=aleatorio();
				
	}
	
		for (int array2=0; array2<array.length;array2++){
			resultado=resultado+array[array2];
			System.out.println("La posicion: "+(array2+1)+ " tiene como valor el numero: "+array[array2]);
		}
		System.out.println("El resultado de la suma de todos los valores es: "+resultado);
	}
}


