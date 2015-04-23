package ch.locatee.numeral.supports.math;

import ch.locatee.numeral.Numeral;

public interface SupportsAdd<T> {
	<U extends Numeral<U, ?>> U add(T op);
}
