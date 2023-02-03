package Aula_12;

public class Aula_12 {

	public static void main(String[] args) {
		Mamifero m1 = new Mamifero();
		
		m1.setIdade(3);
		m1.setMembros(4);
		m1.setPeso(35.2f);
		m1.setCorDoPelo("Azul");
		m1.apresentar();
		m1.fecharApresentar();
		
		Cachorro c1 = new Cachorro();
		c1.setIdade(1);
		c1.setCorDoPelo("Preto");
		c1.setRaca("Yorkshire");
		c1.setMembros(4);
		c1.setPeso(0.95f);
		c1.apresentar();
		c1.fecharApresentar();
		c1.emitirSom();
		m1.emitirSom();
		
		// Instanciando réptil e testando sobreposição de métodos
		Reptil r1 = new Reptil();
		r1.setPeso(25f);
		r1.setIdade(7);
		r1.setMembros(0);
		r1.setCorDaEscama("verde");
		r1.apresentar();
		r1.fecharApresentar();
		r1.locomover();
		r1.emitirSom();
		r1.alimentar();
		
		// Testando o kanguru
		Kanguru k1 = new Kanguru();
		k1.setPeso(82f);
		k1.setIdade(12);
		k1.setMembros(4);
		k1.setCorDoPelo("Castanha");
		k1.apresentar();
		k1.fecharApresentar();
		k1.locomover();
		k1.emitirSom();
		k1.alimentar();
		k1.usarBolsa();
		
		
	}

}
