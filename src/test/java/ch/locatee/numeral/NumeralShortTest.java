package ch.locatee.numeral;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumeralShortTest {

	Short ii = 10;
	Short jj = 22;

	@Test
	public void testAdd() throws Exception {
		NumeralShort i = new NumeralShort(ii);
		NumeralShort j = new NumeralShort(jj);

		NumeralInteger expected = new NumeralInteger(ii+jj);
		NumeralInteger actual = i.add(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() throws Exception {
		NumeralShort i = new NumeralShort(ii);
		NumeralShort j = new NumeralShort(jj);

		NumeralInteger expected = new NumeralInteger(ii-jj);
		NumeralInteger actual = i.subtract(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() throws Exception {
		NumeralShort i = new NumeralShort(ii);
		NumeralShort j = new NumeralShort(jj);

		NumeralInteger expected = new NumeralInteger(ii/jj);
		NumeralInteger actual = i.divide(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testModulo() throws Exception {
		NumeralShort i = new NumeralShort(ii);
		NumeralShort j = new NumeralShort(jj);

		NumeralInteger expected = new NumeralInteger(ii%jj);
		NumeralInteger actual = i.modulo(j);
		assertEquals(actual, expected);

	}

	@Test
	public void testMultiply() throws Exception {
		NumeralShort i = new NumeralShort(ii);
		NumeralShort j = new NumeralShort(jj);

		NumeralInteger expected = new NumeralInteger(ii*jj);
		NumeralInteger actual = i.multiply(j);
		assertEquals(actual, expected);

	}
}
