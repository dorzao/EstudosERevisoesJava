package CasosDeUso;

import Entidades.Familia;
import Entidades.Membro;

public final class CriterioRenda {
	public CriterioRenda (Familia familia) {
		pontuar(familia);
	}
	
	public CriterioRenda() {}
	
	public static void pontuar(Familia familia) {
		// Aqui devem ser adicionadas novas implementações de pontuação
		new PontuadorRendaAte900().pontuar(familia);
		new PontuadorRendaDe901Ate1500().pontuar(familia);
		
		// Aqui só uma saída de teste
		if (familia.getPontosRenda() > 0) {
			System.out.print("Ganhou "+familia.getPontosRenda());
		} else {
			System.out.print("Não ganhou");
		}
		System.out.println(" pontos no critério renda. ");
		
	}
}
