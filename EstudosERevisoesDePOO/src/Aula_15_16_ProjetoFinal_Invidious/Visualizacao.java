package Aula_15_16_ProjetoFinal_Invidious;

public class Visualizacao {
	
	//Atributos
	private Usuario espectador;
	private Video filme;
	
	// Sobrecarga do método avaliar
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar (int valor) {
		this.filme.setAvaliacao(valor);
	}
	
	public void avaliar (float porcentagem) {
		if (porcentagem <= 20) {
			this.filme.setAvaliacao(3);
		} else if (porcentagem <= 60) {
			this.filme.setAvaliacao(5);
		}  else if (porcentagem <= 90) {
			this.filme.setAvaliacao(8);
		} else {
			this.filme.setAvaliacao(10);
		}
	}
	
	
	// Métodos especiais
	// Constructor
	boolean criado = false;
	public Visualizacao(Usuario espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.filme.setViews(this.filme.getViews() + 1);
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
	}
	
	
	// getters e setters
	public Usuario getEspectador() {
		return espectador;
	}

	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	String divisoria = "\n====================\n";
	@Override
	public String toString() {
		return divisoria + espectador +  filme + divisoria;
	}
	
	
	
	
}
