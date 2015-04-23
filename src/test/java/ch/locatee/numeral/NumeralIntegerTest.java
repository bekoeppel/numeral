package ch.locatee.numeral;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumeralIntegerTest {
	
	Integer ii = 10;
	Integer jj = 22;

	@Test
	public void testAdd() throws Exception {
		NumeralInteger i = new NumeralInteger(ii);
		NumeralInteger j = new NumeralInteger(jj);
		
		NumeralInteger expected = new NumeralInteger(ii+jj);
		NumeralInteger actual = i.add(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() throws Exception {
		NumeralInteger i = new NumeralInteger(ii);
		NumeralInteger j = new NumeralInteger(jj);

		NumeralInteger expected = new NumeralInteger(ii-jj);
		NumeralInteger actual = i.subtract(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() throws Exception {
		NumeralInteger i = new NumeralInteger(ii);
		NumeralInteger j = new NumeralInteger(jj);

		NumeralInteger expected = new NumeralInteger(ii/jj);
		NumeralInteger actual = i.divide(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testModulo() throws Exception {
		NumeralInteger i = new NumeralInteger(ii);
		NumeralInteger j = new NumeralInteger(jj);

		NumeralInteger expected = new NumeralInteger(ii%jj);
		NumeralInteger actual = i.modulo(j);
		assertEquals(actual, expected);

	}

	@Test
	public void testMultiply() throws Exception {
		NumeralInteger i = new NumeralInteger(ii);
		NumeralInteger j = new NumeralInteger(jj);

		NumeralInteger expected = new NumeralInteger(ii*jj);
		NumeralInteger actual = i.multiply(j);
		assertEquals(actual, expected);

	}
}
