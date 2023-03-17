package Entidades;

public final class Familia {
	private String apelido;
	private String nis;
	private int pontos, pontosDependentes, pontosRenda;
	private double renda;
	private Membro[] membros;
	private Dependente[] dependentes;
	
	public Familia(String apelido, String nis, int pontos, int pontosDependentes, int pontosRenda, double renda,
			Membro[] membros, Dependente[] dependentes) {
		super();
		this.apelido = apelido;
		this.nis = nis;
		this.pontos = pontos;
		this.pontosDependentes = pontosDependentes;
		this.pontosRenda = pontosRenda;
		this.renda = renda;
		this.membros = membros;
		this.dependentes = dependentes;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos() {
		this.pontos = this.getPontosDependentes() + this.getPontosRenda();
	}

	public int getPontosDependentes() {
		return pontosDependentes;
	}

	public void setPontosDependentes(int pontosDependentes) {
		this.pontosDependentes = pontosDependentes;
		this.setPontos();
	}

	public int getPontosRenda() {
		return pontosRenda;
	}

	public void setPontosRenda(int pontosRenda) {
		this.pontosRenda = pontosRenda;
		this.setPontos();
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Membro[] getMembros() {
		return membros;
	}

	public void setMembros(Membro[] membros) {
		this.membros = membros;
	}

	public Dependente[] getDependentes() {
		return dependentes;
	}

	public void setDependentes(Dependente[] dependentes) {
		this.dependentes = dependentes;
	}
	
	
	
	
	
	
}
