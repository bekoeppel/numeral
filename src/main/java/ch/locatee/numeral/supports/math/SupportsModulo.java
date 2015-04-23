package ch.locatee.numeral.supports.math;

import ch.locatee.numeral.Numeral;

public interface SupportsModulo<T> {
	<U extends Numeral<U, ?>> U modulo(T op);
}
