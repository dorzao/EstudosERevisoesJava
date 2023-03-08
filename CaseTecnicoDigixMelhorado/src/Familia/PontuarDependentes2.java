package Familia;

// Strategy context de pontuação por dependentes 2
public class PontuarDependentes2 implements Pontuador {

	@Override
	public int pontuar(int dependentes, int pontos) {
		if (dependentes < 3 && dependentes > 0)  {
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
