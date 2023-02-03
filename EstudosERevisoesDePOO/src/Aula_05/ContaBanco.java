package Aula_05;

class ContaBanco {
	
	// Declaração de atributos
	public int numeroConta;
	protected String tipo; // Se é corrente ou poupança
	private String dono;
	private float saldo;
	private String status; // Se está aberta ou fechada
	
	// Criação dos métodos
	
	// método construtor
	public ContaBanco() {
		this.setStatus("Fechada");
		this.setSaldo(0);
	}
	
	
	// Método de abrir conta
	public void abrirConta(int nconta, String dono, String tipo) {
		this.setNumeroConta(nconta);
		this.setDono(dono);
		this.setTipo(tipo);
		this.setStatus("Aberta");
		
		// Switch case para definir o bonus inicial
		switch(tipo) {
		case "CC":
			this.setSaldo(50);
			break;
		case "CP":
			this.setSaldo(150);
		}
		System.out.println("\n\n Conta criada \n");
		System.out.println("\nNúmero da conta: "+this.getNumeroConta());
		System.out.println("Proprietário: "+this.getDono());
		System.out.println("Tipo da conta: "+this.getTipo());
		System.out.printf("%s%.2f%n", "Seu saldo é de: R$ ", this.getSaldo());
		System.out.println("Status: "+this.getStatus());
		
	}
	
	
	// Método de fechar a conta
	public void fecharConta() {
		// Condicional para saber se o sujeito pode ou não fechar a conta
		if (this.getSaldo() == 0) {
			this.setStatus("Fechada");
			System.out.println("Iniciando fechamento de conta.");
			System.out.println("Status da conta: "+this.getStatus());
			System.out.println("Conta fechada com êxito! ");
		} else if (this.getSaldo() > 0) {
			System.out.printf("%s%.2f%s%n", "Saque seus R$ ", this.getSaldo(), " para fechar sua conta.");
		} else {
			System.out.printf("%s%.2f%s%n", "Deposite R$ ", this.getSaldo() * -1, " para quitar sua dívida e fechar sua conta.");
		}
	}
	
	
	// Método de depositar
	public void depositar(float valor) {
		if (this.getStatus().equals("Aberta")) {
			System.out.printf("%n%n%s%n%n", "Informações do depósito: ");
			System.out.printf("%s%d%n", "Número da conta: ", this.getNumeroConta());
			System.out.printf("%s%s%n", "Nome do proprietário da Conta: ", this.getDono());
			System.out.printf("%s%.2f%n", "Saldo da conta antes do depósito: R$ ", this.getSaldo());
			System.out.printf("%s%.2f%n%n", "Valro do depósito: R$ ", valor);
			this.setSaldo(this.getSaldo() + valor);
			System.out.printf("%s%.2f%n%n", "Saldo da conta após o depósito: R$ ", this.getSaldo());

			
		} else {
			System.out.println("Para se depositar qualquer valor, é necessário se ter uma conta aberta.");
		}
	}

	
	// Método de saque
	public void sacar (float valor) {
		if (this.getStatus().equals("Aberta")) {
			if (valor <= this.getSaldo()) {
				System.out.printf("%n%n%s%n%n", "Informações do saque");
				System.out.printf("%s%d%n", "Número da conta: ", this.getNumeroConta());
				System.out.printf("%s%s%n", "Nome do Proprietário: ", this.getDono());
				System.out.printf("%s%.2f%n", "Saldo da conta antes do saque: R$ ", this.getSaldo());
				System.out.printf("%s%.2f%n%n", "Valor a sacar: R$ ", valor);
				this.setSaldo(this.getSaldo() - valor);
				System.out.printf("%s%.2f%n", "Saldo da conta após o saque: R$ ", this.getSaldo());

				
			}else {
				System.out.printf("%s%.2f%s", "Com o seu saldo, tu só consegues sacar R$ ", this.getSaldo(), " ou menos.");
			}
			
		}else {
			System.out.println("Para efetuar qualquer saque é necessário ter uma conta aberta.");
		}
	}

	
	// Método de pagar mensalidade
	public void pagarMensalidade () {
		System.out.println("\n\nIniciando pagamento da mensalidade... \n");
		switch (this.getTipo()) {
		case "CC":
			System.out.println("Tipo de conta: Corrente.");
			System.out.printf("%s%.2f%n", "Saldo da conta antes da cobrança: R$ ", this.getSaldo());
			System.out.println("Valor a pagar: R$ 12,00.\n\n");
			this.setSaldo(this.getSaldo() - 12);
			System.out.printf("%s%.2f%n", "Saldo da conta após a cobrança: R$ ", this.getSaldo());
			break;
		case "CP":
			System.out.println("Tipo de conta: Poupança.");
			System.out.printf("%s%.2f%n", "Saldo da conta antes da cobrança: R$ ", this.getSaldo());
			System.out.println("Valor a pagar: R$ 20,00.\n\n");
			this.setSaldo(this.getSaldo() - 20);
			System.out.printf("%s%.2f%n", "Saldo da conta após a cobrança: R$ ", this.getSaldo());
			break;
		}
	}

	
	
	// Métodos Getters e Setters
	
	
	// get e set de status
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus (String status) {
		this.status = status;
	}
	
	
	// get e set de saldo
	public float getSaldo () {
		return this.saldo;
	}
	
	public void setSaldo (float saldo) {
		this.saldo = saldo;
	}
	
	
	// get e set de número da conta
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	
	// get e set de tipo de conta
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	// get e set de nome do dono
	public String getDono () {
		return this.dono;
	}
	
	public void setDono (String dono) {
		this.dono = dono;
	}
}
