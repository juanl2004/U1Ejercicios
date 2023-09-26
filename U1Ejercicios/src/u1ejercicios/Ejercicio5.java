package u1ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaración de variables
		float rad;
		
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("Calcula la longitud y el área de una circunferencia");
		System.out.println();
		System.out.println("Escribe el radio de la circunferencia:" );
		rad = sc.nextFloat();
		System.out.println("La longitud seria: " + 2 * Math.PI * rad);
		System.out.println("El area seria: " + Math.PI * Math.pow(rad, 2));
		
		//Cierre	
		sc.close();

	}

}
