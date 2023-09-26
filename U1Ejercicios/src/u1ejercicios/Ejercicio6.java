package u1ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaración de variables
		float num1, num2, sum, rest, mult, div;
			
		Scanner sc = new Scanner(System.in);
			
		//Instrucciones
		System.out.println("Escribe un numero: ");
		num1 = sc.nextFloat();
		System.out.println("Escribe otro numero");
		num2 = sc.nextFloat();
		
		System.out.println();
	
		sum = (float) (num1 + num2);
		System.out.println("Suma: " + sum);
						
		rest = (float) (num1 - num2);
		System.out.println("Resta: " + rest);
			
		mult = (float) (num1 * num2);
		System.out.println("Multiplicación: " + mult);

		div = (float) (num1 / num2);
		System.out.println("División: " + div);
			
		//Cierre	
		sc.close();

	}

}
