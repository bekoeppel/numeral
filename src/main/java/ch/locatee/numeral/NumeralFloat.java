package ch.locatee.numeral;

public class NumeralFloat extends Numeral<NumeralFloat, Float> {
	
	public NumeralFloat(float value) {
		baseValue = new Float(value);
	}

	public NumeralFloat(double value) {
		baseValue = new Float(value);
	}

	public NumeralFloat(String s) throws NumberFormatException {
		baseValue = new Float(s);
	}

	public int compareTo(NumeralFloat o) {
		return this.baseValue.compareTo(o.getBaseValue());
	}

	public NumeralFloat add(NumeralFloat op) {
		return new NumeralFloat(this.baseValue + op.getBaseValue());
	}

	public NumeralFloat divide(NumeralFloat op) {
		return new NumeralFloat(this.baseValue / op.getBaseValue());
	}

	public NumeralFloat modulo(NumeralFloat op) {
		return new NumeralFloat(this.baseValue % op.getBaseValue());
	}

	public NumeralFloat multiply(NumeralFloat op) {
		return new NumeralFloat(this.baseValue * op.getBaseValue());
	}

	public NumeralFloat subtract(NumeralFloat op) {
		return new NumeralFloat(this.baseValue - op.getBaseValue());
	}
}
