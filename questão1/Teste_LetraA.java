package questão1_letraA_prova;

public class Teste_LetraA {
	
	static double result1; 
	static double result2; 
	static double result3;
	static double result4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		result1 = ConversaoDeUnidadesDeArea1.MetroParaPeQuadrado(1);
		System.out.println("1 Metro quadrado = " + result1 + "  " + "Pés Quadrado");
		
		result2 = ConversaoDeUnidadesDeArea1.PeQuadradoParaCentimentro(1);
		System.out.println("1 Pé quadrado = " + result2 + "  " + "Centrimentos Quadrados");
		
		result3 = ConversaoDeUnidadesDeArea1.MilhaParaAcre(1);
		System.out.println("1 Milha = " + result3 + "  " + "Acres");
		
		result4 = ConversaoDeUnidadesDeArea1.AcreParaPeQuadrado(1);
		System.out.println("1 Acre = " + result4 + "  " + "Pés Quadrados");
		

	}

}
