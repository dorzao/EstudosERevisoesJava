package Entidades;

import java.util.ArrayList;

public abstract class ListaDeFamilias {
	private static ArrayList<Familia> familias = new ArrayList<>();
	public static int[] pontuacoes = {8, 7, 6, 5, 3, 2, 0}; 
	
	public static void adicionarFamilia(Familia f) {
		if (!familias.contains(f)) {
			familias.add(f);
		}
	}
	
	public static void listar () {
		int contador = 1;
		for (var pontos : pontuacoes) {
			System.out.println("====================");
			System.out.println("Prioridade "+contador+": "+pontos+" pontos.");
			System.out.println("====================");
			for (Familia familia : familias) {
				if (familia.getPontos() == pontos) {
					apresentarFamilia(familia);
				}
			}
			contador++;
		}
	}
	
	public static void apresentarFamilia(Familia familia) {
		System.out.println("Apresentação da família "+familia.getApelido());
		System.out.println("====================");
		System.out.println("NIS: "+familia.getNis());
		System.out.println("Membros: "+familia.getMembros().size());
		System.out.println("Dependentes: "+familia.getDependentes().size());
		System.out.println("Total de pontos: "+familia.getPontos());
		System.out.println("====================");
	}
	
	
	public static ArrayList<Familia> getFamilias() {
		return familias;
	}
	public static void setFamilias(ArrayList<Familia> familias) {
		ListaDeFamilias.familias = familias;
	}
	
		
}
