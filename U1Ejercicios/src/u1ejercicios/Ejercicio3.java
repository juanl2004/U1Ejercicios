package u1ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Creamos la variable, año actual.
		int añac;
		
		//Creamos la variable, año de nacimiento.
		int añna; 
		
		//Creamos la variable, la edad actual.
		int edad;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
				
		//Le pedimos al usuario que escriba el año actual.
		System.out.println("Escribe el año actual:");
		
		//Leemos el año actual del teclado.
		añac = sc.nextInt();
		
		//Le pedimos al usuario que escriba su año de nacimiento.
		System.out.println("Escribe tu año de nacimiento:");
		
		//Leemos el año de nacimiento.
		añna = sc.nextInt();
		
		//Instrucción para calcular la edad del usuario.
		edad = añac - añna;
		
		//Damos el resultado.
		System.out.println("Su edad actual es de : " + edad);
				
		//Cierre.
		sc.close();

	}

}
