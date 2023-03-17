package Entidades;

import java.util.ArrayList;

public final class Familia {
	private String apelido;
	private String nis;
	private int pontos, pontosDependentes, pontosRenda, numeroDeMembros, numeroDeDependentes;
	private double renda;
	private ArrayList<Membro> membros;
	private ArrayList<Dependente> dependentes;
	
	public Familia(String apelido, String nis, int pontos, int pontosDependentes, int pontosRenda, double renda,
			ArrayList<Membro> membros, ArrayList<Dependente> dependentes) {
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

	public ArrayList<Membro> getMembros() {
		return membros;
	}

	public void setMembros(ArrayList<Membro> membros) {
		this.membros = membros;
	}

	public ArrayList<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(ArrayList<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
	
	
	
	
	
}
