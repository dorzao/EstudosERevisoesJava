package Aula_15_16_ProjetoFinal_Invidious;

public class Invidious {

	public static void main(String[] args) {
		// instanciando objeto video
		Video v[] = new Video[3];
		v[0] = new Video("primeiro video");
		v[1] = new Video("segundo video");
		v[2] = new Video("terceiro video");
		
		// instanciando usuarios
		Usuario u[] = new Usuario[2];
		u[0] = new Usuario("Pedro", 27, "Masculino", "pedro123");
		u[1] = new Usuario("Maria", 65, "Feminino", "123maria");
		
		// Testes de funcionalidade
		//System.out.println(u[0].toString());
		//System.out.println(u[1].toString());
		//System.out.println(v[2].toString());
		
		Visualizacao vis[] = new Visualizacao[6];
		vis[0] = new Visualizacao(u[0], v[0]);
		vis[1] = new Visualizacao(u[0], v[1]);
		vis[3] = new Visualizacao(u[1], v[0]);
		vis[4] = new Visualizacao(u[1], v[1]);
			
				
		
		// Saída de Pedro
		System.out.println(vis[0].toString());
		
		
		
		// Saída de Maria
		//System.out.println(vis[3].toString());
		
		
	}

}
