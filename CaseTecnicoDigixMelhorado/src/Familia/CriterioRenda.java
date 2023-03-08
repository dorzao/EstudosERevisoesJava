package Familia;

// Strategy concret de renda
public class CriterioRenda {
	public int pontuar(Familia familia) {
		int resultado = 0; 
		resultado += new PontuarRenda1().pontuar(familia.getRenda(), 5);
		resultado += new PontuarRenda2().pontuar(familia.getRenda(), 3);
		
		if (resultado > 0) {}
		System.out.println("Recebeu "+resultado+" pontos no critério de renda.");
		
		return resultado;
	} 
}
