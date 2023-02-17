package Aula_15_16_ProjetoFinal_Invidious;

public abstract class Pessoa {
	// Atributos
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	
	
	// Métodos especiais
	// Constructor
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nExperiencia: " + experiencia;
	}
	
	
	

	
	
}
