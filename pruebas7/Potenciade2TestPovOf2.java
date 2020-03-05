package pruebas7;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test; 
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ejercicio7.Potenciade2;

	@RunWith(Parameterized.class)
	public class Potenciade2TestPovOf2 {
	private int nume1;
	private String resul;

	public Potenciade2TestPovOf2 (int nume1, String resul) {
	this.nume1 = nume1; 
	this.resul = resul;
	}

	@Parameters 
	public static Collection<Object[]> numeros() { 
	return Arrays.asList (new Object [][] {{3,"8"},{1,"2"},{0,"1"}});
	}

	@Test 
	public void testPovOf2() { 
	String resultado = Potenciade2.povOf2(nume1);
	assertEquals(resul, resultado); 
	}
}
