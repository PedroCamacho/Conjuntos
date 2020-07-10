import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicializaci�n
		Scanner sc = new Scanner(System.in);
		HashSet <Integer> conjunto = new HashSet <> ();
		int num;
		
		//Proceso
		System.out.println("Introduzca los n�meros:");
		num = sc.nextInt();
		while (!conjunto.contains(num)) {
			conjunto.add(num);
			num = sc.nextInt();
		} 
				
		//Salida
		System.out.print("Los n�meros introducidos son: ");
		for (Integer n : conjunto) {
			System.out.print(n + " ");
		}
		
	}
}
