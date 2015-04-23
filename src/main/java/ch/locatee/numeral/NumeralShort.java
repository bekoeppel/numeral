package ch.locatee.numeral;

public class NumeralShort extends Numeral<NumeralShort, Short> {
	
	public NumeralShort(short value) {
		this.baseValue = new Short(value);
	}

	public NumeralShort(String s) throws NumberFormatException {
		this.baseValue = new Short(s);
	}

	public int compareTo(NumeralShort o) {
		return this.baseValue.compareTo(o.getBaseValue());
	}

	public NumeralInteger add(NumeralShort op) {
		return new NumeralInteger(this.baseValue + op.getBaseValue());
	}

	public NumeralInteger divide(NumeralShort op) {
		return new NumeralInteger(this.baseValue / op.getBaseValue());
	}

	public NumeralInteger modulo(NumeralShort op) {
		return new NumeralInteger(this.baseValue % op.getBaseValue());
	}

	public NumeralInteger multiply(NumeralShort op) {
		return new NumeralInteger(this.baseValue * op.getBaseValue());
	}

	public NumeralInteger subtract(NumeralShort op) {
		return new NumeralInteger(this.baseValue - op.getBaseValue());
	}
}
