package Entidades;

import java.util.ArrayList;

import CasosDeUso.ValidadorDeDependentes;

public final class Familia {
	private String apelido;
	private String nis;
	private int pontos, pontosDependentes, pontosRenda, numeroDeMembros, numeroDeDependentes;
	private double renda;
	private ArrayList<Membro> membros = new ArrayList<>();
	private ArrayList dependentes = new ArrayList<>();

	public Familia(String apelido, String nis) {
		super();
		this.apelido = apelido;
		this.nis = nis;
		this.somarRenda();
	}

	public void adicionarMembro(Membro membro) {
		this.getMembros().add(membro);
		System.out.println(membro.getNome()+" adicionado(a) à família "+this.getApelido()+". ");
	}
	
	public void somarRenda() {
		
		for (Membro membro : this.getMembros()) {
			
			this.setRenda(this.getRenda() + membro.getSalario());
			
		}
		
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

	public ArrayList getDependentes() {
		return dependentes;
	}

	public void setDependentes(ArrayList dependentes) {
		this.dependentes = dependentes;
	}






}
