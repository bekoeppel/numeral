package ch.locatee.numeral;

public class NumeralLong extends Numeral<NumeralLong, Long> {

	public NumeralLong(long value) {
		baseValue = new Long(value);
	}

	public NumeralLong(String s) throws NumberFormatException {
		baseValue = new Long(s);
	}

	public int compareTo(NumeralLong o) {
		return this.baseValue.compareTo(o.getBaseValue());
	}

	public NumeralLong add(NumeralLong op) {
		return new NumeralLong(this.baseValue + op.getBaseValue());
	}

	public NumeralLong divide(NumeralLong op) {
		return new NumeralLong(this.baseValue / op.getBaseValue());
	}

	public NumeralLong modulo(NumeralLong op) {
		return new NumeralLong(this.baseValue % op.getBaseValue());
	}

	public NumeralLong multiply(NumeralLong op) {
		return new NumeralLong(this.baseValue * op.getBaseValue());
	}

	public NumeralLong subtract(NumeralLong op) {
		return new NumeralLong(this.baseValue - op.getBaseValue());
	}
}
