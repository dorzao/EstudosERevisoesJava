/*
 5) Crie uma nova classe: “Caso5.java” para calcular a média de notas para os alunos. Considere as
seguintes variáveis:
a) Nome do aluno;
b) Nota1;
c) Nota2;
d) Nota3;
e) Nota 4;
f) Média;
•
Atribua valores as variáveis e calcule a média da seguinte forma:
Média = Soma das notas / 4;
Faça o teste lógico e indique a saída no console conforme os seguintes critérios:
a) Se o aluno obtive média menor que 5 está reprovado;
b) Se o aluno obtive média entre 5 e 7 está de recuperação;
c) Se o aluno obtiver média maior que 7 então está aprovado.
•
Importante imprimir no console o nome do aluno, suas notas e média e também o
resultado conforme os critérios.

Bootcamp Itaú / Gama Academy
Turma 4
Aluno: Pedro Henrique
 */
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		// Declaração das variáveis necessárias
		String nome_aluno, situacao;
		float nota1, nota2, nota3, nota4, media;
		
		// Declaração e nomeação do scanner
		Scanner coletor = new Scanner(System.in);
		
		// Saídas para coletagem de dados
		System.out.println("Qual o nome do(a) aluno(a)? ");
		nome_aluno = coletor.nextLine();
		System.out.println("Qual a sua primeira nota? ");
		nota1 = coletor.nextFloat();
		System.out.println("Qual a sua segunda nota? ");
		nota2 = coletor.nextFloat();
		System.out.println("Qual a sua terceira nota? ");
		nota3 = coletor.nextFloat();
		System.out.println("Qual a sua quarta nota? ");
		nota4 = coletor.nextFloat();
		
		// Calculando a média
		media = (nota1 + nota2 + nota3 + nota4)/4;
				
		// Estabelecendo situação por meio de estrutura condicional
		if (media < 5) {
			situacao = "reprovado(a)";
		} else if (media <= 7) {
			situacao = "em recuperação";
		} else {
			situacao = "aprovado(a)";
		}
		// usei if, else if e else em cima mas se quser, faço com 3 ifs e com operadores lógicos.
		
		// Saída do resultado final
		System.out.println("\n Exibindo resultado final: \n\n");
		System.out.printf("%s%s%n", "Nome do aluno: ", nome_aluno);
		System.out.printf("%s%.1f%n", "Resultado da primeira nota: ", nota1);
		System.out.printf("%s%.1f%n", "Resultado da segunda nota: ", nota2);
		System.out.printf("%s%.1f%n", "Resultado da terceira nota: ", nota3);
		System.out.printf("%s%.1f%n", "Resultado da quarta nota: ", nota4);
		System.out.printf("%s%s%s%.1f%s%s%s%n", "A média final de ", nome_aluno, " foi de ", media, "; e ele(a) está ", situacao, ". ");
				
		// Finalização do programa
		System.out.printf("\n Finalizando o programa");
		

	}

}
