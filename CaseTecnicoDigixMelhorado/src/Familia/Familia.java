package Familia;

import java.util.ArrayList;

import Pessoa.Pessoa;

public class Familia {
	
	// Atributos
	private String apelido;
	private String nis;
	private int membros, dependentes, pontos;
	private double renda;
	public ArrayList<Pessoa> familia; 
	private boolean inicioListaFamilia;
	
	
	public Familia () {
		if (this.inicioListaFamilia != true) {
			this.familia  = new ArrayList<Pessoa>();
			this.inicioListaFamilia = true;
			System.out.println("Lista de cada familia gerada");
		}
	}
	
	public Familia (String apelido, String nis, int membros, int dependentes, int pontos, double renda) {
		this.apelido = apelido;
		this.nis = nis;
		this.membros = membros;
		this.dependentes = dependentes;
		this.pontos = pontos;
		this.renda = renda;
	}
	
	// Métodos getters e setters
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
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public ArrayList<Pessoa> getFamilia() {
		return familia;
	}
	public void setFamilia(ArrayList<Pessoa> familia) {
		this.familia = familia;
	}
	
	
}
