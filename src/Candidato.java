// importando bibliotecas necessárias.
import java.util.ArrayList;
import java.util.Scanner;

// Declarando a classe, definindo atributos
public class Candidato {
	Scanner leia_nomes = new Scanner(System.in);
	Scanner leia = new Scanner(System.in);
	int total_candidatos;
	ArrayList<String> nomes = new ArrayList<String>();
	ArrayList<String> escolaridades = new ArrayList<String>();
	ArrayList<Integer> idades = new ArrayList<Integer>();
	ArrayList<Integer> voto_individual = new ArrayList<Integer>();
	int escolha = -1, nulo = 0, votos = 0;
	
	void inicio() {
		// Saída de apresentação
		System.out.println("Sistema de candidatura da empresa XYZ \n");
		System.out.println("Deseja cadastrar um candidato[s/n]? ");
		String op = this.leia_nomes.nextLine();
		
		// Miniloop para entrada válida em caso de erro
		while(!op.equals("s") && !op.equals("n")) {
			System.out.println("Opção inválida, digite somente s para sim ou n para não.");
			op = this.leia_nomes.nextLine();
		}
		
		// Saída para o caso do usuário não querer cadastrar nnguém
		if (op.equals("n")){
			System.out.println("Sem candidatura não há a necessidade da votação.");
						
		} else {
			
			// Iniciando o método cadastro
			this.cadastro();
			
			// Iniciando o método de votação
			this.votacao();
						
		}
		
		// Saída final do programa
		System.out.println("Fim do programa");
	}
	
	void cadastro() {
		// instanciando a classe para puxar os atributos
		//Candidatos c = new Candidatos();
		
		// Sistema de cadastro criado com enquanto
		String op = "";
		while(!op.equals("n")) {
			System.out.println("Digite o nome do(a) candidato(a): ");
			this.nomes.add(this.leia_nomes.nextLine());
			System.out.println("Qual a escolaridade de "+this.nomes.get((this.nomes.size() - 1))+"? ");
			this.escolaridades.add(this.leia_nomes.nextLine());
			System.out.println("Qual a idade de "+this.nomes.get((this.nomes.size() -1))+"? ");
			this.idades.add(this.leia.nextInt());
			this.voto_individual.add(0);
			this.total_candidatos++;
			System.out.println("Deseja cadastrar um novo Candidato [s/n]? ");
			op = this.leia_nomes.nextLine();
			
			// Mini loop para validar seguimento
			while(!op.equals("s") && !op.equals("n")) {
				System.out.println("Opção inválida, digite somente s para sim ou n para não.");
				op = this.leia_nomes.nextLine();
				
			}
			

		} 
		// Saida final do sistem de cadastro
		System.out.println("Cadastro(s) finalizado(s)");
		
		
	}
	
	void votacao() {
		//Saida inicial do sistema de votação
		System.out.println("Iniciando votação! ");
				
		// Entrada de opção para computar os votos
		while (this.escolha != this.nomes.size()) {
			System.out.println("====================");
			System.out.println("Pressione o seu voto:  ");
			System.out.println("====================");
			for (int i = 0; i <= this.nomes.size() - 1; i++) {
				System.out.println(i+" - para votar em "+this.nomes.get(i)+". ");
			}
			System.out.println(this.nomes.size()+" - para sair.");
			System.out.println("Outros números - nulo.");
			System.out.println("====================");
			escolha = this.leia.nextInt();
			System.out.println("====================");
			
			// Condicional para resultado dos votos
			if (this.escolha < 0 || this.escolha > this.nomes.size()) {
				System.out.println("Voto nulo computado! ");
				this.nulo++;
				this.votos++;
			} else if (this.escolha == this.nomes.size()) {
				System.out.println("Saindo do sistema de votação");
			} else {
				System.out.println("Voto para "+this.nomes.get(this.escolha)+" computado. ");
				this.voto_individual.set(this.escolha, this.voto_individual.get(this.escolha) + 1);
				this.votos++;
			}
			System.out.println("====================");
		}
		
		if (this.votos > 0 && this.votos != this.nulo) {
			// Conversão de variáveis para poder fazer a porcentagem
			float ind, tot = this.votos;
			
			// Saída de dados com o resultado da votação
			System.out.println("Resultado da votação");
			System.out.println("====================");
			System.out.printf("%s%d%n", "Total de votos: ", this.votos);
			
			for (int i = 0; i <= this.nomes.size() - 1; i++) {
				ind = this.voto_individual.get(i);
				System.out.println("====================");
				System.out.printf("%s%s%n", "Nome do candidato: ", this.nomes.get(i));
				System.out.printf("%s%s%n", "Escolaridade: ", this.escolaridades.get(i));
				System.out.printf("%s%d%n", "Idade: ", this.idades.get(i));
				if (this.voto_individual.get(i) > 0) {
					System.out.printf("%s%d%n", "votos recebidos:", this.voto_individual.get(i));
					System.out.printf("%s%.1f%s%n", "Porcentagem do total de votos: ",ind / tot * 100, "% ");
				} else {
					System.out.println(this.nomes.get(i)+" não teve nenhum voto.");
				}
				
				System.out.println("====================");
			}
			if (nulo > 0) {
				System.out.println("Total de nulos: "+this.nulo);
				float nulof = nulo;
				System.out.printf("%s%.1f%s%n", "Porcentagem de nulos em relação ao total: ", nulof / tot * 100, "% ");
			} else {
				System.out.println("Não houveram votos nulos");
			}
		} else if (this.votos > 0 && this.votos == this.nulo) {
			System.out.println("A seletiva teve "+this.votos+" votos, e todos foram nulos.");
		} else {
			System.out.println("A seleção até teve "+this.nomes.size()+" candidato(as) mas, os recrutadores não gostaram de nenhum.");
		}
		
		System.out.println("====================");
	}

}
