package u1ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		String nomb, edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		nomb = sc.nextLine();
		
		System.out.println("Intriduce tu edad: ");
		edad = sc.nextLine();
		
		System.out.println("Hola " + nomb + ", tienes " + edad + " años, ¡qué mayor eres!.");

		
		sc.close();
	}

}
