package ch.locatee.numeral;

public class NumeralInteger extends Numeral<NumeralInteger, Integer> {
	
	public NumeralInteger(int value) {
		this.baseValue = new Integer(value);
	}

	public NumeralInteger(String s) throws NumberFormatException {
		this.baseValue = new Integer(s);
	}

	public NumeralInteger add(NumeralInteger op) {
		return new NumeralInteger(baseValue + op.getBaseValue());
	}

	public NumeralInteger subtract(NumeralInteger op) {
		return new NumeralInteger(baseValue - op.getBaseValue());
	}

	public NumeralInteger divide(NumeralInteger op) {
		return new NumeralInteger(baseValue / op.getBaseValue());
	}

	public NumeralInteger modulo(NumeralInteger op) {
		return new NumeralInteger(baseValue % op.getBaseValue());
	}

	public NumeralInteger multiply(NumeralInteger op) {
		return new NumeralInteger(baseValue * op.getBaseValue());
	}

	public int compareTo(NumeralInteger o) {
		return this.baseValue.compareTo(o.getBaseValue());
	}
}
