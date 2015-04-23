package ch.locatee.numeral;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumeralDoubleTest {

	Double ii = 10.3;
	Double jj = 22.1;

	@Test
	public void testAdd() throws Exception {
		NumeralDouble i = new NumeralDouble(ii);
		NumeralDouble j = new NumeralDouble(jj);

		NumeralDouble expected = new NumeralDouble(ii+jj);
		NumeralDouble actual = i.add(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() throws Exception {
		NumeralDouble i = new NumeralDouble(ii);
		NumeralDouble j = new NumeralDouble(jj);

		NumeralDouble expected = new NumeralDouble(ii-jj);
		NumeralDouble actual = i.subtract(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() throws Exception {
		NumeralDouble i = new NumeralDouble(ii);
		NumeralDouble j = new NumeralDouble(jj);

		NumeralDouble expected = new NumeralDouble(ii/jj);
		NumeralDouble actual = i.divide(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testModulo() throws Exception {
		NumeralDouble i = new NumeralDouble(ii);
		NumeralDouble j = new NumeralDouble(jj);

		NumeralDouble expected = new NumeralDouble(ii%jj);
		NumeralDouble actual = i.modulo(j);
		assertEquals(actual, expected);

	}

	@Test
	public void testMultiply() throws Exception {
		NumeralDouble i = new NumeralDouble(ii);
		NumeralDouble j = new NumeralDouble(jj);

		NumeralDouble expected = new NumeralDouble(ii*jj);
		NumeralDouble actual = i.multiply(j);
		assertEquals(actual, expected);

	}
}
