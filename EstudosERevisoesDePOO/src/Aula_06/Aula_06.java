package Aula_06;
/*
 Estudando Poo - Encapsulamento e abstração
 
 Criar um Controle remoto, com interface, classe e métodos.
 
 pontos:
 Criar interface "Controlador" que só tem métodos e todos públicos
  */
public class Aula_06 {

	public static void main(String[] args) {
		
		// Gerando um novo objeto para testes
		ControleRemoto c = new ControleRemoto();
		
		// testando a funcionalidade dos métodos da interface
		c.ligar();
		c.play();
		c.abrirMenu();
		c.menosVolume();
		c.menosVolume();
		c.menosVolume();
		c.menosVolume();
		c.menosVolume();
		c.maisVolume();
		c.abrirMenu();
		c.fecharMenu();
		c.pause();
		c.abrirMenu();
		c.play();
		c.ligarMudo();
		c.abrirMenu();
		c.desligarMudo();
		c.abrirMenu();
		c.desligar();
		c.abrirMenu();
		c.maisVolume();
	}

}
