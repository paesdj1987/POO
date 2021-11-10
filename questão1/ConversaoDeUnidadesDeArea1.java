package questão1_letraA_prova;

public class ConversaoDeUnidadesDeArea1 {

	
	public static double MetroParaPeQuadrado(double qtd) {
		return qtd * 10.76;
	}

	public static double PeQuadradoParaCentimentro(double qtd) {
		return qtd * 929;
	}

	public static double MilhaParaAcre(double qtd) {
		return qtd * 640;
	}

	public static double AcreParaPeQuadrado(double qtd) {
		return qtd * 43560.0;
	}
	
	public static double MetroParaAcre(double qtd) {
		return (qtd*78125)/316160658;
	}

	public static double MetroParaCentimetro(double qtd) {
		return qtd * 10000.0;
	}

}
