package Familia;

// Strategy interface de pontuação
public interface Pontuador {
	
	public int pontuar (int dependentes, int pontos);
	public int pontuar(double renda, int pontos);
}
