package u1ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Declaramos la constante "cov" como "double" para guardar numeros con parte entera y decimal.
		final double cov = 166;
		
		// Declaramos la constante "pes" como "double" para guardar numeros con parte entera y decimal.
		double pes;
		
		// Declaramos la constante "eur" como "double" para guardar numeros con parte entera y decimal.
		double eur;
		
		//Creamos Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la cantidad en pesetas.
		System.out.println("Introduce la cantidad en pesetas: ");
		
		// Leemos la cantidad del teclado.
		pes = sc.nextDouble();
		
		// Instrucciones para calcular la conversión de pesetas a euros.
		eur = pes / cov;
		
		// Finalmente mostramos al solución en euros.
		System.out.println("Eso equivale a " + eur + " euros.");
		
		//Cierre.
		sc.close();

	}

}
