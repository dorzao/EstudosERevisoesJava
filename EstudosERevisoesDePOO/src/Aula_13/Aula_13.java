package Aula_13;

public class Aula_13 {
	// Método divisória para organizar as saídas
	public static void divisoria () {
		System.out.println("\n==============================================================================\n");
	}

	public static void main(String[] args) {
		// Instanciando objetos
		Mamifero m1 = new Mamifero();
		Lobo l1 = new Lobo();
		Cachorro c1 = new Cachorro();
		
		divisoria();
		
		// Saídas de teste
		m1.emitirSom();
		l1.emitirSom();
		c1.emitirSom();
		
		divisoria();		
		
		// Saídas da sobrecarga do método reagir do cachorro
		// assinatura 1 string
		c1.reagir("Olá");
		c1.reagir("cachorro feio");
		
		divisoria();
		
		// assinatura inteiro e real respectivamente
		c1.reagir(4, 9.9f); // para abanar
		c1.reagir(4, 10.1f); // para latir
		c1.reagir(5, 9f); // para rosnar
		c1.reagir(5, 10.1f); // para ignorar
		

		divisoria();
		
		// assinatura do tipo lógico
		c1.reagir(true); // forma positiva
		c1.reagir(false); // forma negativa
		
		divisoria();
		
		//assinatura 2 inteiros
		c1.reagir(11, 59); // manhã
		c1.reagir(17, 59); // tarde
		c1.reagir(23, 59); // noite
		
		divisoria();
		
		
	}

}
