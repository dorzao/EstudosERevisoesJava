package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Membro {
	private String nome;
	private String cpf;
	private int idade;
	private static String dataNascimento;
	
	public Membro () {}
	
	public Membro (String nome, String cpf, String dataNascimento) throws ParseException {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = this.calculoIdade(dataNascimento);
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static int calculoIdade(String dataNascimento) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dataDeAniversario = new GregorianCalendar();
		dataDeAniversario.setTime(sdf.parse(dataNascimento));
		Calendar hoje = Calendar.getInstance();
		int idadeProvisoria = hoje.get(Calendar.YEAR) - dataDeAniversario.get(Calendar.YEAR);
		if (hoje.get(Calendar.DAY_OF_YEAR) < dataDeAniversario.get(Calendar.DAY_OF_YEAR)) {
			idadeProvisoria-= 1;
			
		}
		
		return idadeProvisoria;
	}
		
}
