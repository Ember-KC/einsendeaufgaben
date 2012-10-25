package selbsttestaufgaben;

class Rechnungsposten {
	int anzahl;
	Artikel artikel;
	
	Rechnungsposten(final int anzahl, final Artikel artikel) {
		this.legeAnzahlFest(anzahl);
		this.legeArtikelFest(artikel);
	}
	
	void legeAnzahlFest(final int neueAnzahl) {
		this.anzahl = neueAnzahl;
	}
	
	void legeArtikelFest(final Artikel neuerArtikel) {
		this.artikel = neuerArtikel;
	}
	
	double berechneGesamtbetrag() {
		return this.liefereAnzahl()
		* this.liefereArtikel().lieferePreis();
	}
	
	int liefereAnzahl() {
		return this.anzahl;
	}
	
	Artikel liefereArtikel() {
		return this.artikel;
	}
}