package Aula_12;

public class Mamifero extends Animal  {
	// Atributo
	private String corDoPelo;
		
	// Sobrescrevendo métodos da classe mãe -> polimorfismo
	@Override
	public void locomover() {
		System.out.println(this.getClass().getSimpleName()+" que é um "+this.getClass().getSuperclass().getSimpleName()+", se locomove Correndo.");
	}

	@Override
	public void alimentar() {
		System.out.println(this.getClass().getSimpleName()+" se alimenta mamando.");
	}

	@Override
	public void emitirSom() {
		System.out.println(this.getClass().getSimpleName()+" emite som de mamífero. E é um "+this.getClass().getSuperclass().getSimpleName());

	}
	
	@Override
	public void apresentar () {
		super.apresentar();
		System.out.println("Cor do pelo: "+this.corDoPelo);
	} 

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}
	
	
	
	
	
}
