package einsendeaufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Woerterraten {

	StringBuffer erratenesWort;
	private String[] woerter = { "Schifffahrt", "Museum", "Gesellschaft",
			"Marktplatz" };

	String zuRatendesWort;

	/**
	 * erzeugt ein neues Spiel
	 */
	public Woerterraten() {
	}

	/**
	 * aktualisiert das bisher erratene Wort, indem alle Vorkommen von
	 * <code>c</code> aufgedeckt werden
	 * 
	 * @param c
	 *            der geratene Buchstabe
	 */
	void aktualisiereLoesung(char c) {
		for (int i = 0; i < erratenesWort.length(); i++) {

			if (zuRatendesWort.charAt(i) == c) {
				erratenesWort = erratenesWort.replace(i, i + 1,
						String.valueOf(c));
			}

		}
	}

	/**
	 * initialisiert das erratene Wort mit der entsprechenden Anzahl an
	 * Sternchen
	 */
	void init() {
		// der Stringbuffer mit der gleichen Länge wie das zu ratende Wort
		// angelegt
		erratenesWort = new StringBuffer(zuRatendesWort.length());
		for (int i = 0; i < zuRatendesWort.length(); i++) {
			// es werden entsprechend viele Sternchen erzeugt
			erratenesWort.append('*');
		}
	}

	/**
	 * startet das Spiel
	 */
	public void starteSpiel() {
		// ein neues Wort auswaehlen
		zuRatendesWort = zufallsWort().toUpperCase();
		// das erratene Wort initialisieren
		init();
		// Vorbereitungen zum Einlesen
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// zum Zaehlen der Versuche
		int counter = 0;
		System.out.println("Gesucht wird folgendes Wort:");
		System.out.println(erratenesWort);
		// solange das Wort noch nicht vollstaendig erraten wurde,
		// wird weitergeraten
		while (!zuRatendesWort.equals(erratenesWort.toString())) {
			System.out
					.println("Bitte geben Sie einen Buchstaben ein und bestaetigen Sie mit ENTER:");
			String line;
			try {
				// einlesen
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			if (line.isEmpty()) {
				// leere Zeilen ignorieren
				continue;
			}
			// in Grossbuchstaben umwandeln
			char c = Character.toUpperCase(line.charAt(0));
			// ueberpruefen ob Buchstabe schon erraten wurde
			if (erratenesWort.toString().contains(String.valueOf(c))) {
				System.out
						.println("Diesen Buchstaben haben sie schon erraten!");
				continue;
			}
			// Rateversuche erhoehen
			counter++;
			// pruefen ob Buchstabe enthalten
			if (!zuRatendesWort.contains(String.valueOf(c))) {
				System.out.println("Der Buchstabe " + c
						+ " ist nicht enthalten.");
				continue;
			}
			// bisher erratenes Wort aktualisieren
			aktualisiereLoesung(c);
			// aktuelles Rateergebnis ausgeben
			System.out.println("So sieht das Wort nun aus:");
			System.out.println(erratenesWort);
		}
		System.out.println("Glueckwunsch! Sie haben das Wort erraten: "
				+ erratenesWort);
		System.out.println("Sie haben " + counter + " Versuche benoetigt.");
	}

	/**
	 * erzeugt ein Zufallswort
	 * 
	 * @return ein Zufallswort
	 */
	private String zufallsWort() {
		// Zufallszahl im entsprechenden Intervall erzeugen [0,woerter.length[
		int i = (int) (Math.random() * woerter.length);
		return woerter[i];
	}

	/**
	 * erzeugt ein neues Spiel und startet es
	 * 
	 * @param args
	 *            wird nicht benoetigt
	 */
	public static void main(String[] args) {
		new Woerterraten().starteSpiel();
	}

}
