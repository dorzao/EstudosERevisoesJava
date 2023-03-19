package CasosDeUso;

import Entidades.Familia;

public final class PontuadorDependentes3OuMais implements InterfacePontuador {

	@Override
	public void pontuar(Familia familia) {
		if (familia.getDependentes().size() >= 3) {
			familia.setPontosDependentes(3);
		}
		
	}

}
