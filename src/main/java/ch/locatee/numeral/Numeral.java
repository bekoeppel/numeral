package ch.locatee.numeral;

import ch.locatee.numeral.supports.comparison.SupportsComparisonExpressions;
import ch.locatee.numeral.supports.math.SupportsMathExpressions;

public abstract class Numeral<T extends Numeral, N extends Number> extends Number
		implements SupportsMathExpressions<T>, SupportsComparisonExpressions<T>
{
	
	protected N baseValue;
	
	public N getBaseValue() {
		return baseValue;
	}

	@Override
	public int intValue() {
		return baseValue.intValue();
	}

	@Override
	public long longValue() {
		return baseValue.longValue();
	}

	@Override
	public float floatValue() {
		return baseValue.floatValue();
	}

	@Override
	public double doubleValue() {
		return baseValue.doubleValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Numeral<?, ?>) {
			return baseValue.equals(((Numeral<?, ?>) obj).getBaseValue());
		} else {
			return baseValue.equals(obj);
		}
	}

	@Override
	public int hashCode() {
		return baseValue.hashCode();
	}

	public boolean smallerThan(T op) {
		return this.compareTo(op) < 0;
	}

	public boolean smallerOrEqualThan(T op) {
		return this.compareTo(op) <= 0;
	}

	public boolean greaterThan(T op) {
		return this.compareTo(op) > 0;
	}

	public boolean greaterOrEqualThan(T op) {
		return this.compareTo(op) >= 0;
	}

	@Override
	public String toString() {
		return baseValue.toString();
	}
}
