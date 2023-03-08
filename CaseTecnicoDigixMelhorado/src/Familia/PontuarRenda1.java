package Familia;

// Strategy context de pontuação por renda 1
public class PontuarRenda1 implements Pontuador{

	@Override
	public int pontuar(int dependentes, int pontos) {
		
		return 0;
	}

	@Override
	public int pontuar(double renda, int pontos) {
		if (renda <= 900) {
			return pontos;
		}
		return 0;
	}

}
