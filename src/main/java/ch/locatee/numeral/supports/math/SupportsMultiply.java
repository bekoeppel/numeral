package ch.locatee.numeral.supports.math;

import ch.locatee.numeral.Numeral;

public interface SupportsMultiply<T> {
	<U extends Numeral<U, ?>> U multiply(T op);
}
