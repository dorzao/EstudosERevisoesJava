/*  2) Crie um nova classe: “Caso2.java” e utilize como base o algoritmo do estudo de caso 1 e declare
	variáveis:
	a) para o nome de uma agência de veículos;
	b) o modelo do veiculo;
	c) a cor do veículo;
	•
	Atribua valores as variáveis e faça a impressão no console
	
	Bootcamp Itaú / Gama Academy
	Turma 4
	Aluno: Pedro Henrique
  
 */
public class Caso2 {

	public static void main(String[] args) {
		//Reaproveitando a saída do caso:
		System.out.printf("%s%n%s%n%n", "Olá serumaninho! ", "Como tu estás?! ");
		
		// Declaração das variáveis
		String agencia = "Átlas Carros"; //Gostaria eu de usar um scanner mas, declararei como a instrução manda.
		String modelo_veiculo = "Celta", cor_veiculo = "Vermelha";
		
		// Saída dos dados da Agênca
		System.out.printf("%s%s%n", "Nome da Agência: ", agencia);
		System.out.printf("%s%s%n", "Modelo do Veículo: ", modelo_veiculo);
		System.out.printf("%s%s%n%n", "Cor do Veículo: ", cor_veiculo);
		
	}

}
