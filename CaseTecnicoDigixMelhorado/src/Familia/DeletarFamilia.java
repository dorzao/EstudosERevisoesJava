package Familia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import Main.Main;
import Pessoa.Pessoa;

public class DeletarFamilia {
	
	public DeletarFamilia() {
		System.out.print("Qual o NIS da família a deletar: ");
		String nis = new ValidadorDeNis().verificarNumerico(new Scanner(System.in).nextLine());
		nis = new ValidadorDeNis().verificarTamanho(nis);
		if (nis != null) {
			int indice = 0;
			for (Familia familia : Familias.familias) {
				if (nis.equals(familia.getNis())) {
					System.out.println("Removendo família "+familia.getApelido()+" do banco de dados!");
					Familias.familias.remove(indice);
					Main.main(null);
					break;
				}
				indice++;
			}
		} 
		System.out.println("NIS não encontrado!");
		Main.main(null);
		
		
	}
	
	
}
