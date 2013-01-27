package klausuruebungen;

public class Ringpuffer {
	private RingpufferElement in;
	private RingpufferElement out;

	public Ringpuffer(RingpufferElement in) {
		this.in = in;
		this.out = in;

	}

	public RingpufferElement getIn() {
		return in;
	}

	public void setIn(RingpufferElement in) {
		this.in = in;
	}

	public RingpufferElement getOut() {
		return out;
	}

	public void setOut(RingpufferElement out) {
		this.out = out;
	}

	public int lese() {
		int wert = this.getOut().getWert();
		this.getOut().deleteWert();
		this.setOut(this.getOut().getNaechster());
		return wert;
	}

	public void schreibe(int wert) {
		if (getIn().getWert() != 0) {
			System.out.println("Puffer voll");
		} else {
			this.getIn().setWert(wert);
			this.setIn(this.in.getNaechster());
		}
	}

	public void vergroessern() {
		this.setIn(this.getIn().getNaechster());
		RingpufferElement neuesElement = new RingpufferElement(this.getIn(), 0);
		this.setIn(neuesElement);
		this.getOut().setNaechster(neuesElement);
		this.setOut(neuesElement);

	}

	public int size() {
		int size = 1;
		RingpufferElement current = this.getIn();
		while (current.getNaechster() != this.getIn()) {
			current = current.getNaechster();
			size++;
		}

		return size;
	}

}
