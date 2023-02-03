package Aula_09;

public class Pessoa {
	
	// Declaração de atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// Métodos simples
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
		System.out.println("\n" + this.getNome() + " fez aniversário e agora tem " + this.getIdade() + " anos.");
	}
	
	// Métodos especiais
	public Pessoa(String nome, int idade, String sexo) { // construtor
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		
	}
	
	// gets e sets 
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
	
}
