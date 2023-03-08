package Familia;

// Strategy context de pontuação por renda 2
public class PontuarRenda2 implements Pontuador{

	@Override
	public int pontuar(int dependentes, int pontos) {
		
		return 0;
	}

	@Override
	public int pontuar(double renda, int pontos) {
		if (renda > 900 && renda < 1500) {
			return pontos;
		}
		return 0;
	}

}
