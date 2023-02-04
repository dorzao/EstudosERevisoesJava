package Aula_13;

public class Cachorro extends Lobo {
	
	// Método público reagir
	public void reagir(String frase) {
		System.out.print("Cachorro reagiu com ");
		if (frase.equals("Olá") || frase.equals("Te amo doguinho")) {
			System.out.println("lambidas e abanadas de rabo.");
		} else {
			System.out.println("rosnados e latidos.");
		}
	}
	
	public void reagir (int hora, int minuto) {
		System.out.print("No horário da ");
		if (hora < 12) {
			System.out.println("manhhã, "+hora+":"+minuto+", o chchorro vai abanar o rabo");
		} else if (hora >= 18) {
			System.out.println("noite, "+hora+":"+minuto+", o chchorro vai ignorar");
		} else {
			System.out.println("tarde, "+hora+":"+minuto+", o chchorro rosnar e latir");
		}
		
	}
	
	public void reagir (boolean dono) {
		if (dono) {
			System.out.println("Cachorro abanou o rabo para o dono!");
		} else {
			System.out.println("Como não é o dono, o cachorro rosnou e latiu!");
		}
		
	} 
	
	public void reagir (int idade, float peso) {
		System.out.print("O cachorro ");
		if (idade <5) {
			if (peso < 10.0) {
				System.out.println("abanou o rabo. ");
			} else {
				System.out.println("latiu. ");
			}
		} else {
			if (peso < 10) {
				System.out.println("rosnou.");
			} else {
				System.out.println("ignorou.");
			}
		}
	}
	
	
	
	
	// Sobrescrição do método emitir som
	@Override
	public void emitirSom() {
		System.out.println("Latido do cachorro: au au au au au");
	}
	
	
}
