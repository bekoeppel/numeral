package ch.locatee.numeral;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumeralByteTest {

	Byte ii = 10;
	Byte jj = 22;

	@Test
	public void testAdd() throws Exception {
		NumeralByte i = new NumeralByte(ii);
		NumeralByte j = new NumeralByte(jj);

		NumeralInteger expected = new NumeralInteger(ii+jj);
		NumeralInteger actual = i.add(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() throws Exception {
		NumeralByte i = new NumeralByte(ii);
		NumeralByte j = new NumeralByte(jj);

		NumeralInteger expected = new NumeralInteger(ii-jj);
		NumeralInteger actual = i.subtract(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() throws Exception {
		NumeralByte i = new NumeralByte(ii);
		NumeralByte j = new NumeralByte(jj);

		NumeralInteger expected = new NumeralInteger(ii/jj);
		NumeralInteger actual = i.divide(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testModulo() throws Exception {
		NumeralByte i = new NumeralByte(ii);
		NumeralByte j = new NumeralByte(jj);

		NumeralInteger expected = new NumeralInteger(ii%jj);
		NumeralInteger actual = i.modulo(j);
		assertEquals(actual, expected);

	}

	@Test
	public void testMultiply() throws Exception {
		NumeralByte i = new NumeralByte(ii);
		NumeralByte j = new NumeralByte(jj);

		NumeralInteger expected = new NumeralInteger(ii*jj);
		NumeralInteger actual = i.multiply(j);
		assertEquals(actual, expected);

	}
}
