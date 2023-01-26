package aulas_guanabara;
/*
 
 Exercício:
 Conta de banco, 2 pessoas (jubleu e creusa), cada um tem um dinheirinho.
 Passo 1: Eles criaram uma conta.
 jubleu poupança R$ 300 e cresua corrente.500R$ -> creusa sacará 100
 Passo 2: Classe conta do banco. Atributos:
 - n conta
 - tipo conta
 - nome dono
 - saldo
 - status (aberta ou fechada)
 
 Métodos:
 - Abrir nova conta
 - Fechar conta
 - depositar
 - sacar
 - pagar mensalidade
 
 passo 3:
 Somente 2 tipos de conta,
 Assim que abrir, status muda para aberta
 Ao abrir corrente, ganha 50 R$
 Ao abrir poupança, ganha R$ 150.
 
 sobre o método fechar conta:
 para fechar, o saldo não pode ser positivo e nem negativo.
 
 Sobre o método depositar:
 A conta deve estar aberta,
 
 Metodo sacar:
 conta deve estar aberta, saldo superior ou igual ao valor a sacar.
 
 Método pagar mensalidade:
 conta corrente valor R$ 12
 poupança R$ 20
 
 Método construtor:
 Sempre que uma conta for criada, status será fechada,
 saldo será 0.
 
 
 */
public class Aula_05 {

	public static void main(String[] args) {
		// Instanciando novo objeto conta 1 (c1)
		ContaBanco c1 = new ContaBanco();
		
		// Verificando funcionalidade do método construtor
		//System.out.println("Status: "+c1.getStatus());
		//System.out.printf("%s%.2f%n", "Saldo: R$ ", c1.getSaldo());
		
		// Tentando depositar e sacar sem ter conta
		c1.depositar(20);
		c1.sacar(50);
		
		// Abrindo a conta do Jubileu
		c1.abrirConta(1234, "Jubileu", "CP");
				
		
		//tentando fechar a conta com dinheiro nela
		c1.fecharConta();
		
		// Depositando 20 R$ após a conta ser criada
		c1.depositar(20);
		
		// Sacando 170
		c1.sacar(170);;
		
		// Arrumando dívidas
		c1.pagarMensalidade();
		
		// Tentando fechar conta com dívida
		c1.fecharConta();
		
		// Depositando os 20 para quitar e fechar a conta
		c1.depositar(20);
		c1.fecharConta();
		
		// instanciando novo objeto para a conta da Creusa
		ContaBanco c2 = new ContaBanco();
		
		// Abrindo a conta da Creusa
		c2.abrirConta(4321, "Creusa", "CC");
		
		// Depósito da Creusa
		c2.depositar(500);
		
		// Saque da Creusa para o tênis
		c2.sacar(550);
		
		// Pagamento mensal da Creusa
		c2.pagarMensalidade();
		
		// Depósito dos 12
		c2.depositar(12);
		
		// Fechando a conta de Creusa
		c2.fecharConta();
		
		
		
	}

}
