package selbsttestaufgaben;

class Rechnungsposten {
	int anzahl;
	Artikel artikel;

	// TODO: Gesamt-Nettopreis für die Position berechnen

	Rechnungsposten(final int anzahl, final Artikel artikel) {
		this.setAnzahl(anzahl);
		this.setArtikel(artikel);
	}

	@Override
	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append(anzahl);
		stb.append(" x ");
		stb.append(artikel.beschreibung);
		stb.append(" Euro ");
		stb.append(artikel.preis);
		return stb.toString();
	}

	void setAnzahl(final int neueAnzahl) {
		this.anzahl = neueAnzahl;
	}

	void setArtikel(final Artikel neuerArtikel) {
		this.artikel = neuerArtikel;
	}

	double berechneGesamtbetrag() {
		return this.getAnzahl() * this.getArtikel().getPreis();
	}

	int getAnzahl() {
		return this.anzahl;
	}

	Artikel getArtikel() {
		return this.artikel;
	}
}