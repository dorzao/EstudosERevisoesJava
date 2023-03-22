package CasosDeUso;

import Entidades.Familia;
import Entidades.Membro;

public final class CriterioDependentes {
	public CriterioDependentes (Familia familia) {
		pontuar(familia);
	}
	
	public CriterioDependentes() {}
	
	public static void pontuar(Familia familia) {
		// Aqui devem ser adicionadas novas implementações de pontuação
		new PontuadorDependentes3OuMais().pontuar(familia);
		new PontuadorDependentesEntre1E2().pontuar(familia);
		new PontuadorRendaAte900().pontuar(familia);
		new PontuadorRendaDe901Ate1500().pontuar(familia);
		
		// Aqui só uma saída de teste
		System.out.println("Ganhou "+familia.getPontosDependentes()+" pontos no critério dependentes e "+familia.getPontosRenda()+" pontos no critério renda; \nTotalizando: "+familia.getPontos()+" pontos.");
		
	}
}
