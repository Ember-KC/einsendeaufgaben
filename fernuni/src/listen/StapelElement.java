package listen;

public class StapelElement {
	private String entry;
	private StapelElement next;

	public StapelElement(String entry, StapelElement next) {
		this.entry = entry;
		this.next = next;

	}

	public StapelElement getNext() {
		return this.next;
	}

	public void setNext(StapelElement stapelElement) {
		this.next = stapelElement;
	}

	public String getEntry() {
		return this.entry;
	}

	public void setEntry(String s) {
		this.entry = s;
	}

}
