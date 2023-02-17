package Aula_15_16_ProjetoFinal_Invidious;

public class Usuario extends Pessoa {
	
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	//Atributos
	private String login;
	private int totAssistido;
	@Override
	public String toString() {
		return "~~> Usuario <~~ \n" + super.toString() +"\nlogin: " + login + "\nTotal de vídeos assistidos: " + totAssistido;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	
	
	
}
