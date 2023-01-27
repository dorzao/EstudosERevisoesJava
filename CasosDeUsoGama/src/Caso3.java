/*
 3) Crie uma nova classe: “Caso3.java” e utilizando como base o algoritmo do estudo de caso 2 inclua
a seguintes variáveis:
a) Valor do veículo;
b) Taxa de Juros;
c) Quantidade de prestações;
d) Valor da prestação;
• Atribuir valor do veículo, taxa de juros e quantidade de prestações;
• Para cálculo do valor da prestação acrescente a taxa de juros e dívida pela quantidade de
prestações informadas. Exemplo:
Valor da prestação = (valor do veículo * (1 + (taxa de juros / 100)) / Qtde de prestações
•
Inclua os novos campos na saída do console, fazendo a formatação dos números. Dica:
printf.
Bootcamp Itaú / Gama Academy
Turma 4
Aluno: Pedro Henrique
 */
public class Caso3 {

	public static void main(String[] args) {
		//Reaproveitando a saída do caso:
				
		// Declaração das variáveis
		String agencia = "Átlas Carros"; //Gostaria eu de usar um scanner mas, declararei como a instrução manda.
		String modelo_veiculo = "Celta", cor_veiculo = "Vermelha";
		int parcelas = 24;
		float taxa_juros = 4, valor_carro = 15000, valor_total = valor_carro * (1 + (taxa_juros / 100)), economia = valor_total - valor_carro; 
				
		// Saída dos dados da Agênca
		System.out.printf("%s%n%s%n%n", "Olá serumaninho! ", "Como tu estás?! ");
		System.out.printf("%s%s%n", "Nome da Agência: ", agencia);
		System.out.printf("%s%s%n", "Modelo do veículo: ", modelo_veiculo);
		System.out.printf("%s%s%n", "Cor do veículo: ", cor_veiculo);
		System.out.printf("%s%.2f%n", "Valor do veículo à vista: R$ ", valor_carro);
		System.out.printf("%s%.0f%s%n", "Taxa de juros mensal: ", taxa_juros, "% ");
		System.out.printf("%s%d%n", "Número de prestações: ", parcelas);
		System.out.printf("%s%.2f%n", "Valor da prestação: R$ ", valor_carro * (1 + (taxa_juros / 100))/ parcelas );
		//bonus
		System.out.printf("%s%.2f%n", "Valor total com o juros: R$ ", valor_total);
		System.out.printf("%s%.2f%n", "Economia ao compra à vista: R$ ", economia);
		
	}

}
