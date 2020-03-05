package pruebas7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Potenciade2Test {

	@Test
	int testPovOf2_1() {
		Potenciade2Test potencia = new Potenciade2Test(0);
		int resultado = potencia.testPovOf2_1();
		assertEquals("1", resultado);
		return resultado;
	}
	
	@Test
	int testPovOf2_2() {
		Potenciade2Test potencia = new Potenciade2Test(1);
		int resultado = potencia.testPovOf2_2();
		assertEquals("1", resultado);
		return resultado;
	}
	
	@Test
	int testPovOf2_3() {
		Potenciade2Test potencia = new Potenciade2Test(5);
		int resultado = potencia.testPovOf2_3();
		assertEquals("32",resultado);
	}
	
	@Test
	int testPovOf2_4() {
		Potenciade2Test potencia = new Potenciade2Test(6);
		int resultado = potencia.testPovOf2_4();
		assertEquals("64", resultado);
	}
	
	@Test
	int testPovOf2_5() {
		Potenciade2Test potencia = new Potenciade2Test(100);
		int resultado = potencia.testPovOf2_5();
		assertEquals("100", resultado);
		return resultado;
	}

}
