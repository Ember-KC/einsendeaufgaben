package selbsttestaufgaben;

import java.math.BigDecimal;

class Rechnung {

	double betrag;
	double rabatt;
	Kunde rechnungsempfaenger;
	Rechnungsposten[] rechnungspositionen = new Rechnungsposten[100];
	BigDecimal[] mehrwertsteuerBetraege = new BigDecimal[2];
	static final double VOLLEMWST = 0.19;
	static final double REDMWST = 0.07;
	static final double KEINEMWST = 0.00;

	public static void main(String[] args) {
		String annasName = new String("Anna M�ller");
		String annasAnschrift = "M�hlenweg 2, 12345 Irgendwo";
		Kunde kunde1 = new Kunde(annasName, annasAnschrift);
		Rechnung rechnung6 = new Rechnung();
		rechnung6.rechnungsempfaenger = kunde1;

		rechnung6.fuegePostenHinzu(25, new Artikel(13235354, "Kartoffel", 1.25,
				VOLLEMWST));
		rechnung6.fuegePostenHinzu(25, new Artikel(2345678, "Eier", 1.50,
				REDMWST));
		rechnung6.fuegePostenHinzu(25, new Artikel(9876573, "Zitronen", 0.99,
				VOLLEMWST));
		rechnung6.bestimmeRabatt(rechnung6.rechnungsempfaenger);
		rechnung6.berechneMehrwertsteuer(rechnung6.rechnungspositionen);
		rechnung6.gebeAus();
	}

	// Bruttopreis f�r Gesamtrechnung berechnen
	// TODO: Bruttoberechnung anpassen, so dass MwSt nicht mehr zeilenweise
	// berechnet wird

	BigDecimal berechneBruttopreis(Rechnungsposten[] rechnungspositionen) {
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
		BigDecimal bruttopreisGerundet = new BigDecimal(bruttopreis);
		bruttopreisGerundet = bruttopreisGerundet.setScale(2,
				BigDecimal.ROUND_HALF_UP);
		return bruttopreisGerundet;

	}

	// Nettopreis der Gesamtrechnung berechnen

	BigDecimal berechneNettopreis(Rechnungsposten[] rechnungspositionen) {

		double betrag = 0;
		for (int i = 0; i < rechnungspositionen.length; i++) {
			if (rechnungspositionen[i] != null) {
				betrag = betrag + rechnungspositionen[i].artikel.preis;
			} else
				break;
		}

		betrag = betrag * (1 - this.bestimmeRabatt(rechnungsempfaenger));
		BigDecimal betragGerundet = new BigDecimal(betrag);
		betragGerundet = betragGerundet.setScale(2, BigDecimal.ROUND_HALF_UP);

		return betragGerundet;

	}

	// Mehrwertsteuerbetr�ge berechnen
	// TODO: MwSt-Berechnung so anpassen, dass sie auf den REDUZIERTEN
	// Nettobetrag geht

	void berechneMehrwertsteuer(Rechnungsposten[] rechnungspositionen) {

		for (int i = 0; i < rechnungspositionen.length; i++) {
			if (rechnungspositionen[i] != null) {
				if (rechnungspositionen[i].artikel.mehrwertsteuer == VOLLEMWST) {
					double volleMwst = 0;
					volleMwst = volleMwst
							+ rechnungspositionen[i].artikel.preis * VOLLEMWST;
					BigDecimal mwstGerundet = new BigDecimal(volleMwst);
					mwstGerundet = mwstGerundet.setScale(2,
							BigDecimal.ROUND_HALF_UP);
					this.mehrwertsteuerBetraege[0] = mwstGerundet;
				} else if (rechnungspositionen[i].artikel.mehrwertsteuer == REDMWST) {
					double reduzierteMwst = 0;
					reduzierteMwst = reduzierteMwst
							+ rechnungspositionen[i].artikel.preis * REDMWST;
					BigDecimal mwstGerundet = new BigDecimal(reduzierteMwst);
					mwstGerundet = mwstGerundet.setScale(2,
							BigDecimal.ROUND_HALF_UP);
					this.mehrwertsteuerBetraege[1] = mwstGerundet;

				}
			} else
				break;
		}

	}

	public final int bestimmeRabatt(Kunde kunde) {
		// TODO: Methode implementieren mit Unterscheidung zwischen Kunde und
		// Premiumkunde
		int discount = 0;
		return discount;
	}

	/**
	 * Test
	 * 
	 * @param anzahl
	 *            Anzahl der Artikel
	 * @param artikel
	 *            Artikel
	 */
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

	void setRechnungsempfaenger(Kunde empfaenger) {
		this.rechnungsempfaenger = empfaenger;
	}

	Kunde getRechnungsempfaenger() {
		return this.rechnungsempfaenger;
	}

	void gebeAus() {
		System.out.println("An:");
		System.out.println(this.getRechnungsempfaenger().getName());
		System.out.println(this.getRechnungsempfaenger().getAnschrift());
		for (int i = 0; i < rechnungspositionen.length; i++) {
			if (rechnungspositionen[i] != null) {

				System.out.println(i + 1 + ": " + this.rechnungspositionen[i]);

			} else
				break;
		}

		System.out.print("Netto: \u20ac "
				+ this.berechneNettopreis(rechnungspositionen) + "\n");
		System.out.println("Reduzierte MwSt: \u20ac "
				+ mehrwertsteuerBetraege[1]);
		System.out.println("Volle MwSt: \u20ac " + mehrwertsteuerBetraege[0]);
		System.out.println("Brutto: \u20ac "
				+ this.berechneBruttopreis(rechnungspositionen));
		System.out.println("Sie sparen: "
				+ this.bestimmeRabatt(getRechnungsempfaenger()) * 100
				+ " Prozent.");
	}
}