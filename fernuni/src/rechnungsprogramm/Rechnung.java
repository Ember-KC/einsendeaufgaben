package rechnungsprogramm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

class Rechnung {

	private Kunde rechnungsempfaenger;
	List<Rechnungsposten> rechnungspositionen = new LinkedList<Rechnungsposten>();
	private static int rechnungsnummer = 0;
	private BigDecimal[] mehrwertsteuerBetraege = new BigDecimal[2];
	static final double VOLLEMWST = 0.19;
	static final double REDMWST = 0.07;
	static final double KEINEMWST = 0.00;

	public Rechnung(Kunde empfaenger) {
		this.rechnungsempfaenger = empfaenger;
		Rechnung.rechnungsnummer = Rechnung.holeNaechsteRechnungsnummer();
	}

	// Bruttopreis für Gesamtrechnung berechnen
	// TODO: Bruttoberechnung anpassen, so dass MwSt nicht mehr zeilenweise
	// berechnet wird

	private static int holeNaechsteRechnungsnummer() {
		int rechNr = 0;
		File f = new File("daten/letzteRechnungsnummer.txt");
		try {
			// letzte Rechnungsnummer holen und um 1 hochzählen
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String rechnungsnummer = br.readLine();
			rechNr = Integer.parseInt(rechnungsnummer) + 1;
			br.close();
			// aktuelle Rechnungsnummer speichern
			PrintWriter pw = new PrintWriter(f);
			pw.print(rechNr);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rechNr;
	}

	BigDecimal berechneBruttopreis(List<Rechnungsposten> rechnungspositionen) {
		double bruttopreis = 0;
		for (int i = 0; i < rechnungspositionen.size(); i++) {
			if (rechnungspositionen.get(i) != null) {
				bruttopreis = bruttopreis
						+ rechnungspositionen.get(i).artikel.preis
						+ rechnungspositionen.get(i).artikel.preis
						* rechnungspositionen.get(i).artikel.mehrwertsteuer;
			} else
				break;
		}
		BigDecimal bruttopreisGerundet = new BigDecimal(bruttopreis);
		bruttopreisGerundet = bruttopreisGerundet.setScale(2,
				BigDecimal.ROUND_HALF_UP);
		return bruttopreisGerundet;

	}

	// Nettopreis der Gesamtrechnung berechnen

	BigDecimal berechneNettopreis(List<Rechnungsposten> rechnungspositionen2) {

		double betrag = 0;
		for (int i = 0; i < rechnungspositionen2.size(); i++) {
			if (null != rechnungspositionen2.get(i)) {
				betrag = betrag + rechnungspositionen2.get(i).artikel.preis;
			} else
				break;
		}

		betrag = betrag * (1 - this.bestimmeRabatt(rechnungsempfaenger));
		BigDecimal betragGerundet = new BigDecimal(betrag);
		betragGerundet = betragGerundet.setScale(2, BigDecimal.ROUND_HALF_UP);

		return betragGerundet;

	}

	// Mehrwertsteuerbeträge berechnen
	// TODO: MwSt-Berechnung so anpassen, dass sie auf den REDUZIERTEN
	// Nettobetrag geht

	void berechneMehrwertsteuer(List<Rechnungsposten> rechnungspositionen2) {

		for (int i = 0; i < rechnungspositionen2.size(); i++) {
			if (null != rechnungspositionen.get(i)) {
				if (rechnungspositionen2.get(i).artikel.mehrwertsteuer == VOLLEMWST) {
					double volleMwst = 0;
					volleMwst = volleMwst
							+ rechnungspositionen2.get(i).artikel.preis
							* VOLLEMWST;
					BigDecimal mwstGerundet = new BigDecimal(volleMwst);
					mwstGerundet = mwstGerundet.setScale(2,
							BigDecimal.ROUND_HALF_UP);
					this.mehrwertsteuerBetraege[0] = mwstGerundet;
				} else if (rechnungspositionen2.get(i).artikel.mehrwertsteuer == REDMWST) {
					double reduzierteMwst = 0;
					reduzierteMwst = reduzierteMwst
							+ rechnungspositionen2.get(i).artikel.preis
							* REDMWST;
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
		this.rechnungspositionen.add(new Rechnungsposten(anzahl, artikel));
	}

	void setRechnungsempfaenger(Kunde empfaenger) {
		this.rechnungsempfaenger = empfaenger;
	}

	Kunde getRechnungsempfaenger() {
		return this.rechnungsempfaenger;
	}

	void gebeAus(PrintWriter printer) {
		printer.println("An:");
		printer.println(this.getRechnungsempfaenger().getName());
		printer.println(this.getRechnungsempfaenger().getAnschrift());
		for (Rechnungsposten posten : rechnungspositionen) {
			if (null != posten) {

				printer.println(posten);

			} else
				break;
		}

		printer.println("Netto: \u20ac "
				+ this.berechneNettopreis(rechnungspositionen) + "\n");
		printer.println("Reduzierte MwSt: \u20ac " + mehrwertsteuerBetraege[1]);
		printer.println("Volle MwSt: \u20ac " + mehrwertsteuerBetraege[0]);
		printer.println("Brutto: \u20ac "
				+ this.berechneBruttopreis(rechnungspositionen));
		printer.println("Sie sparen: "
				+ this.bestimmeRabatt(getRechnungsempfaenger()) * 100
				+ " Prozent.");
		printer.flush();

	}

	void gebeAus() {
		gebeAus(new PrintWriter(System.out));

	}

	void speichern() {
		try {
			File rechnungsDatei = new File("daten/" + rechnungsnummer + ".txt");
			if (rechnungsDatei.exists()) {
				System.out.println("Rechnung " + rechnungsnummer
						+ " existiert schon.");
			}
			PrintWriter printer = new PrintWriter(rechnungsDatei);
			gebeAus(printer);
			printer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden.");

		}

	}
}