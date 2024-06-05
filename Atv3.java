package vetor;
import java.util.ArrayList;
public class Atv3 {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList <String>();
		frutas.add("Laranja");
		frutas.add("Cereja");
		frutas.add("jabuticaba");
		frutas.add("Amora");
		frutas.add("Pessego");		
		frutas.add("Abacaxi");
		frutas.add("Abacate");
		frutas.add("Caqui");
		frutas.add("Mamão");
		frutas.add("Morango");
		frutas.add("uva");
		System.out.println(frutas);
		
		frutas.remove(0);
		frutas.remove(1);
		frutas.remove(2);
		frutas.remove(3);
		frutas.remove(4);
		System.out.println(frutas);
		System.out.println(frutas.size());
	}

}
