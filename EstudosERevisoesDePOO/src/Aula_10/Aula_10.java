package Aula_10;

public class Aula_10 {

	public static void main(String[] args) {
		// Instanciando objetos
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		// Definindo nomes para teste
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");;
		p4.setNome("Fabiana");
		
		// Definindo idade
		p1.setIdade(27);
		p2.setIdade(18);
		
		// Definindo sexo
		p1.setSexo("Masculino");
		p4.setSexo("Feminino");
		
		// Fazendo aniversários
		p1.fazerAniversario();
		p2.fazerAniversario();
		p4.fazerAniversario(); // excessão proposital
		
		// Idade da funcionária e do professor
		p3.setIdade(40);
		p4.setIdade(29);
		
		// Aniversário professor e funcionário
		p3.fazerAniversario();
		p4.fazerAniversario();
		
		// outros testes
		p2.setCurso("Informática"); // excessão proposital
		p3.setSalario(325.75f);
		p3.receberAumento(1200.42f);
		p4.setSetor("Estoque");
		p2.setMatricula(1234);
		p2.setCurso("Informática - TI");
		p2.cancelarMatricula();
		p2.setMatricula(0);
		
		
		// Mostrando tString da classe mãe/progenitora/superclasse
		System.out.println(
		"\n\n" + p1.toString()+ "\n" +
		p2.toString()+  "\n" +
		p3.toString()+ "\n" +
		p4.toString() + "\n"
		);
	}

}
