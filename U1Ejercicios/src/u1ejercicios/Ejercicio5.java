package u1ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaramos la variable del radio, la declaramos float porque puede ser decimal.
		float rad;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Titulo del ejercicio.
		System.out.println("Calcula la longitud y el área de una circunferencia");
		
		//Espacio de separación.
		System.out.println();
		
		//Le pedimos al usuario que escriba el radio de la circunferencia.
		System.out.println("Escribe el radio de la circunferencia:" );
		
		//Leemos el radio en el teclado.
		rad = sc.nextFloat();
		
		//Damos el resultado de la longitud junto con las instrucciones (Usamos "Math.PI" para introducir el valor de PI).
		System.out.println("La longitud seria: " + 2 * Math.PI * rad);
		
		//Damos el resultado del area junto con las instrucciones.
		System.out.println("El area seria: " + Math.PI * Math.pow(rad, 2));
		
		//Cierre	
		sc.close();

	}

}
