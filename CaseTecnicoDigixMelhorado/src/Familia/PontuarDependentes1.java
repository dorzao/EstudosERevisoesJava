package Familia;

// Strategy Context de pontuação por dependentes 1
public class PontuarDependentes1 implements Pontuador {

	@Override
	public int pontuar(int dependentes, int pontos) {
		if (dependentes > 2) {
			return pontos;
		}
		return 0;
	}

	@Override
	public int pontuar(double renda, int pontos) {
		// TODO Auto-generated method stub
		return 0;
	}

}
