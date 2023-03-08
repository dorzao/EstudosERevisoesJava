package Familia;

// Strategy concret de critério de pontuação por dependentes
public class CriterioDependentes {
	
	public int pontuar (Familia familia) {
		int resultado = 0;
		
		// Aqui estão as possibilidades de pontuação por dependentes, e abaixo, devem ser adicionadas futuras implementações 
		resultado += new PontuarDependentes1().pontuar(familia.getDependentes(), 3);
		resultado += new PontuarDependentes2().pontuar(familia.getDependentes(), 2);
		if (resultado > 0) {}
		System.out.println("Recebeu "+resultado+" pontos no critério de dependentes.");
		
		return resultado;
	}
}
