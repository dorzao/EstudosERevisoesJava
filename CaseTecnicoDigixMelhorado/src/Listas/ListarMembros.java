package Listas;

import java.util.ArrayList;
import java.util.Scanner;

import Familia.DeletarFamilia;
import Familia.Familia;
import Main.Main;
import Menus.Cabecalho;
import Menus.Divisoria;
import Pessoa.Pessoa;

public class ListarMembros extends Listar {
	Scanner nis = new Scanner(System.in);
	boolean existe;
	
	public ListarMembros(ArrayList<Familia> familias) {
	
		println("Qual o niz da familia a descrever: ");
		String varnis = nis.nextLine();
		for (Familia familia : familias) {
			if (familia.getNis().equals(varnis)) {
				this.listadorPessoa(familia);
			} 
						
		}
		println("Familia não encontrada. Voltando ao menu inicial");
		Main.main(null);
	}
	
	public void  listadorPessoa (Familia familia) {
		int i = 0;
		for (Pessoa pessoa : familia.familia) {
			this.descreverPessoa(pessoa, i);
			i++;
			
		}
		println("Voltando ao menu principal");
		Main.main(null);
	}
	
	
}
