package stringliste;

import java.io.FileNotFoundException;

public class DateiNichtGefundenAusnahme extends FileNotFoundException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2472498160002159052L;
	private String name;

	public DateiNichtGefundenAusnahme(String name) {
		super("Datei wurde nicht gefunden.");
		this.name = name;
	}

	public String liefereDateinamen() {
		return this.name;
	}

}
