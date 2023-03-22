package Entidades;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import Servidor.Upload;




public class ListaDeFamilias{
	
	private static  ArrayList<Familia> familias = new ArrayList<>(); 
	public static int[] pontuacoes = {8, 7, 6, 5, 3, 2, 0}; 
	

	public void adicionarFamilia(Familia f) {
	
		if (!familias.contains(f)) {
			familias.add(f);
			
			

		}
	}

	public void listar () {
		int contador = 1;
		for (var pontos : pontuacoes) {
			System.out.println("====================");
			if (contador < pontuacoes.length) {
				System.out.print("Prioridade "+contador);
			} else {
				System.out.print("Sem Prioridade");
			}
			System.out.println(": "+pontos+" pontos.");
			System.out.println("====================");
			for (Familia familia : familias) {
				if (familia.getPontos() == pontos) {
					apresentarFamilia(familia);
				}
			}
			contador++;
		}
	}

	public void apresentarFamilia(Familia familia) {
		System.out.println("Apresentação da família "+familia.getApelido());
		System.out.println("====================");
		System.out.println("NIS: "+familia.getNis());
		System.out.println("Membros: "+familia.getMembros().size());
		System.out.println("Dependentes: "+familia.getDependentes().size());
		System.out.println("Renda : R$ "+familia.getRenda());
		System.out.println("Total de pontos: "+familia.getPontos());
		System.out.println("====================");
	}
		
	public ArrayList<Familia> getFamilias() {
		return familias;
	}

	public void setFamilias(ArrayList<Familia> familias) {
		familias = familias;
	}






}
