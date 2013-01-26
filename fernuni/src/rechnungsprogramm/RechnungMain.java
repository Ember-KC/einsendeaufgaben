package rechnungsprogramm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RechnungMain {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Kassenanwendung kasse = null;
		try {
			kasse = new Kassenanwendung();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Bitte geben Sie den Namen des Kunden ein.");
		Scanner scan = new Scanner(System.in);
		String kundenName = scan.nextLine();
		System.out.println("Bitte geben Sie die Adresse des Kunden ein.");
		String kundenAnschrift = scan.nextLine();
		Kunde kunde = new Kunde(kundenName, kundenAnschrift);
		Rechnung rechnung = new Rechnung(kunde);
		System.out
				.println("Bitte geben Sie die gewünschten Artikelnummern ein.");
		String artikelNr = scan.nextLine();
		rechnung.fuegePostenHinzu(25, kasse.getArtikelMap().get(artikelNr));
		if (kasse.getArtikelMap().get(artikelNr) == null) {
			System.out.println("Artikelnummer existiert nicht.");
		}
		System.out.println("Rechnung wird erzeugt.");
		rechnung.bestimmeRabatt(rechnung.getRechnungsempfaenger());
		rechnung.berechneMehrwertsteuer(rechnung.rechnungspositionen);
		rechnung.speichern();
		scan.close();
	}
}
