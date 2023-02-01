package Aula_11;

public class Aluno extends Pessoa {
	
	//atributos de aluno
	private int matricula = 0;
	private String curso;
	
	// Metodo comum
	public void pagarMensalidade() {
		if (this.matricula > 0 && this.curso != null) {
			System.out.println("Pagando a mensalidade de "+this.getNome());
			
		} else {
			System.out.println("Só é possível pagar a matrícula de"+this.getNome()+
								" após número de matrícula válido e curso selecionado.");
		}
	}
	
	
	
	// Métodos especiais
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if (matricula > 0) {
			this.matricula = matricula;
			System.out.println("Matricula "+this.matricula+" definida para o aluno "+this.getNome());
		} else {
			System.out.println("Insira um número válido para efetuar a matrícula de "+this.getNome());
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if (this.matricula > 0) {
			this.curso = curso;
			System.out.println(this.getNome()+" Matriculado(a) no curso "+this.curso+" com sucesso.");
		} else {
			System.out.println("Efetue a matrícula de "+this.getNome()+" antes de cadastrar o curso... ");
		}
	}
	
	
	
	
	
	
}
