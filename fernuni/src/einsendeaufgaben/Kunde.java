package einsendeaufgaben;

public class Kunde {

	private String name;

	/**
	 * erzeugt einen neuen Kunden mit dem entsprechenden Namen
	 * 
	 * @param n
	 *            der Name des Kunden
	 */
	public Kunde(String name) {
		this.name = name;
	}

	/**
	 * liefert den Namen des Kunden
	 * 
	 * @return der Name des Kunden
	 */
	public String liefereName() {
		return name;
	}
}