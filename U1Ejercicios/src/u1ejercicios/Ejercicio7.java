package u1ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Declaración de variables
		String nomb, dir, tel;
				
		Scanner sc = new Scanner(System.in);
				
		//Intrucciones
		System.out.println("Introduce tu nombre: ");
		nomb = sc.nextLine();
		
		System.out.println("Introduce tu dirección: ");
		dir = sc.nextLine();
		
		System.out.println("Introduce tu telefono: ");
		tel = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Nombre: " + nomb);
		System.out.println("Nombre: " + dir);
		System.out.println("Nombre: " + tel);
				
		//Cierre	
		sc.close();

	}

}
