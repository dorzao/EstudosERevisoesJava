package CasosDeUso;

import Entidades.Familia;

public class PontuadorRendaDe901Ate1500 implements InterfacePontuador {

	@Override
	public void pontuar(Familia familia) {
		if (familia.getRenda() > 900 && familia.getRenda() <= 1500) {
			familia.setPontosRenda(3);
		}
		
	}

}
