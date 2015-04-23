package ch.locatee.numeral;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumeralLongTest {

	Long ii = 10L;
	Long jj = 22L;

	@Test
	public void testAdd() throws Exception {
		NumeralLong i = new NumeralLong(ii);
		NumeralLong j = new NumeralLong(jj);

		NumeralLong expected = new NumeralLong(ii+jj);
		NumeralLong actual = i.add(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() throws Exception {
		NumeralLong i = new NumeralLong(ii);
		NumeralLong j = new NumeralLong(jj);

		NumeralLong expected = new NumeralLong(ii-jj);
		NumeralLong actual = i.subtract(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() throws Exception {
		NumeralLong i = new NumeralLong(ii);
		NumeralLong j = new NumeralLong(jj);

		NumeralLong expected = new NumeralLong(ii/jj);
		NumeralLong actual = i.divide(j);
		assertEquals(actual, expected);
	}

	@Test
	public void testModulo() throws Exception {
		NumeralLong i = new NumeralLong(ii);
		NumeralLong j = new NumeralLong(jj);

		NumeralLong expected = new NumeralLong(ii%jj);
		NumeralLong actual = i.modulo(j);
		assertEquals(actual, expected);

	}

	@Test
	public void testMultiply() throws Exception {
		NumeralLong i = new NumeralLong(ii);
		NumeralLong j = new NumeralLong(jj);

		NumeralLong expected = new NumeralLong(ii*jj);
		NumeralLong actual = i.multiply(j);
		assertEquals(actual, expected);

	}
}
