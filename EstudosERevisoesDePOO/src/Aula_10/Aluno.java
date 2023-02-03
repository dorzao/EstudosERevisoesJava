package Aula_10;

public class Aluno extends Pessoa {
	
	// Atributos específicos de aluno
	private int matricula;
	private String curso;
	
	// Método comum
	public void cancelarMatricula() {
		this.matricula = 0;
		System.out.println("Matrícula de "+this.getNome()+" cancelada com sucesso");
	}
	
	// Métodos especiais
		
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getSexo()=" + getSexo() + "]";
	}

	public int getMatricula() {
		return this.matricula;
	}
	

	public void setMatricula(int matricula) {
		if (matricula > 0) {
			this.matricula = matricula;
			System.out.println("A matricula de "+this.getNome()+" é: "+this.getMatricula());
		} else {
			System.out.println("Insira uma matrícula válida para "+this.getNome());
		}

	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		if (this.matricula > 0) {
			this.curso = curso;
			System.out.println(this.getNome()+" Está matriculada no curso de "+this.getCurso());
		} else {
			System.out.println("Efetue a matrícula de "+this.getNome()+" antes de definir o curso. ");
		}
	}
	
	
	
	
	
}
