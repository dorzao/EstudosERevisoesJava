package Menus;

import Familia.AdicionarMembro;
import Main.Main;

public class MenuModificarFamilia extends Menu {

	public MenuModificarFamilia () {

		new Menu("Menu Modificador de Famílias", 40);
		mostrarOpcao("0 - Adicionar membro a uma familia.");
		mostrarOpcao("1 - Remover Membro de uma família.");
		mostrarOpcao("2 - Editar campos de uma familia.");
		mostrarOpcao("3 - Deletar uma família.");
		mostrarOpcao("4 - Editar campos de uma pessoa.");
		mostrarOpcao("outro número - Retorna ao menu inicial.");
		new Divisoria("=", 40);

		// Switch case de opções
		switch (opcao.nextInt()) {
		case 0  -> this.opcao0();
		case 1  -> this.opcao1();
		case 2  -> this.opcao2();
		case 3  -> this.opcao3();
		case 4  -> this.opcao4();
		default -> this.opcaoDefault();

		}

	}

	public void opcao0 () {
		new AdicionarMembro();
	}

	public void opcao1 () {

	}

	public void opcao2 () {

	}

	public void opcao3 () {

	}

	public void opcao4 () {

	}
		
	public void opcaoDefault() {
		println("Retornando ao menu principal. ");
		Main.main(null);
	}
}
