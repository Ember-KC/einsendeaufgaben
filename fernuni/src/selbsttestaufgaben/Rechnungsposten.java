package selbsttestaufgaben;

class Rechnungsposten {
	int anzahl;
	Artikel artikel;

	// TO DO: Gesamt-Nettopreis für die Position berechnen

	Rechnungsposten(final int anzahl, final Artikel artikel) {
		this.legeAnzahlFest(anzahl);
		this.legeArtikelFest(artikel);
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

	void legeAnzahlFest(final int neueAnzahl) {
		this.anzahl = neueAnzahl;
	}

	void legeArtikelFest(final Artikel neuerArtikel) {
		this.artikel = neuerArtikel;
	}

	double berechneGesamtbetrag() {
		return this.liefereAnzahl() * this.liefereArtikel().lieferePreis();
	}

	int liefereAnzahl() {
		return this.anzahl;
	}

	Artikel liefereArtikel() {
		return this.artikel;
	}
}