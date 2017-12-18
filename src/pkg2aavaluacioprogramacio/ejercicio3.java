//Ejercicio3 Daniel Espinosa Górriz 

public class ejercicio3 
{ public static void main (String[] args){ 
//Declaramos la matriz de 100 posiciones. 
int[] array1 = new int[100]; 
/*Rellenamos la matriz con los 100 primeros numeros enteros positivos y consecutivos,
y los sumamos "+=". */ 
int suma = 0; for (int contador= 0; contador<array1.length; contador++){
array1[contador]=contador+1;
suma += array1[contador]; } 
System.out.println("\nLa suma de todos los valores es: "+suma); 
//Calculamos la media mediante la operación suma/100. Se trata de la suma de todos los valores entre 100, el número de valores. 
double media = suma / 100; 
System.out.println("\nLa media de todos los valores es: "+media);
} 
}
