package Aula_12;

public class Cachorro extends Mamifero {
	private String raca;
	
	@Override
	public void emitirSom () {
		System.out.println(this.getClass().getSimpleName()+" emite latidos.");
	}
	
	@Override
	public void apresentar () {
		super.apresentar();
		System.out.println("Raça: "+this.getRaca());
	}
	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
