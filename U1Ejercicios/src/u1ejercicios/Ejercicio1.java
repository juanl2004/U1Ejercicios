package u1ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
	//Creamos la variable número.
	int num;
	
	//Creamos el Scanner.
	Scanner sc = new Scanner(System.in);
	
	//Le pedimos un numero al usuario.
	System.out.println("Escribe un numero:");
	
	//Leemos el numero del teclado.
	num = sc.nextInt();
	
	//Damos el resultado.
	System.out.println("Tu numero es: " + num);
	
	//Cierre.
	sc.close();

	}

}
