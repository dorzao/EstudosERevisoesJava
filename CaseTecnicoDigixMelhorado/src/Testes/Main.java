package Testes;

import CasosDeUso.PontuadorGeral;
import CasosDeUso.ValidadorDeDependentes;
import Entidades.Familia;
import Entidades.ListaDeFamilias;
import Entidades.Membro;

public class Main {

	public static void main(String[] args) {
		
		Familia f[] = new Familia[7];
		f[0] = new Familia("Silva", "11122233344");
		f[0].adicionarMembro(new Membro("Pedro Silva", "11122244455", "19/12/1995", 250));
		f[0].adicionarMembro(new Membro("Renata Silva", "11122244455", "19/12/2006", 200));
		f[0].adicionarMembro(new Membro("Lucinha Silva", "11122244455", "19/12/2006", 100));
		f[0].adicionarMembro(new Membro("Cazuza Silva", "11122244455", "19/12/2006", 300));
		f[0].somarRenda();
		new ValidadorDeDependentes(f[0]);
		new PontuadorGeral(f[0]);
		new ListaDeFamilias().adicionarFamilia(f[0]);
		
		f[1] = new Familia("Souza", "11122233344");
		f[1].adicionarMembro(new Membro("Pedro Souza", "11122244455", "19/12/1995", 250));
		f[1].adicionarMembro(new Membro("Renata Souza", "11122244455", "19/12/2006", 200));
		f[1].adicionarMembro(new Membro("Lucinha Souza", "11122244455", "19/12/2006", 100));
		//f[0].adicionarMembro(new Membro("Cazuza Silva", "11122244455", "19/12/2006", 300));
		f[1].somarRenda();
		new ValidadorDeDependentes(f[1]);
		new PontuadorGeral(f[1]);
		new ListaDeFamilias().adicionarFamilia(f[1]);
		
		f[2] = new Familia("Santos", "554433221100");
		f[2].adicionarMembro(new Membro("Renata Santos", "11122244455", "19/12/2006", 450));
		f[2].adicionarMembro(new Membro("Pedro Santos", "11122244455", "19/12/2006", 451));
		f[2].somarRenda();
		new ValidadorDeDependentes(f[2]);
		new PontuadorGeral(f[2]);
		new ListaDeFamilias().adicionarFamilia(f[2]);
		
		
		
		// Listando o resultado
		new ListaDeFamilias().listar();
		
		
	

	}

}
