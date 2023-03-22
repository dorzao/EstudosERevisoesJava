package CasosDeUso;

import Entidades.Familia;

public final class CriterioDependentes implements InterfacePontuador{
	public CriterioDependentes (Familia familia) {
		pontuar(familia);
	}
	
	public CriterioDependentes() {}
	
	public static void pontuar(Familia familia) {
		// Aqui devem ser adicionadas novas implementações de pontuação
				new PontuadorDependentes3OuMais().pontuar(familia);
				new PontuadorDependentesEntre1E2().pontuar(familia);
				
				
				// Aqui só uma saída de teste
				if (familia.getPontosDependentes() > 0) {
					System.out.print("Ganhou "+familia.getPontosDependentes());
				} else {
					System.out.print("Não ganhou");
				}
				System.out.println(" pontos no critério dependentes.");
	}
}
