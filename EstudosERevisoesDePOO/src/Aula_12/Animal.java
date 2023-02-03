package Aula_12;

public abstract class Animal {
	
	// Atributos
	private float peso;
	private int idade, membros;
	private String categoria, classeAtual;
	
	// Métodos abstratos
	public abstract void locomover ();
	public abstract void  alimentar();
	public abstract void emitirSom();
	
	public void apresentar() {
		System.out.println("========================================");
		System.out.println("         Apresentando "+this.getClass().getSimpleName());
		System.out.println("========================================");
		System.out.println("Nome: "+this.getClass().getSimpleName());
		System.out.println("Categoria: "+this.getClass().getSuperclass().getSimpleName());
		System.out.println("Peso: "+this.peso);
		System.out.println("Idade: "+this.idade);
		System.out.println("Número de membros: "+this.membros);
	}
	
	public void fecharApresentar() {
		System.out.println("========================================\n\n");

	}
	
	// Métodos especiais
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		this.categoria = this.getClass().getSuperclass().getSimpleName();
	}
	public String getClasseAtual() {
		return classeAtual;
	}
	public void setClasseAtual() {
		this.classeAtual = this.getClass().getSimpleName();
	}
	
	
}
