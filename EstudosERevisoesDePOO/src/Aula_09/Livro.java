package Aula_09;

public class Livro implements Publicacao {
	
	// Declaração de atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//Método normal
	public String detalhes() {
		if (this.isAberto()) {
			return  "\n========================================\n"+
					"                Detalhes\n" +
					"========================================\n"+
					"Título: "+ this.getTitulo() + "\n"+
					"Autor: "+ this.getAutor() + "\n"+
					"Total de páginas: "+ this.getTotPaginas() + "\n"+
					"Página atual: "+ this.getPaginaAtual() + "\n"+
					"Está aberto? "+ this.isAberto() + "\n"+
					"Leitor: "+ this.getLeitor().getNome() + "\n" +
					"Idade do leitor: " + this.getLeitor().getIdade() + "\n " +
					"Sexo do leitor: " + this.getLeitor().getSexo() + "\n" + 
					"========================================\n";
		} else {
			return "\nO livro está fechado. Abra-o para saber os detalhes.\n";
		}
	}
	
	// Métodos especiais
	public Livro(String titulo, 
				String autor, 
				int totPaginas, 
				Pessoa leitor) 
	{ // construtor
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotPaginas(totPaginas);
		this.setPaginaAtual(0);
		this.setLeitor(leitor);
		this.setAberto(false);
	}
	
	//gets e sets
  	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotPaginas() {
		return this.totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	public int getPaginaAtual() {
		return this.paginaAtual;
	}
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	
	public boolean isAberto() {
		return this.aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	// Métodos abstratos da interface implementados (warning da ide criou automaticamente)
	
	@Override
	public void abrir() {
		this.setAberto(true);		
	}



	@Override
	public void fechar() {
		this.setAberto(false);
	}



	@Override
	public void folear(int p) {
		if (p <= this.getTotPaginas()) {
			this.setPaginaAtual(p);
		} else {
			this.setPaginaAtual(0);
			this.setAberto(false);
			System.out.println("O livro só vai até a página "+this.getTotPaginas()+". \nFechando o livro.");
		}
	}



	@Override
	public void avancarPagina() {
		this.paginaAtual++;
	}



	@Override
	public void voltarPagina() {
		this.paginaAtual--;
	}
	
	
	
	
	
	
	
	
	
	
	
}
