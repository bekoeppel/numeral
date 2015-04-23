package ch.locatee.numeral;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumeralTest {
	
	@Test
	public void test() {

		NumeralInteger iFrom = new NumeralInteger(10);
		NumeralInteger iTo = new NumeralInteger(22);
		NumeralInteger iStep = new NumeralInteger(10);

		NumeralInteger iExpected = new NumeralInteger(30);
		NumeralInteger iActual = findFirstBucketAfter(iFrom, iTo, iStep);
		assertEquals(iActual, iExpected);


		NumeralDouble dFrom = new NumeralDouble(10.2);
		NumeralDouble dTo = new NumeralDouble(22.5);
		NumeralDouble dStep = new NumeralDouble(10.1);

		NumeralDouble dExpected = new NumeralDouble(30.4);
		NumeralDouble dActual = findFirstBucketAfter(dFrom, dTo, dStep);
		assertEquals(dActual, dExpected);

	}

	/**
	 * Adds step to from to find the largest value, that is still smaller than to. Just 
	 * here to test how the Numerals can be used in generics.
	 * 
	 * @param from
	 * @param to
	 * @param step
	 * @param <N>
	 * @return
	 */
	<N extends Numeral<N,?>> N findFirstBucketAfter(N from, N to, N step) {

		/**
		 * Without generics, this would look like this:
		 * 
		 * while (from <= to) {
		 *     from += step;
		 * }
		 * return from;
		 * 
		 * However, with generics, this is not possible, because the <= and += operations are 
		 * part of the primitives, and not defined in the abstract java.lang.Numbers class.
		 */
		while (from.smallerThan(to)) {
			from = from.add(step);
		}
		
		return from;
	}

}
