import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo2 {

	public static void main(String[] args) {
		Collection <String>  fruta = new HashSet <>();
		fruta.addAll(Arrays.asList("Plátano","Mazana", "Naranja","Pera"));
		System.out.println("Orden de la fruta: " + fruta);
		
		Set <String> conjuntoB = new HashSet <>(Arrays.asList("Luis","Ana", "Inés", "Beto"));
		HashSet <String> conjuntoN = new HashSet <> (5);
		conjuntoN.add("Ana");
		conjuntoN.add("Beto");
		conjuntoN.add("Pedro");
		conjuntoN.add("Pedro");
		
		conjuntoB.retainAll(conjuntoN);
		System.out.println("Conjunto intersección B y N: " + conjuntoB);
		
		
		
	}

}
