package ch.locatee.numeral.supports.math;

import ch.locatee.numeral.Numeral;

public interface SupportsDivide<T> {
	<U extends Numeral<U, ?>> U divide(T op);
}
