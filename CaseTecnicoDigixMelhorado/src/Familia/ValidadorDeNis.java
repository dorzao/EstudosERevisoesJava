package Familia;

public class ValidadorDeNis {

	public String retorno(String nis) {
		nis = this.verificarSeExiste(nis);
		nis = this.verificarNumerico(nis);
		nis = this.verificarTamanho(nis);
		return nis;
	}

	public String verificarTamanho (String nis) {
		if (nis != null && nis.length() == 11) {
			return nis;
		}
		nis = null;
		System.out.println("O NIS deve ter exatamente 11 dígitos!");
		return nis;

	}

	public String verificarNumerico (String nis) {
		if (nis != null && nis.matches("[0-9]+")) {
			return nis;
		}
		System.out.println("O NIS deve conter somente números.");
		return null;

	}

	public String verificarSeExiste (String nis) {
		for (Familia familia : Familias.familias) {
			if (nis.equals(familia.getNis())) {
				System.out.println("O NIS "+nis+" já pertence a família "+familia.getApelido()+". ");
				nis = null;
				break;
			}
		}
		return nis;



	}
}
