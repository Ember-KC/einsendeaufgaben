package klausuruebungen;

public class RingpufferElement {
	private RingpufferElement naechster;
	private int wert;

	public RingpufferElement(RingpufferElement naechster, int wert) {
		this.setNaechster(naechster);
		this.setWert(wert);

	}

	public RingpufferElement getNaechster() {
		return naechster;
	}

	public void setNaechster(RingpufferElement naechster) {
		this.naechster = naechster;
	}

	public void deleteWert() {
		this.wert = 0;
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

}
