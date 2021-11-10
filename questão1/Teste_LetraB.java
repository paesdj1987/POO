package questão1_letraA_prova;

import java.util.Locale;
import java.util.Scanner;



public class Teste_LetraB {

	static double resultado; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a área do campo de futebol em metros quadrados: ");
		double x = sc.nextDouble();
		
		resultado = ConversaoDeUnidadesDeArea1.MetroParaPeQuadrado(x);
		System.out.println(x + " " + "Metro quadrado = " + resultado + "  " + "Pés Quadrado");
		
		resultado = ConversaoDeUnidadesDeArea1.MetroParaAcre(x);
		System.out.println(x + " " + "Metro quadrado = " + resultado + "  " + "Acres");
		
		resultado = ConversaoDeUnidadesDeArea1.MetroParaCentimetro(x);
		System.out.println(x + " " + "Metro quadrado = " + resultado + "  " + "Centímetros Quadrados");
		
	
	}

}
