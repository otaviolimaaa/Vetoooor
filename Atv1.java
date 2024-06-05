package vetor;
import java.util.ArrayList;

public class Atv1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int soma = 0;
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		for (int numero: numeros) {
			if	(numero %2 ==0) {
				soma += numero;
			}
		}
		
		System.out.println(soma);
	}
}