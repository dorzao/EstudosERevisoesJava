package Menus;

// Classe para criar separadoresa fim de organizar o código durante a execução
public class Divisoria {
	public Divisoria (String caractere, int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(caractere);		
		}
		System.out.println();
	}
	
}
