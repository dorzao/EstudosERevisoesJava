package Testes;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import org.junit.jupiter.api.Test;

import CasosDeUso.PontuadorGeral;
import CasosDeUso.ValidadorDeDependentes;
import Entidades.Familia;
import Entidades.Membro;


class TestesUnitariosDigix {

	@Test
	void testeCauculoIdade() throws ParseException {
		assertEquals(Membro.calculoIdade("19/12/1995"), 27);
		
	}
	
	@Test
	void testeDeAdicaoDeMembros() throws ParseException {
		final Familia f1 = new Familia("apelido", "nis");
		f1.adicionarMembro(new Membro("nome","cpf", "19/12/1995", 950));
		assertEquals(f1.getMembros().size(), 1);
		
	}
	
	@Test
	void testePontuadorRendaAte900Retornando5() throws ParseException {
		Familia f1 = new Familia("a", "a");
		f1.setRenda(899);
		new PontuadorGeral(f1);
		assertEquals(5, f1.getPontosRenda());
		
	}
	
	@Test
	void testePontuadorRendaDe901Ate1500() throws ParseException {
		Familia f1 = new Familia("", "");
		f1.setRenda(901);
		f1.somarRenda();
		new PontuadorGeral(f1);
		final int obtido = f1.getPontosRenda();
		assertEquals(3, obtido);
		
	}
	
	@Test
	void testePontuadorDeDependentes3OuMais() throws ParseException {
		final int esperado = 3;
		Familia f1 = new Familia("Pessoa Qualquer", "nis qualquer");
		f1.adicionarMembro(new Membro("nome", "cpf", "11/11/2011", 899));
		f1.adicionarMembro(new Membro("nome", "cpf", "11/11/2011", 899));
		f1.adicionarMembro(new Membro("nome", "cpf", "11/11/2011", 899));
		new ValidadorDeDependentes(f1);
		new PontuadorGeral(f1);
		final int obtido = f1.getPontosDependentes();
		assertEquals(esperado, obtido);
		
	}

}
