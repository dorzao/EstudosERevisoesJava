package Aula_07_08;

import java.util.Random;

public class Luta {
	
	// atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	// Métodos públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiante(l1);
			this.setDesafiado(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiante(null);
			this.setDesafiado(null);
		}
	}
	
	public void lutar() {
		if (this.getAprovada()) {
			desafiado.apresentar();
			desafiante.apresentar();
			Random escolha = new Random();
			switch (escolha.nextInt(3)) {
			case 0:
				System.out.println("Empatou");
				desafiante.empatar();
				desafiado.empatar();
				break;
			case 1:
				System.out.println(desafiante.getNome() + " venceu.");
				desafiante.ganhar();
				desafiado.perder();
				break;
			case 2:
				System.out.println(desafiado.getNome() + " venceu.");
				desafiado.ganhar();
				desafiante.perder();	

				break;
			}
			desafiante.status();
			desafiado.status();
				
		} else {
			System.out.println("Luta não pode acontecer. \n");
		}
	}
	
	// Métodos get
	public boolean getAprovada() {
		return this.aprovada;
	} 
	
 	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
 	public Lutador getDesafiado() {
 		return this.desafiado;
 	}
	
	// Métodos set
	public void setDesafiado(Lutador l2) {
		this.desafiado = l2;
		
	}

	public void setDesafiante(Lutador l1) {
		this.desafiante = l1;		
	}

	public void setAprovada(boolean b) {
		this.aprovada = b;
	}

	
	
}
