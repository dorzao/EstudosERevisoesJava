package Familia;

import java.util.Scanner;
import Main.Main;
import Menus.Cabecalho;
import Menus.Divisoria;
import Pessoa.CadastrarPessoa;
import Pessoa.Pessoa;

public final class CadastrarFamilia {
	Scanner numeros = new Scanner(System.in);
	Scanner	palavras = new Scanner(System.in);
	public Familia novoCadastro (Familia familia) {

		// Formulário de Família
		new Cabecalho("Iniciando cadastro ", "-", 40);
		familia.setApelido(campoApelido("Qual o apelido da familia(ex: Silva)? "));
		familia.setNis(campoNis("Qual o NIS da familia "+familia.getApelido()+"? "));
		campoMembros("Quantos membros na familia? ", familia);



		new Cabecalho("Iniciando cadastro por familiar", ".", 40); 
		for (int i = 0; i < familia.getMembros(); i++) {
			String cab;
			int veri;
			veri = i;
			if (i > 0) {
				cab = (i+1)+"º Membro";
			} else {
				cab = (i+1)+"º Membro - (Chefe de família)";
			}

			new Cabecalho(cab, "-", 18);

			// Gerando pessoas para a familia
			Pessoa pessoa = new CadastrarPessoa().novoCadastro(new Pessoa(), i);


			// Somador Temporário de dependentes
			familia.setDependentes(this.somarDependentes(pessoa.getIdade(), familia)); // V Saída de teste V
			System.out.println("Número de dependentes até aqui: "+familia.getDependentes());// < -  <-  <-

			// Somador temporário de renda 
			familia.setRenda(this.somarRenda(pessoa.getSalario(), familia)); // V Saída de testes V
			System.out.println("Renda da familia "+familia.getApelido()+" até o momento: R$ "+familia.getRenda());


			// Armazenando Membro à lista de família
			familia.familia.add(pessoa);



			new Divisoria("-", 18);

		}


		// calculando e retornando
		return calculoFamilia(familia);



	}



	// Métodos de campos
	public String campoApelido(String msg) {
		System.out.print(msg);
		return palavras.nextLine();
	}

	public String campoNis(String msg) {
		System.out.print(msg);
		String nis = palavras.nextLine();
		if (new ValidadorDeNis().retorno(nis) != null) {
			return nis;
		}

		System.out.print("Tente outro Nis: ");
		return this.campoNis (" ");
	}

	public void campoMembros (String msg, Familia familia) {
		System.out.print(msg);
		new VerificarMembros(familia);
	}


	// Métodos somadores / calculadores

	public Familia calculoFamilia (Familia familia) {
		println("Calculando Dependentes, Renda total e aplicando critérios de pontuação da família "+familia.getApelido());

		// Zerando tudo para recalcular
		familia.setDependentes(0);
		familia.setPontos(0);
		familia.setRenda(0);

		// Gerando Dependentes e renda total
		for (Pessoa pessoa : familia.familia) {
			familia.setDependentes(somarDependentes(pessoa.getIdade(), familia));;
			familia.setRenda(somarRenda(pessoa.getSalario(), familia));;
		}

		// Pontuando de acordo com os critérios
		familia.setPontos(familia.getPontos() + new CriterioDependentes().pontuar(familia));
		familia.setPontos(familia.getPontos() + new CriterioRenda().pontuar(familia));

		// Saída de valores definitivos
		println("Renda da familia "+familia.getApelido()+" é de : R$ "+familia.getRenda());
		println("Número final de dependentes: "+familia.getDependentes());




		// Saida de teste
		println("Total de pontos: "+familia.getPontos());

		return familia;
	}

	public int somarDependentes (int idade, Familia familia) {
		if (idade < 18) {
			return familia.getDependentes() + 1;
		}
		return familia.getDependentes();
	}

	public double somarRenda (double salario, Familia familia) {
		return salario + familia.getRenda();


	}
	
	

	// Método de atalho
	public static void println(String msg) {
		System.out.println(msg);
	}



}
