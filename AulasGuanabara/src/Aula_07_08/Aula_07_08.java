package Aula_07_08;



public class Aula_07_08 {

	public static void main(String[] args) {
		// definindo vetor de lutadores
		Lutador l[] = new Lutador[6];
		
		// Atribuindo valores aos objetos lutadores
		l[0] = new Lutador("Imbapê","França",	31, 68.9f, 1.75f, 11, 2,1);
		l[1] = new Lutador("Pedro","Brasil", 29, 57.8f, 1.68f, 14, 2,3);
		l[2] = new Lutador("Deamon","Estados Unidos",	19, 74.9f, 1.78f, 12, 2,1);
		l[3] = new Lutador("Ryu","Japão",	28, 81.9f, 1.93f, 13, 0,2);
		l[4] = new Lutador("Zangeff","Russia",	37, 119.9f, 1.70f, 5, 4,3);
		l[5] = new Lutador("Dalsin","India",	30, 105.9f, 1.81f, 12, 2,4);
		
		// instanciando a nova classe de luta
		Luta luta = new Luta();
		
		// Simulando uma luta com sucesso
		luta.marcarLuta(l[2], l[3]);
		luta.lutar();
		
	}

}
