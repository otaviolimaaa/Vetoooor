package vetor;
import java.util.ArrayList;
import java.util.Scanner;
public class Atv4 {


	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<String> carros = new ArrayList <String>();
		int a;
		
		carros.add("jetta");
		carros.add("civic");
		carros.add("Range Rover");
		carros.add("Creta");
		carros.add("s10");		
		carros.add("gol");
		carros.add("mustang");
		carros.add("hb20");
		carros.add("hilux");
		carros.add("Compass");
		carros.add("sw4");
		System.out.println(carros);
		
		System.out.println("Qual carro dos 10 voce gostaria de ter?Informe de 0 a 9");
        a = ler.nextInt();
        System.out.println(carros.get(a));
	    ler.close();

	}}

