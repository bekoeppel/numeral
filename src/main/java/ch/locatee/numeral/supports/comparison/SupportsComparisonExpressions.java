package ch.locatee.numeral.supports.comparison;

public interface SupportsComparisonExpressions<T> extends Comparable<T> {
	boolean smallerThan(T op);
	boolean smallerOrEqualThan(T op);
	boolean greaterThan(T op);
	boolean greaterOrEqualThan(T op);
}
