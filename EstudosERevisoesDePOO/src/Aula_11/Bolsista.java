package Aula_11;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void pagarMensalidade () {
		System.out.println(this.getNome()+" é bolsista e tem desconto de "+ this.bolsa+"%. ");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
