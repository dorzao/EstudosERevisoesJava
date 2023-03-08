package Menus;

import java.util.Scanner;

import Familia.DBFamilias;
import Familia.Familias;
import Listas.ListarFamilia;
import Listas.ListarMembros;
import Main.Main;

public class MenuListas extends Menu {
	
	public MenuListas() {
		
		// Configurações visuais do menu
		Menu m =new Menu("Menu de Lista", 40);
		mostrarOpcao("0 - Lista Geral por Prioridade e colocação.");
		mostrarOpcao("1 - Listar e detalhar membros de uma família .");
		mostrarOpcao("outro número - Retornar ao menu principal.");
		m.fechamento();
		
				
		// Switch de opções
		switch (new Scanner(System.in).nextInt()) {
			case 0 -> this.opcao0();
			case 1 -> this.opcao1();
			default -> Main.main(null);
		}
		
		
	}
	
	public void opcao0 () {
		new ListarFamilia(Familias.familias);
	}
	
	public void opcao1 () {
		new ListarMembros(Familias.familias);
	}
	
	
	
		
	
}
