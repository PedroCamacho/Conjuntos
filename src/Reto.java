import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		HashSet <Integer> conjunto = new HashSet <> ();
		int num;
		
		//Proceso
		System.out.println("Introduzca los números:");
		num = sc.nextInt();
		while (!conjunto.contains(num)) {
			conjunto.add(num);
			num = sc.nextInt();
		} 
				
		//Salida
		System.out.print("Los números introducidos son: ");
		for (Integer n : conjunto) {
			System.out.print(n + " ");
		}
		
	}
}
