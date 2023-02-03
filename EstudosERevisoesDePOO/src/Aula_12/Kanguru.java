package Aula_12;

public class Kanguru extends Mamifero {
		
		// Método específico para kanguru
		public void usarBolsa() {
			System.out.println("Kanguru usando a bolsa.");
		}
		
		
		// Sobreposição do método para polimorfismo
		@Override
		public void locomover() {
			System.out.println("Kanguru se locomove saltando");
		}
}
