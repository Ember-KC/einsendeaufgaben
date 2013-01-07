package listen;

public class Stapel {
	private StapelElement head;

	public Stapel() {
		this.head = null;

	}

	public boolean istLeer() {
		boolean status = false;
		if (this.liefereGroesse() == 0) {
			status = true;
		}
		return status;

	}

	public long liefereGroesse() {
		long groesse = 0;
		StapelElement current = this.head;
		for (int i = 0; current != null; i++) {
			groesse++;
			current = current.getNext();
		}
		return groesse;
	}

	public String liefereOberstesElement() {
		if (this.head == null) {
			return null;
		}
		return this.head.getEntry();
	}

	public String entferneOberstesElement() {
		String removedString = null;
		if (this.head == null) {
			return null;
		}
		removedString = this.head.getEntry();
		this.head = this.head.getNext();
		return removedString;
	}

	public void fuegeElementHinzu(String a) {
		StapelElement se = new StapelElement(a, this.head);
		this.head = se;
	}
}
