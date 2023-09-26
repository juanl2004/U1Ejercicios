package u1ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int edad, edad1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cual es tu edad: ");
		edad = sc.nextInt();
		
		edad1 = edad + 1;
		System.out.print("Tu edad el año que viene sera: " + edad1);
		
	sc.close();
		
		
	}

}
