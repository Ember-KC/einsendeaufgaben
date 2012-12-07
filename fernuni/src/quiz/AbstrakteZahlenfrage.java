package quiz;

class AbstrakteZahlenfrage implements Zahlenfrage {
	String frage;
	int punkte;
	private boolean istBeantwortet;
	protected int antwort;

	public AbstrakteZahlenfrage(String frage, int punkte) {
		this.frage = frage;
		this.punkte = punkte;

	}

	@Override
	public boolean istBeantwortet() {
		return istBeantwortet;
	}

	@Override
	public boolean istRichtigBeantwortet() {
		// wird in den Unterklassen implementiert
		return false;
	}

	@Override
	public void legeAntwortFest(int antwort) {
		this.istBeantwortet = true;
		this.antwort = antwort;
	}

	@Override
	public int liefereErreichtePunkte() {
		int punkte = 0;
		if (istRichtigBeantwortet()) {
			punkte = this.punkte;
		}

		return punkte;
	}

	// liefert den Fragetext der Aufgabe
	@Override
	public String liefereFrage() {
		return this.frage;
	}

	@Override
	public int liefereMoeglichePunkte() {
		return this.punkte;
	}

	@Override
	public int getPunkte() {
		return this.punkte;
	}

}
