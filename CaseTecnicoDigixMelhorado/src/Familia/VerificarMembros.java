package Familia;

import java.util.Scanner;

public class VerificarMembros {
	
	public VerificarMembros (Familia familia) {
		familia.setMembros(new Scanner(System.in).nextInt());
		if (familia.getMembros() < 1) {
			System.out.println("Valor inválido, selecione um valor a partir de 1.");
			new VerificarMembros(familia);
		} 
	}
}
