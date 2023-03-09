package Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

import Familia.DeletarFamilia;
import Familia.Familia;
import Familia.Familias;
import Familia.SomarDependentes;
import Menus.Cabecalho;
import Menus.Divisoria;

public class CadastrarPessoa {
	Scanner numeros = new Scanner(System.in);
	Scanner palavras = new Scanner(System.in);
	public double rendaTotal; 
	public int dependentes;

	public Pessoa novoCadastro(Pessoa pessoa, int membro) {



		// Campos do cadastro
		pessoa.setNome(campoNome("Nome completo: "));
		pessoa.setCpf(campoCpf("CPF de "+pessoa.getNome()+": "));
		pessoa.setIdade(campoIdade("Idade de "+pessoa.getNome()+": ", membro));
		pessoa.setSalario(campoSalario("Salário: R$ "));

		return pessoa;


	}

	// Métodos de cada campo individual

	public String campoNome(String msg) {
		System.out.print(msg);
		return palavras.nextLine();

	}

	public String campoCpf(String msg) {
		System.out.print(msg);
		String cpf = palavras.nextLine();
		if (cpf.length() == 11 && cpf.matches("[0-9]+")) {
			return cpf;
		}

		System.out.println("Cpf inválido, deve conter 11 dígitos e somente números.");
		return this.campoCpf (" ");
	}

	public int campoIdade (String msg, int membro) {
		System.out.print(msg);
		int idade = numeros.nextInt();
		if (membro == 0 && idade < 18) {
			System.out.println("O chefe de família deve ter 18 anos ou mais.");
			return this.campoIdade(" ", membro);
		}
		return idade;
	}

	public double campoSalario(String msg) {
		System.out.print(msg);
		double salarioLocal = numeros.nextDouble();
		if (salarioLocal < 0) {
			System.out.println("O salário deve ser R$ 0,00 ou mais. ");
			return this.campoSalario(" ");
		}
		return salarioLocal;

	}

}
