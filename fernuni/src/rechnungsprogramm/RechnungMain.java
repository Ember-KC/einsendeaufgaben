package rechnungsprogramm;

import java.io.FileNotFoundException;


public class RechnungMain {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String annasName = new String("Anna Müller");
		String annasAnschrift = "Mühlenweg 2, 12345 Irgendwo";
		Kunde kunde1 = new Kunde(annasName, annasAnschrift);
		Rechnung rechnung6 = new Rechnung(kunde1);

		rechnung6.fuegePostenHinzu(25, new Artikel(13235354, "Kartoffel", 1.25,
				Rechnung.VOLLEMWST));
		rechnung6.fuegePostenHinzu(25, new Artikel(2345678, "Eier", 1.50,
				Rechnung.REDMWST));
		rechnung6.fuegePostenHinzu(25, new Artikel(9876573, "Zitronen", 0.99,
				Rechnung.VOLLEMWST));
		rechnung6.bestimmeRabatt(rechnung6.getRechnungsempfaenger());
		rechnung6.berechneMehrwertsteuer(rechnung6.rechnungspositionen);
		rechnung6.speichern();
	}
}
