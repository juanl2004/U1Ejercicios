package u1ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Creamos la variable de la primera nota.
		int not1;
		
		//Creamos la variable de la segunda nota.
		int not2;
		
		//Declaro la variable "media" como float porque pueden salir decimales.
		float media;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
				
		//Le pedimos al usuario que escriba la primera nota.
		System.out.println("Escribe la primera nota:");
		
		//Leemos la primera nota del teclado.
		not1 = sc.nextInt();
		
		//Le pedimos al usuario que escriba la segunda nota.
		System.out.println("Escribe la segunda nota:");
		
		//Leemos la segunda nota del teclado.
		not2 = sc.nextInt();
				
		//Usamos la variable "media" para realizar la media entre not1 y not2.
		media = (float) (not1 + not2) /2;
		
		//Damos el resultado.
		System.out.println("La media es: " + media);
				
		//Cierre	
		sc.close();		

	}

}
