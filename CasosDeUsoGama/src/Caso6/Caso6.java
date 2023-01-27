package Caso6;
/*
6) Desenvolva um algoritmo para o seguinte estudo de caso:
A empresa XYZ esta recrutando novos colaboradores e para isto requisitou a área e TI o desenvolvimento de um sistema que possibilite a entrada do nome do candidato, sua idade, escolaridade e que os recrutadores indiquem qual o candidato escolheram. 
Neste processo pode ser que o recrutador não optou por nenhum candidato, mas é preciso saber o número de votos não validos. 
O sistema ainda precisa indicar o total de inscrições e qual a quantidade e percentual de cada candidato.

a)	No primeiro momento deve ser escrito em portugol os passos do fluxo do algoritmo que contemple a solução;
b)	Na sequencia desenvolver o código em java.
 
 Passo 1: Criar uma classe (candidatos) e 2 métodos (cadastro e votação)
 Passo 1.1: Declarar todas as variáveis na classe candidatos
 Passo 2: Criar uma tela de bem-vindo, uma entrada que solicite a criação de candidatos
 Passo 3: Criar o método de cadastro, Solicitando nome, escolaridade, e idade, do candidato;
 Passo 3.1: Armazenar em vetores os campos do passo 3.
 Passo 4: Criar o método de votação, mostrando as opções na tela, e computando votos a cada entrada.
 Passo 5: Mostrar o resultado da votação com detalhes, nome, idade escolaridade, votos recebidos, total de votos, votos nulos, etc.
 Obs: Tentei criar os 2 métodos mas, ao criar o da votação, quando eu o instanciava com a classe de atributos, os valores da classe se perdiam e  migrei tudo para classe  cadastro
 
 Bootcamp Itaú / Gama Academy
 Aluno: Pedro Henrique
 Turma 4
 Data de criação/término: 12/01/2023 04:07;

 Obs2 (dia 23/01/2023 23:12): Descobri a referência 'this' seguida de ponto para manipular as variáveis de uma mesma classe, e consegui fazendo com 2 classes diferentes.

 
 */

public class Caso6 {
			
	public static void main(String[] args) {
		// Instanciando a classe  para o método principal
		Candidato c = new Candidato();
		
		// Chamando o método início da classe candidato
		c.inicio();
			
	}
		

}
