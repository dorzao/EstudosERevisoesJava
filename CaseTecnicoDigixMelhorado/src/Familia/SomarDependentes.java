package Familia;

import Pessoa.CadastrarPessoa;

public class SomarDependentes {

	public SomarDependentes (int idade, Familia familia) {
		if (idade < 18) {
			familia.setDependentes(familia.getDependentes() + 1);
		}
	}
}
