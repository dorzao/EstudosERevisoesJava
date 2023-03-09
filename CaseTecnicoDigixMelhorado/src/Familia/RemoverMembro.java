package Familia;

import java.util.Scanner;

import Main.Main;
import Pessoa.Pessoa;

public class RemoverMembro {
	Scanner cpfNis = new Scanner(System.in);

	public RemoverMembro () {
		var familia = this.encontrarFamilia(this.cpfNis.nextLine()); 
		if (familia != null) {
			this.encontrarPessoa(familia);
			new CadastrarFamilia().calculoFamilia(familia);
		}
		Main.main(null);
	}

	public Familia encontrarFamilia(String nis) {
		System.out.print("Qual o o NIS da família a deletar um membro: ");
		for (Familia familia : Familias.familias) {
			if (nis.equals(familia.getNis())) {
				return familia;
			}
		}
		System.out.println("Família não encontrada!");
		return null;
	}

	public void encontrarPessoa (Familia familia) {
		System.out.print("Qual o cpf do membroda família"+familia.getApelido()+": ");
		var cpf = this.cpfNis.nextLine();
		for (Pessoa pessoa : familia.familia) {
			if (cpf.equals(pessoa.getCpf())) {
				System.out.println(pessoa.getNome()+" foi encontrado(a) e será removido(a).");
				this.removerPessoa(familia, pessoa);
				break;
			}
		}
		System.out.println("Ninguém encontrado com o cpf "+cpf);		
		
	}
	
	public void removerPessoa (Familia familia, Pessoa pessoa) {
		familia.familia.remove(familia.familia.indexOf(pessoa));
		familia.setMembros(familia.getMembros() - 1);
		System.out.println(pessoa.getNome()+" foi removido(a) da família "+familia.getApelido()+" com sucesso. ");
		
	}
}
