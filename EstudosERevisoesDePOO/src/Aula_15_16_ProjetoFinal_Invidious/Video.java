package Aula_15_16_ProjetoFinal_Invidious;

public class Video implements AcoesVideo {
	// Atributos
	private String titulo;
	private int avaliacao, views, curtidas;
	private boolean reproduzindo;
	int nota;
	
	 
	
	// Constructor
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
		
	
	// Sobrescrição de métodos abstratos da interface
	@Override
	public void play() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void darLike() {
		this.curtidas += 1;
	}
	
		
	@Override
	public String toString() {
		return "\n\n ~~> Video <~~ \n\nTítulo: " + titulo + "\nAvaliacao: " + this.avaliacao + "\nViews: " + views + "\n Avaliação média: " + this.nota +"\n Curtidas: " + curtidas
				+ "\nReproduzindo? " + reproduzindo + "\n\n";
	}

	// getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
		if (this.views > 0) {
			nota = (this.avaliacao * (this.views - 1) + avaliacao) / this.views;
		} else {
			 nota = avaliacao;
		}
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

}
