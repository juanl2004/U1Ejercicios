package u1ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Creamos la variable edad.
		int edad;
		
		//Creamos la variable del resultado final.
		int edad1;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le preguntamos al usuario su edad.
		System.out.print("Cual es tu edad: ");
		
		//Leemos la edad del teclado.
		edad = sc.nextInt();
		
		//Realizamos las instrucciones para calcular la edad el año que viene.
		edad1 = edad + 1;
		
		//Damos el resultado.
		System.out.print("Tu edad el año que viene sera: " + edad1);
		
	//Cierre.	
	sc.close();
		
		
	}

}
