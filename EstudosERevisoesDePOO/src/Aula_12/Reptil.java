package Aula_12;

public class Reptil extends Animal {
	// Atrbuto especial
	private String corDaEscama;
	
	
	// Métodos especiais
	@Override
	public void locomover() {
		System.out.println("Rasteijando");
	}

	@Override
	public void alimentar() {
		System.out.println("Se alimenta de vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Sons de Répteis.");
	}
	
	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println("cor da Escama: "+this.getCorDaEscama());
	}
	
	
	// Get e set

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

}
