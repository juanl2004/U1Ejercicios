package u1ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int añac, añna, edad;
		
		Scanner sc = new Scanner(System.in);
				
		//Instrucciones
		System.out.println("Escribe el año actual:");
		añac = sc.nextInt();
		System.out.println("Escribe tu año de nacimiento:");
		añna = sc.nextInt();
		edad = añac - añna;
		System.out.println("Su edad actual es de : " + edad);
				
		//Cierre
		sc.close();

	}

}
