package Menus;

import java.util.Scanner;

import Familia.Familia;
import Familia.Familias;

public class MenuPrincipal extends Menu {
	public MenuPrincipal(String titulo, int tamanho) {
		new Menu(titulo, tamanho);
		mostrarOpcao("0 - Opções de familia");
		mostrarOpcao("1 - Opções de listagem");
		mostrarOpcao("Outro número - Sair.");
				
		new Divisoria("=", tamanho);
		
		switch(new Scanner(System.in).nextInt()){
			case 0 -> this.opcao0();
			case 1 -> this.opcao1();
			default -> println("Saindo do Programa");
		}
		
	}
	
	// Métodos para o caso de necessitar de 2 ou mais ações no case
	
	public void opcao0 () {
		new MenuFamilia();
	}
	
	public void opcao1() {
		new MenuListas();
	}
	
	
}
