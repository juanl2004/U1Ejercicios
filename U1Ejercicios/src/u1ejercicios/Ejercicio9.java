package u1ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		final double cov = 166;
		double pes, eur;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad en pesetas: ");
		pes = sc.nextDouble();
		
		eur = pes / cov;
		
		System.out.println("Eso equivale a " + eur + " euros.");
		
		sc.close();

	}

}
