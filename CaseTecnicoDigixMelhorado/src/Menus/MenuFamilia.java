package Menus;

import java.util.Scanner;

import Familia.CadastrarFamilia;
import Familia.Familia;
import Familia.Familias;
import Main.Main;

public class MenuFamilia extends Menu {
	
	public MenuFamilia() {
		
		// Configurações visuais do menu
		new Menu("Menu Familia", 40);
		mostrarOpcao("0 - Cadastrar nova familia.");
		mostrarOpcao("1 - Modificar familia existente.");
		mostrarOpcao("outro número - Retornar ao menu principal.");
		new Divisoria("=", 40);
		
		// Switch de opções
		switch (new Scanner(System.in).nextInt()) {
			case 0 -> this.opcao0();
			case 1 -> this.opcao1();
			default -> Main.main(null);
		}
		
		
	}
	
	public void opcao0 () {
		Familias.adicionarFamilia(new CadastrarFamilia().novoCadastro(new Familia()));
	}
	
	public void opcao1() {
		new MenuModificarFamilia();
	}
	
	
	
	
	
		
	
}
