package Testes;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import org.junit.jupiter.api.Test;

import Entidades.Membro;

class TestesUnitariosDigix {

	@Test
	void testeCauculoIdade() throws ParseException {
		final int esperado = 27;
		final int obtido = Membro.calculoIdade("19/12/1995");
		System.out.println(obtido);
		assertEquals(obtido, esperado);
		
	}

}
