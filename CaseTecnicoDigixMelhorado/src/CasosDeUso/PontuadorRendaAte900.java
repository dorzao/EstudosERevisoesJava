package CasosDeUso;

import Entidades.Familia;

public class PontuadorRendaAte900 implements InterfacePontuador {

	@Override
	public void pontuar(Familia familia) {
		if (familia.getRenda() >= 900) {
			familia.setPontosRenda(5);
		}
		
	}

	
	
}
