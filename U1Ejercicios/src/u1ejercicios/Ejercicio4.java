package u1ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaracion de variables
		int not1, not2;
		//Declaro la media como float porque pueden salir decimales
		float media;
		Scanner sc = new Scanner(System.in);
				
		//Instrucciones 
		System.out.println("Escribe la primera nota:");
		not1 = sc.nextInt();
		System.out.println("Escribe la segunda nota:");
		not2 = sc.nextInt();
				
		//Usamos la variable "media" para realizar la media entre not1 y not2
		media = (float) (not1 + not2) /2;
		System.out.println("La media es: " + media);
				
		//Cierre	
		sc.close();		

	}

}
