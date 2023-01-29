package Aula_09;

public class Aula_09 {

	public static void main(String[] args) {
		
		// vetor de pessoas
		Pessoa p[] = new Pessoa[2];
		
		// vetor de livros
		Livro l[] = new Livro[3];
		
		// Criando objetos de pessoas
		p[0] = new Pessoa("pedro", 27, "M");
		p[1] = new Pessoa("Renata", 40, "F");
		
		// Criando objetos de livros
		l[0] = new Livro("Mecanismos de defesa do ego", "Pether Gay", 800, p[0]);
		l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
		l[2] = new Livro("A Riqueza das nações", "Adan Smith", 672, p[0]);
		
		// Abrindo o livro para ver os detalhes
		l[0].abrir(); l[0].folear(42);
		
		// Conferindo os detalhes
		System.out.print(l[0].detalhes());
		
		// Pessoas fazendo aniversário
		p[0].fazerAniversario();
		p[1].fazerAniversario();
		
		// Mostrando detalhes dos outros livros
		l[1].abrir(); l[2].abrir();
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
		
	}

}
