package u1ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaro la variable "num1" como "float" porque puede ser decimal.
		float num1;
		
		//Declaro la variable "num2" como "float" porque puede ser decimal.
		float num2;
		
		//Declaro la variable "sum" como "float" porque puede ser decimal.
		float sum;
		
		//Declaro la variable "rest" como "float" porque puede ser decimal.
		float rest;
		
		//Declaro la variable "rest" como "float" porque puede ser decimal.
		float mult;
		
		//Declaro la variable "div" como "float" porque puede ser decimal.
		float div;
		
		//Creammos el Scanner.
		Scanner sc = new Scanner(System.in);
			
		//Le pedimos un numero al usuari.
		System.out.println("Escribe un numero: ");
		
		//Leemos el numero del teclado.
		num1 = sc.nextFloat();
		
		//Le pedimos al usuario otro numero.
		System.out.println("Escribe otro numero");
		
		// Leemos el otro numero del teclado.
		num2 = sc.nextFloat();
		
		//Para dejar un espacio.
		System.out.println();
	
		// Instrucciones para realizar la suma.
		sum = (float) (num1 + num2);
		
		//Mostrar al usuario la suma de los dos numeros.
		System.out.println("Suma: " + sum);
						
		// Instrucciones para realizar la resta.
		rest = (float) (num1 - num2);
		
		//Mostrar al usuario la resta de los dos numeros.
		System.out.println("Resta: " + rest);
			
		// Instrucciones para realizar la multiplicación.
		mult = (float) (num1 * num2);
		
		//Mostrar al usuario la multiplicación de los dos numeros.
		System.out.println("Multiplicación: " + mult);

		// Instrucciones para realizar la división.
		div = (float) (num1 / num2);
		
		//Mostrar al usuario la división de los dos numeros.
		System.out.println("División: " + div);
			
		//Cierre	
		sc.close();

	}

}
