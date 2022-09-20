package pruebas;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;

		System.out.println("Dime un numero: ");

		numero1 = sc.nextInt();

		System.out.println("Dime otro numero: ");

		numero2 = sc.nextInt();

		
		System.out.println("la suma es: " + (numero1 + numero2));
		
		if ((numero1 % 2) == 0) {
			System.out.println("numero1 si es par");
		}
		else {
			System.out.println("numero1 no es par");
		}
//otra prueba 
		if (numero1 > numero2) {
			System.out.println("numrero1 es mayor que el numero2");
		}
		else {
			System.out.println("numero 2 es mayor que numero 1");
		}
			
	}

}
