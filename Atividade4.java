package vetor;
import java.util.ArrayList;
public class Atividade4 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma=0;
		numeros.add(5);
		numeros.add(15);
		numeros.add(8);
		numeros.add(25);
		numeros.add(10);
		
		for (int numero : numeros) {
			soma = soma + numero;
		}
		System.out.println(soma);
		}

}
