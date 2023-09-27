package u1ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Declaramos la variable "nomb" como "String" porque van a ser letras.
		String nomb;
		
		//Declaramos la variable "dir" como "String" porque van a ser letras.
		String dir;
		
		//Declaramos la variable "tel" como "int" porque van a ser numeros.
		int tel;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
				
		// Le pedimos al usuario su nombre.
		System.out.println("Introduce tu nombre: ");
		
		// Leemos el nombre del teclado.
		nomb = sc.nextLine();
		
		// Le pedimos al usuario su dirección.
		System.out.println("Introduce tu dirección: ");
		
		// Leemos la dirección del teclado.
		dir = sc.nextLine();
		
		// Le pedimos al usuario su numero de telefono.
		System.out.println("Introduce tu telefono: ");
		
		// Leemos el telefono del teclado.
		tel = sc.nextInt();
		
		// Dejar un espacio.
		System.out.println();
		
		// Mostramos la solucion, en este caso el nombre.
		System.out.println("Nombre: " + nomb);
		
		// Mostramos la solucion, en este caso la dirección.
		System.out.println("Nombre: " + dir);
		
		// Mostramos la solucion, en este caso el telefono.
		System.out.println("Nombre: " + tel);
				
		//Cierre	
		sc.close();

	}

}
