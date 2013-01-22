package arithmetic;

abstract class BinaerOperatorKnoten implements Knoten {

	private Knoten knoten1;
	private Knoten knoten2;

	public BinaerOperatorKnoten(Knoten knoten1, Knoten knoten2) {
		if (knoten1 == null || knoten2 == null) {
			throw new IllegalArgumentException();
		}
		this.knoten1 = knoten1;
		this.knoten2 = knoten2;
	}

	public Knoten liefereErstenOperand() {
		return this.knoten1;
	}

	public Knoten liefereZweitenOperand() {
		return this.knoten2;
	}

}
