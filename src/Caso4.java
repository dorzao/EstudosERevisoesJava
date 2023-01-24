/*
 4) Crie uma nova classe: “Caso4.java”
estudo de caso 3.
Bootcamp Itaú / Gama Academy
Turma 4
Aluno: Pedro Henrique
 */
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		// Reescrevendo o Caso 3 com scanner
		
		// Gerando e atribuindo nome ao scanner
		Scanner leia = new Scanner(System.in);
		
		// Declaração de variáveis
		String agencia, modelo, cor;
		float valor_carro, taxa_juros;
		int parcelas;
		
		// Saída de Boas vindas
		System.out.println("Bem-vindo ao sistema de cadastro agencias e modelos. \n\n");
		
		// Saída referenciadas para entrada/coleta de dados
		System.out.println("Qual o nome da Agência? ");
		agencia = leia.nextLine();
		System.out.println("Modelo do veículo: ");
		modelo = leia.nextLine();
		System.out.println("Qual a cor do Veículo: ");
		cor = leia.nextLine();
		System.out.println("Qual o valor do Veículo: R$ ");
		valor_carro = leia.nextFloat();
		System.out.println("Qual a taxa percentual de juros mensal para este veículo: ");
		taxa_juros = leia.nextFloat();
		System.out.println("Número total de parcelas: ");
		parcelas = leia.nextInt();
				
		// Saída após o cadastro feito
		System.out.println("\nDetalhes do cadastro realizado: \n\n");
		System.out.printf("%s%s%n", "Nome da agência: ", agencia);
		System.out.printf("%s%s%n", "Modelo do Veículo: ", modelo);
		System.out.printf("%s%s%n", "Cor do Veículo: ", cor);
		System.out.printf("%s%.2f%n", "Valor do Veículo à vista: R$ ", valor_carro);
		System.out.printf("%s%.0f%s%n", "Taxa de juros mensal: ", taxa_juros, "% ");
		System.out.printf("%s%d%n", "Total de parcelas: ", parcelas);
		System.out.printf("%s%.2f%n", "Valor de cada parcela: R$ ", valor_carro * (1 + (taxa_juros / 100))/parcelas);
		// Bonus
		System.out.printf("%s%.2f%n", "Valor total do veículo (com juros): R$ ", valor_carro * (1 + (taxa_juros / 100)));
		System.out.printf("%s%.2f%n", "Economia ao comprar à vista: R$ ", valor_carro * (taxa_juros / 100));
		
		// Saída do encerramento do programa
		System.out.printf("\n Fim do programa!");
		

	}

}
