package ch.locatee.numeral.supports.math;

import ch.locatee.numeral.Numeral;

public interface SupportsSubtract<T> {
	<U extends Numeral<U, ?>> U subtract(T op);
}
