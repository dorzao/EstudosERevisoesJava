package Aula_10;

public class Pessoa {
	
	// Declaração de atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// Método comum
	public void fazerAniversario() {
		if (this.idade > 0) {
			System.out.println(this.getNome()+" fez aniversário.");
			this.setIdade(this.getIdade() + 1);
		} else {
			System.out.println("Defina uma idade para "+this.getNome()+" para poder fazer aniversário. ");
		}
		
	}
	
	// Métodos especiais
		
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("O Nome "+this.getNome()+" foi definido.");
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
			System.out.println("A idade de "+this.getNome()+" foi definida para "+this.getIdade()+" ano(s).");
		} else {
			System.out.println("A idade mínima a ser definida para "+this.getNome()+" é de 1 ano.");
		}
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
		System.out.println("O sexo de "+this.getNome()+" foi definida para "+this.getSexo());
	}
	
	
	
	
}
