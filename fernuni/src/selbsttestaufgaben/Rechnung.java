package selbsttestaufgaben;

class Rechnung {

	double betrag;
	double rabatt;
	Kunde rechnungsempfaenger;
	Rechnungsposten[] rechnungspositionen = new Rechnungsposten[100];;

	public static void main(String[] args) {
		String annasName = new String("Anna Müller");
		String annasAnschrift = "Mühlenweg 2, 12345 Irgendwo";
		Kunde kunde1 = new Kunde(annasName, annasAnschrift);
		Rechnung rechnung6 = new Rechnung();
		rechnung6.rechnungsempfaenger = kunde1;

		rechnung6.fuegePostenHinzu(25, new Artikel(13235354, "Kartoffel", 1.25,
				0.19));
		rechnung6
				.fuegePostenHinzu(25, new Artikel(2345678, "Eier", 1.50, 0.19));
		rechnung6.fuegePostenHinzu(25, new Artikel(9876573, "Zitronen", 0.99,
				0.19));
		rechnung6.legeRabattFest(0.04);
		rechnung6.gebeAus();
	}

	double berechneBruttopreis(Rechnungsposten[] rechnungspositionen) {
		double bruttopreis = 0;
		for (int i = 0; i < rechnungspositionen.length; i++) {
			if (rechnungspositionen[i] != null) {
				bruttopreis = bruttopreis
						+ rechnungspositionen[i].artikel.preis
						+ rechnungspositionen[i].artikel.preis
						* rechnungspositionen[i].artikel.mehrwertsteuer;
			} else
				break;
		}
		return bruttopreis;

	}

	public void fuegePostenHinzu(int anzahl, Artikel artikel) {
		for (int i = 0; i < this.rechnungspositionen.length; i++) {
			if (this.rechnungspositionen[i] == null) {
				this.rechnungspositionen[i] = new Rechnungsposten(anzahl,
						artikel);
				break;
			}

		}
		// this.betrag += anzahl * einzelpreis;
	}

	void legeRabattFest(final double neuerRabatt) {
		this.rabatt = neuerRabatt;
	}

	void legeRechnungsempfaengerFest(Kunde empfaenger) {
		this.rechnungsempfaenger = empfaenger;
	}

	double liefereRabatt() {
		return this.rabatt;
	}

	Kunde liefereRechnungsempfaenger() {
		return this.rechnungsempfaenger;
	}

	double berechneNettopreis() {
		return this.betrag * (1 - this.liefereRabatt());
	}

	void gebeAus() {
		System.out.println("An:");
		System.out.println(this.liefereRechnungsempfaenger().liefereName());
		System.out
				.println(this.liefereRechnungsempfaenger().liefereAnschrift());
		for (int i = 0; i < rechnungspositionen.length; i++) {
			if (rechnungspositionen[i] != null) {

				System.out.println(i + 1 + ": " + this.rechnungspositionen[i]);

			} else
				break;
		}

		System.out.print("Netto: ");
		System.out.println(this.berechneNettopreis());
		System.out.println("Brutto: ");
		System.out.println(this.berechneBruttopreis(rechnungspositionen));
	}
}