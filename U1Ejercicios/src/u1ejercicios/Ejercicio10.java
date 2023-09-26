package u1ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Creamos la constante IVA.
		final double IVA = 0.21;
		
		//Declaramos la variable donde guardar el precio.
		double prec;
		
		//Declaramos la variable donde guardar el precio final.
		double precf;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos un precio al usuario.
		System.out.println("Introduzca el precio: ");
		
		//Leemos el precio del teclado.
		prec = sc.nextDouble();
		
		//Realizamos las intrucciones para calcular el precio final.
		precf = prec * IVA + prec;
		
		//Damos el resultado.
		System.out.println("Precio final: " + precf);
		
		//Cierre
		sc.close();
		
		
		
	}

}
