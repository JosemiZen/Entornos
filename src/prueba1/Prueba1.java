package prueba1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prueba1 {

	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, suma;
		System.out.println("Ingrese n�mero: ");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Deme otro n�mero: ");
		num2 = Integer.parseInt(lectura.readLine());
		suma = num1 + num2;
		System.out.println("La suma es " + suma);
		
		//cambio 2

	}

}
