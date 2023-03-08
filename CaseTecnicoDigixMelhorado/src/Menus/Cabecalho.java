package Menus;

public class Cabecalho {
	public Cabecalho(String titulo, String caracter, int tamanho) {
		new Divisoria(caracter, tamanho);
		for (int i = 0; i < (tamanho - titulo.length()) / 2; i++) {
			System.out.print(" ");
		}
		System.out.println(titulo);
		new Divisoria(caracter, tamanho);
	}
}
