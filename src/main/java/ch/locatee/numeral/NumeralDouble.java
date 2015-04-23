package ch.locatee.numeral;

public class NumeralDouble extends Numeral<NumeralDouble, Double> {
	
	public NumeralDouble(double value) {
		this.baseValue = new Double(value);
	}

	public NumeralDouble(String s) throws NumberFormatException {
		this.baseValue = new Double(s);
	}

	public NumeralDouble add(NumeralDouble op) {
		return new NumeralDouble(baseValue + op.getBaseValue());
	}

	public NumeralDouble divide(NumeralDouble op) {
		return new NumeralDouble(baseValue / op.getBaseValue());
	}

	public NumeralDouble modulo(NumeralDouble op) {
		return new NumeralDouble(baseValue % op.getBaseValue());
	}

	public NumeralDouble multiply(NumeralDouble op) {
		return new NumeralDouble(baseValue * op.getBaseValue());
	}

	public NumeralDouble subtract(NumeralDouble op) {
		return new NumeralDouble(baseValue - op.getBaseValue());
	}

	public int compareTo(NumeralDouble o) {
		return this.baseValue.compareTo(o.baseValue);
	}
}
