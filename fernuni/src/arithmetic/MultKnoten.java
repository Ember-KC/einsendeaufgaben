package arithmetic;

class MultKnoten extends BinaerOperatorKnoten {

	public MultKnoten(Knoten knoten1, Knoten knoten2) {
		super(knoten1, knoten2);
	}

	@Override
	public int werteAus() {
		return liefereErstenOperand().werteAus()
				* liefereZweitenOperand().werteAus();
	}

	public String toString() {
		return "(" + String.valueOf(liefereErstenOperand()) + " * "
				+ String.valueOf(liefereZweitenOperand()) + ")";
	}

}
