package Aula_12;

public class Peixe extends Animal {
	// Atributo específico
	private String corDaEscama;
	
	// Método Comum
	public void fazerBolhas() {
		System.out.println("Fazendo bolhas...");
	}
	
	// Métodos especiais
	
	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println("Cor da escama: "+this.getCorDaEscama());
	}
	
	@Override
	public void locomover() {
		System.out.println("Se locomove nadando.");
	}

	@Override
	public void alimentar() {
		System.out.println("Se alimenta de petíscos do mar.");

	}

	@Override
	public void emitirSom() {
		System.out.println("Emite som de peixe.");

	}

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

}
