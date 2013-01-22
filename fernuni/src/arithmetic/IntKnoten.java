package arithmetic;

class IntKnoten implements Knoten {

	private int wert;

	public IntKnoten(int wert) {
		this.setWert(wert);
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

	@Override
	public int werteAus() {
		return getWert();
	}

	public String toString() {
		return String.valueOf(getWert());
	}

}
