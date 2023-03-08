package Familia;
import java.util.ArrayList;

import Main.Main;

import java.io.Serializable;

public class Familias  {

	// Para fácil implementação de pontuações
	public static int[] pontuacoes = {8, 7, 6, 5, 3, 2, 0};
	public static ArrayList<Familia> familias;
	private static boolean inicio;
	
	

	//getter e setter
	public static ArrayList<Familia> getFamilias() {
		return familias;
	}

	public static void setFamilias(ArrayList<Familia> familias) {
		Familias.familias = familias;
	}

	// Construtor
	public Familias () {
		if (this.inicio != true) {
			this.familias = new ArrayList<Familia>();
			this.inicio = true;
			System.out.println("lista familia ativada");
		}
	}

	public static void adicionarFamilia (Familia familia) {
		getFamilias().add(familia);
		// Saída de teste
		System.out.println("A família "+familia.getApelido()+" foi inserida ao banco de dados!");
		Main.main(null);
	}
}
