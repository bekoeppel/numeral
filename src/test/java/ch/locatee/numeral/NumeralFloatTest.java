package ch.locatee.numeral;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumeralFloatTest {

	Float ii = 10.3f;
	Float jj = 22.1f;

	@Test
	public void testAdd() throws Exception {
		NumeralFloat i = new NumeralFloat(ii);
		NumeralFloat j = new NumeralFloat(jj);

		NumeralFloat expected = new NumeralFloat(ii+jj);
		NumeralFloat actual = i.add(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() throws Exception {
		NumeralFloat i = new NumeralFloat(ii);
		NumeralFloat j = new NumeralFloat(jj);

		NumeralFloat expected = new NumeralFloat(ii-jj);
		NumeralFloat actual = i.subtract(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() throws Exception {
		NumeralFloat i = new NumeralFloat(ii);
		NumeralFloat j = new NumeralFloat(jj);

		NumeralFloat expected = new NumeralFloat(ii/jj);
		NumeralFloat actual = i.divide(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testModulo() throws Exception {
		NumeralFloat i = new NumeralFloat(ii);
		NumeralFloat j = new NumeralFloat(jj);

		NumeralFloat expected = new NumeralFloat(ii%jj);
		NumeralFloat actual = i.modulo(j);
		assertEquals(actual, expected);

	}

	@Test
	public void testMultiply() throws Exception {
		NumeralFloat i = new NumeralFloat(ii);
		NumeralFloat j = new NumeralFloat(jj);

		NumeralFloat expected = new NumeralFloat(ii*jj);
		NumeralFloat actual = i.multiply(j);
		assertEquals(actual, expected);

	}
}
