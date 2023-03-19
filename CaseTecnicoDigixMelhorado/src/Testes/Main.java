package Testes;

import java.text.ParseException;

import CasosDeUso.PontuadorGeral;
import CasosDeUso.ValidadorDeDependentes;
import Entidades.Familia;
import Entidades.Membro;

public class Main {

	public static void main(String[] args) throws ParseException {
		Familia f1 = new Familia("Silva", "11122233344");
		f1.adicionarMembro(new Membro("Pedro Silva", "11122244455", "19/12/1995", 250));
		f1.adicionarMembro(new Membro("Renata Silva", "11122244455", "19/12/2006", 200));
		f1.adicionarMembro(new Membro("Lucinha Silva", "11122244455", "19/12/2006", 100));
		f1.adicionarMembro(new Membro("Cazuza Silva", "11122244455", "19/12/2006", 300));
		f1.somarRenda();
		new ValidadorDeDependentes(f1);
		new PontuadorGeral(f1);
		
	

	}

}
