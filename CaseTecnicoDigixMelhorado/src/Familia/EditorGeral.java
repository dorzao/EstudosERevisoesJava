package Familia;

import java.util.Scanner;

import Pessoa.Pessoa;

public class EditorGeral {
	Scanner niscpf = new Scanner(System.in);
	
	public void receberCpf(String msg) {
		print(msg);
		var cpf = niscpf.nextLine();
	}
	
	public void receberNis(String msg) {
		print(msg);
	}
	
	public void print(String msg) {
		System.out.print(msg);
	}
	
	public Familia encontrarFamilia (String nNis) {
		for (Familia familia : Familias.familias) {
			if (familia.getNis().equals(nNis)) {
				return familia;
			}
		}
		print("familia não encontrada");
		return null;
	}
	
	public Pessoa encontrarPessoa(String nCpf, Familia familia) {
		for (Pessoa pessoa : familia.familia) {
			if (pessoa.getClass().equals(nCpf)) {
				return pessoa;
			}
		}
		print("Pessoa não encontrada");
		return null;
	}
}
