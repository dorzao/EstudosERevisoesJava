package Aula_07_08;

public class Lutador {
	// Declaração de atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float peso;
	private float altura;
	private String categoria;
	private int vitorias, empates, derrotas;
		
	// Método construtor (especial)
		public Lutador(
		String no,
		String na,
		int id,
		float pe,
		float al,
		int vit,
		int emp,
		int der
		) {
			this.nome = no;
			this.nacionalidade = na;
			this.idade = id;
			this.altura = al;
			this.setPeso(pe);
			this.vitorias = vit;
			this.empates = emp;
			this.derrotas = der;
				
		}
	
	// Métodos ganhar, empatar e perder
	public void apresentar() {
		System.out.printf("%n%s%s%n", "Nome do lutador: ", this.getNome());
		System.out.printf("%s%s%n", "Origem: ", this.getNacionalidade());
		System.out.printf("%d%s%n", this.getIdade(), " anos");
		System.out.printf("%.1f%s%n", this.getAltura(), "m de altura");
		System.out.printf("%s%.1f%s%n", "pesando ", this.getPeso(), "Kg ");
		System.out.printf("%s%s%n", "Categoria: ", this.getCategoria());
		System.out.printf("%s%d%n", "Ganhou: ", this.getVitorias());
		System.out.printf("%s%d%n", "Empatou: ", this.getEmpates());
		System.out.printf("%s%d%n%n", "Perdeu: ", this.getDerrotas());
	}
	
	public void status() {
		System.out.print("Nome: "+ this.getNome() +" | ");
		System.out.print("Categoria: "+ this.getCategoria() +" | ");
		System.out.print("vit: "+ this.getVitorias() +" | ");
		System.out.print("Emp: "+ this.getEmpates() +" | ");
		System.out.print("Der: "+ this.getDerrotas() +"\n\n");

	}
	
	public void ganhar() {
		setVitorias(getVitorias() + 1);
	}
	
	public void empatar() {
		setEmpates(getEmpates() + 1);
	}
	
	public void perder() {
		setDerrotas(getDerrotas() + 1);
	}
	
	
	// Métodos get e set (especiais)
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
		
		
	}

	public void setCategoria() {
		if (peso < 52.2f) {
			this.categoria = "inválida";
		} else if (this.peso < 70.3f) {
			this.categoria = "leve";
		} else if (this.peso < 83.9) {
			this.categoria = "médio";
		} else if (this.peso < 120.2) {
			this.categoria = "pesado";
		} else {
			this.categoria = "inválido";
		}
	}
	public String getCategoria() {
		return this.categoria;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}

	
	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

}
