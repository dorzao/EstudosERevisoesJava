package Menus;

import java.lang.reflect.Executable;
import Main.Main;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


public class Menu {
	int tamanho;
	Scanner opcao = new Scanner(System.in);

	public  Menu(String titulo, int tamanho) {
		new Cabecalho(titulo, "=", tamanho);
		System.out.println("Tecle sua opção");
		new Divisoria("=", tamanho);
		this.tamanho = tamanho;
		
	}
	
	public Menu () {}

	public void fechamento() {
		new Divisoria("=", this.tamanho);
	}
	
	public void mostrarOpcao(String msg) {
		println(msg);
	}
	
	public static void println(String msg) {
		System.out.println(msg);
	}



}
