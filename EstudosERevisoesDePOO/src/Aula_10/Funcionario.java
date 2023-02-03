package Aula_10;

public class Funcionario extends Pessoa {
	
	// Atributos 
	private String setor;
	private boolean trabalhando;
	
	// Método comum
	public void mudarTrabalho() {
		this.trabalhando = !this.trabalhando;
	}
	
	
	// getters e setters
	public String getSetor() {
		return this.setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	System.out.println("O setor de "+this.getNome()+" é "+this.getSetor());
	}

	public boolean isTrabalhando() {
		return this.trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
	
	
}
