package Listas;

import java.util.ArrayList;
import java.util.function.Consumer;

import Familia.DBFamilias;
import Familia.Familia;
import Familia.Familias;
import Main.Main;
import Menus.Cabecalho;
import Menus.Divisoria;

public class ListarFamilia extends Listar {


	public ListarFamilia(ArrayList<Familia> familias) {
		new Cabecalho("Lista de Familias", "-", 40);
		String msg;
		int j = 0;
		for (Familia familia : familias) {
			this.descreverFamilia(familia, j);
			j++;
		}
		
		Main.main(null);
	}

	
}
