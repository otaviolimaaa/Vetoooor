package vetor;
import java.util.ArrayList;
import java.util.Scanner;
public class Atv5 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
		ArrayList<String> ingredientes= new ArrayList<>();
		ingredientes.add("Açai");
		ingredientes.add("Leite Condensado");
		ingredientes.add("Caqui");
		ingredientes.add("Maracuja");
		ingredientes.add("Aveia");
		ingredientes.add("Nutella");
		System.out.println("Ingredientes açai");
		System.out.println("-----------------");
		for (String ing : ingredientes) {
		System.out.println(ing);
		}
		System.out.println("-----------------");
		System.out.println("O que deseja fazer? :");
		System.out.println("[1] Adicionar ingrediente ");
		System.out.println("[2] Remover ingrediente ");
		System.out.println("[3] Manter ");
		int opcao = Ler.nextInt();
		switch (opcao) {
		case 1:
		System.out.println("Qual ingrediente deseja adicionar: ");
		ingredientes.add(Ler.next());
		System.out.println("Nova lista de ingredientes: "+ingredientes);
		break;
		case 2:
		System.out.println("Qual ingrediente ddeseja remover [0 - 6]");
		ingredientes.remove(Ler.nextInt());
		System.out.println("Nova lista de ingredientes: "+ingredientes);
		break;
		default:
		System.out.println("Lista de ingredientes : "+ingredientes);
		}
		Ler.close();
		}
			

	}


