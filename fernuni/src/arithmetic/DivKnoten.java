package arithmetic;

class DivKnoten extends BinaerOperatorKnoten {

	public DivKnoten(Knoten knoten1, Knoten knoten2) {
		super(knoten1, knoten2);
	}

	@Override
	public int werteAus() {
		if (liefereZweitenOperand().werteAus() == 0) {
			throw new ArithmeticException("Division durch 0!");
		}
		return liefereErstenOperand().werteAus()
				/ liefereZweitenOperand().werteAus();
	}

	public String toString() {
		return "(" + String.valueOf(liefereErstenOperand()) + " / "
				+ String.valueOf(liefereZweitenOperand()) + ")";
	}

}
