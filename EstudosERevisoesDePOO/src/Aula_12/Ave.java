package Aula_12;

public class Ave extends Animal {
	// Atributo
	private String corDasPenas;
	
	// Método
	public void fazerNinho() {
		System.out.println("Ave fez o ninho.");
	}
	
	
	// Métodos especiais
	
	@Override
	public void locomover() {
		System.out.println("Se locomovem voando.");		
	}

	@Override
	public void alimentar() {
		System.out.println("Aves se alimentam com frutos.");
	}

	@Override
	public void emitirSom() {
		System.out.println("O som emitido das aves são os assobios.");
	}
	
	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println("Cor das penas: "+getCorDasPenas());
	}

	public String getCorDasPenas() {
		return corDasPenas;
	}

	public void setCorDasPenas(String corDasPenas) {
		this.corDasPenas = corDasPenas;
	}
}
