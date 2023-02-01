package Aula_11;

public class Aula_11 {

	public static void main(String[] args) {
		
		// tentando instanciar objeto de classe abstrata
		// Pessoa p = new Pessoa(); -> erro proposital, não se pode instanciar objetos de classes abstratas.
		
		// instanciando um obbjeto por uma classe folha por meio de herança pobre
		Visitante v1 = new Visitante();
		
		v1.setNome("Pedro");
		v1.setIdade(27);
		v1.setSexo("Masculino");
		System.out.println(v1.toString()+"\n\n");
		
		// instanciando classe aluno
		Aluno a1 = new Aluno();
		
		a1.setNome("Maria");
		a1.setIdade(66);
		a1.setSexo("Feminino");
		// Excessões propositais
		a1.setCurso("Gastronomia");
		a1.pagarMensalidade();
		// Saindo das excessões
		a1.setMatricula(442839);
		a1.setCurso("Gastronomia");
		a1.pagarMensalidade();
		
		// instanciando um objeto bolsista descendente de pessoa e filho de aluno
		Bolsista b1 = new Bolsista();
		b1.setNome("Ricardo");
		b1.setBolsa(52.31f);
		b1.pagarMensalidade();
		
		
	}

}
