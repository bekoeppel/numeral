package ch.locatee.numeral;

public class NumeralByte extends Numeral<NumeralByte, Byte> {
	
	public NumeralByte(byte value) {
		this.baseValue = new Byte(value);
	}

	public NumeralByte(String s) throws NumberFormatException {
		this.baseValue = new Byte(s);
	}

	public int compareTo(NumeralByte o) {
		return this.baseValue.compareTo(o.getBaseValue());
	}

	public NumeralInteger add(NumeralByte op) {
		return new NumeralInteger(this.baseValue + op.getBaseValue());
	}

	public NumeralInteger divide(NumeralByte op) {
		return new NumeralInteger(this.baseValue / op.getBaseValue());
	}

	public NumeralInteger modulo(NumeralByte op) {
		return new NumeralInteger(this.baseValue % op.getBaseValue());
	}

	public NumeralInteger multiply(NumeralByte op) {
		return new NumeralInteger(this.baseValue * op.getBaseValue());
	}

	public NumeralInteger subtract(NumeralByte op) {
		return new NumeralInteger(this.baseValue - op.getBaseValue());
	}
}
