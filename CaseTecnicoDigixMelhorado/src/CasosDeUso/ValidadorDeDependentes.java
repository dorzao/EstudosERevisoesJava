package CasosDeUso;

import java.util.ArrayList;

import Entidades.Familia;
import Entidades.Membro;

public final class ValidadorDeDependentes {
	public ValidadorDeDependentes (Familia familia) {
		familia.setDependentes(new ArrayList());
		int contador = 0;
		for (Membro membro : familia.getMembros()) {
			if (membro.getIdade() < 18) {
				familia.getDependentes().add(membro);
				System.out.println(membro.getNome()+" é um dependente.");
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("Família "+familia.getApelido()+" não possui dependentes.");
		}
	}

}
