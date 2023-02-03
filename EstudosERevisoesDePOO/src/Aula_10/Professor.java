package Aula_10;

public class Professor extends Pessoa {
	
	// Atributos específicos de professor
	private String especialidade;
	private float salario;
		
	// Método específico
	public void receberAumento(float aumento) {
		System.out.println(this.getNome()+" recebeu um aumento de R$ "+aumento);
		this.setSalario(this.salario + aumento);
	}
	
	
	// Métodos especiais
	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
		System.out.println("A especialidade de "+this.getNome()+" é de "+this.getEspecialidade());
	}

	public float getSalario() {
		return this.salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
		System.out.println("Agora o salário de "+this.getNome()+" é de: R$ "+this.getSalario());
	}
	
	
	
}
