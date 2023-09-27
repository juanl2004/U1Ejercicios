package u1ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Declaramos la variable "nomb" como "String" porque van a ser letras.
		String nomb; 
		
		//Declaramos la variable "edad" como "String" porque van a ser letras.
		String edad;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario su nombre.
		System.out.println("Introduce tu nombre: ");
		
		//Leemos el nombre del teclado.
		nomb = sc.nextLine();
		
		// Le pedimos al usuario su edad.
		System.out.println("Intriduce tu edad: ");
		
		// Leemos la edad del teclado.
		edad = sc.nextLine();
		
		// Mostramos la sol que nos plantea el ejercicio.
		System.out.println("Hola " + nomb + ", tienes " + edad + " años, ¡qué mayor eres!.");

		// Cierre
		sc.close();
	}

}
