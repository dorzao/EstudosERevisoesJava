package CasosDeUso;

import Entidades.Familia;

public final class PontuadorDependentesEntre1E2 implements InterfacePontuador {

	@Override
	public void pontuar(Familia familia) {
		if (familia.getDependentes().size() > 0 && familia.getDependentes().size() < 3) {
			familia.setPontosDependentes(2);
		}
		
	}

}
