package Testes;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import org.junit.jupiter.api.Test;

import CasosDeUso.PontuadorDependentes3OuMais;
import CasosDeUso.PontuadorDependentesEntre1E2;
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
		new PontuadorGeral(f1);
		assertEquals(3, f1.getPontosRenda());
		
	}
	
	@Test
	void testePontuadorDeDependentes3OuMais() throws ParseException {
		Familia f1 = new Familia("", "");
		f1.getDependentes().add(new Membro());
		f1.getDependentes().add(new Membro());
		f1.getDependentes().add(new Membro());
		new PontuadorDependentes3OuMais().pontuar(f1);
		assertEquals(3, f1.getPontosDependentes());
		
	}
	
	@Test
	void testePontuadorDeDependentesEntre1E2 () {
		Familia f1 = new Familia("", "");
		f1.getDependentes().add(new Membro());
		new PontuadorDependentesEntre1E2().pontuar(f1); 
		assertEquals(2, f1.getPontosDependentes());
	}

}
