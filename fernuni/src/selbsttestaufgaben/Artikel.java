package selbsttestaufgaben;

class Artikel {
	long artikelnr;
	String beschreibung;
	double preis;
	double mehrwertsteuer;

	Artikel(final long artikelnr, final String beschreibung,
			final double preis, double mehrwertsteuer) {
		this.setArtikelnummer(artikelnr);
		this.setBeschreibung(beschreibung);
		this.setPreis(preis);
		this.setMehrwertsteuer(mehrwertsteuer);
	}

	void setArtikelnummer(final long neueNr) {
		this.artikelnr = neueNr;
	}

	void setBeschreibung(final String neueB) {
		this.beschreibung = neueB;
	}

	void setMehrwertsteuer(double neueMehrwertsteuer) {
		this.mehrwertsteuer = neueMehrwertsteuer;
	}

	void setPreis(final double neuerPreis) {
		this.preis = neuerPreis;
	}

	long getArtikelnummer() {
		return this.artikelnr;
	}

	String getBeschreibung() {
		return this.beschreibung;
	}

	double getPreis() {
		return this.preis;
	}

	double getMehrwertsteuer() {
		return this.mehrwertsteuer;
	}
}