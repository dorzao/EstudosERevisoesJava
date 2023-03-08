package Listas;

import Familia.Familia;
import Familia.Familias;
import Menus.Cabecalho;
import Menus.Divisoria;
import Pessoa.Pessoa;

public class Listar {

	
	public void descreverFamilia(Familia familia, int indice) {
		new Cabecalho((indice+1)+"º lugar - Família "+familia.getApelido(), "-", 30);
		
		println("Chefe da familia: "+familia.familia.get(0).getNome());
		println("NIS da familia: "+familia.getNis());
		println("Número de membros: "+familia.getMembros());
		println("Número de dependentes: "+familia.getDependentes());
		println("Renda familiar: R$ "+familia.getRenda());
		println("Pontuação total: "+familia.getPontos());
		
		new Divisoria("-", 30);
	}
	
	public void descreverPessoa(Pessoa pessoa, int indice) {
		String msg;
		if (indice == 0) {
			msg = (indice + 1)+"º Membro - (Chefe de familia)";
		} else {
			msg = (indice + 1)+"º Membro";
		}
		
		new Cabecalho(msg, ".", 30);
		println("Nome completo: "+pessoa.getNome());
		println("CPF: "+pessoa.getCpf());
		println("Idade: "+pessoa.getIdade());
		println("Salário: R$ "+pessoa.getSalario());
		new Divisoria(".", 30);
	}
	
	public static void println(String msg) {
		System.out.println(msg);
	}
}
