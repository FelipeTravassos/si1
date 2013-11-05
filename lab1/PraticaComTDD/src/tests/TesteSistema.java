package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sistema.SistemaEscreveNumero;

public class TesteSistema {

	@Test
	public void testMaisSimplesPOssivel() {
		SistemaEscreveNumero sistema = new SistemaEscreveNumero();
		
		assertEquals(sistema.getNumeroEscrito(10), "dez");
		assertEquals(sistema.getNumeroEscrito(9), "nove");
		assertEquals(sistema.getNumeroEscrito(0), "zero");
		assertEquals(sistema.getNumeroEscrito(5), "cinco");
		assertEquals(sistema.getNumeroEscrito(7), "sete");
	}
	


}
