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
	private double salario;
	
	// polimorfismo de sobrecarga para finalidade de testes unitários.
	public Membro () {}
	
	public Membro (String nome, String cpf, String dataNascimento, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = calculoIdade(dataNascimento);
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static int calculoIdade(String dataNascimento) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dataDeAniversario = new GregorianCalendar();
		try {
			dataDeAniversario.setTime(sdf.parse(dataNascimento));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar hoje = Calendar.getInstance();
		int idadeProvisoria = hoje.get(Calendar.YEAR) - dataDeAniversario.get(Calendar.YEAR);
		if (hoje.get(Calendar.DAY_OF_YEAR) < dataDeAniversario.get(Calendar.DAY_OF_YEAR)) {
			idadeProvisoria-= 1;
			
		}
		
		return idadeProvisoria;
	}
		
}
