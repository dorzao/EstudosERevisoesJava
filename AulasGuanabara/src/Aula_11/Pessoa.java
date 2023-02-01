package Aula_11;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversário() {
		this.idade += 1;
		System.out.println(this.getNome()+" Fez aniversário. ");
	}
	
	// getters e setters
	
	
	
	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("O nome definido foi "+this.getNome());
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		System.out.println("A idade de "+this.nome+" é de "+this.idade+" anos.");
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
		System.out.println("O sexo de "+this.getNome()+" foi definido como "+this.sexo);
	}
	
	
}
