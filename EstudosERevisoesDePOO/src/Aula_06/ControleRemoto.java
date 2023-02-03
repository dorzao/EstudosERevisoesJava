package Aula_06;

//implementando a interface do controlador no controle remoto
public class ControleRemoto implements Controlador {
	
	// Declarando atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Criando métodos especiais (construtor e get e set)
	
	//construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	//getters e setters privados para testar a interface
	private int getVolume () {
		return this.volume;
	}
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private boolean getLigado () {
		return this.ligado;
	}
	private void setLigado (boolean l) {
		this.ligado = l;
	}
	
	private boolean getTocando () {
		return this.tocando;
	}
	private void setTocando (boolean t) {
		this.tocando = t;
	}

	
	// A IDE recriou automaticamente os métodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
		System.out.println("\n Ligando \n");
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		System.out.println("\n Desligando \n");
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? "+this.getLigado());
		if (this.getLigado()) {
			System.out.println("Está tocando? "+this.getTocando());
			System.out.print("Volume: "+this.getVolume());
			for (int i = 0; i <= this.getVolume(); i += 1) {
				System.out.print("=");
			}
		}
		System.out.println("\n\n");
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("\nFechando menu...\n\n");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado() && this.getVolume() < 100) {
			this.setVolume(this.getVolume()+1);
			System.out.println("Volume + 1");
		} else {
			System.out.println("Operação inválida! ");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(this.getVolume() - 1);
			System.out.println("Volume - 1");
		}else {
			System.out.println("Operação inválida! ");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("\nAtivando mudo\n");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
			System.out.println("\nSaindo do modo mudo\n");
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
			System.out.println("\nReproduzindo...\n");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
			System.out.println("\n Pausado \n");
		}
	}
	
	
	
	
	
}
