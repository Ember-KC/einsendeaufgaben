package suchen_und_sortieren;

public class FelderDurchsuchen {

	public int bestimmeAnzahl(int wert, int[] feld) {
		if (feld == null) {
			return 0;
		}
		int anzahl = 0;
		for (int i : feld) {
			// Wert gefunden?
			if (i == wert) {
				anzahl++;
			}
		}
		return anzahl;
	}

	public boolean istEnhalten(String zeichenkette, String[] feld) {
		boolean istEnthalten = false;
		for (String s : feld) {

			if (s.equalsIgnoreCase(zeichenkette)) {
				istEnthalten = true;

			}

		}
		return istEnthalten;
	}

	public int maximumFinden(int[] feld) {
		int max = 0;
		for (int i : feld) {
			if (i > max) {
				max = i;
			}
		}
		return max;

	}

	public int bestimmeAnfangDesWortes(char[] feld, String wort) {
		int wortAnfang = -1;
		String feldBuchstaben = "";

		for (int i = 0; i < feld.length - wort.length() + 1; i++) {
			feldBuchstaben = "";
			for (int j = 0; j < wort.length(); j++) {
				feldBuchstaben = feldBuchstaben + feld[j + i];
			}
			if (feldBuchstaben.equalsIgnoreCase(wort)) {
				wortAnfang = i;
				break;

			}
		}

		return wortAnfang;

	}

	public boolean istEnthaltenBinaer(String wort, String[] feld) {
		boolean enthalten = false;
		// Länge des Feldes ermitteln
		int ende = feld.length;

		// aufhören wenn Feldlänge 1 oder 2 ist
		if (feld.length <= 2) {
			return (feld[0].equalsIgnoreCase(wort) || feld[feld.length - 1]
					.equalsIgnoreCase(wort));
		}
		int mitte = feld.length / 2;
		if (feld[mitte].equalsIgnoreCase(wort)) {
			enthalten = true;
		}
		// wenn Mitte < Suchwort ist: alles ab Mitte + 1 in ein neues Array
		// kopieren und die Methode erneut mit dem neuen Array aufrufen

		else if (suchwortGroesserAls(wort, feld[mitte])) {
			String[] kleineresFeld = new String[feld.length - mitte - 1];
			for (int j = 0; j < kleineresFeld.length; j++) {
				kleineresFeld[j] = feld[j + mitte + 1];
			}

			return istEnthaltenBinaer(wort, kleineresFeld);
		}
		// wenn Mitte >Suchwort ist: alles bis Mitte in ein neues Array
		// kopieren und die Methode erneut mit dem neuen Array aufrufen

		else {
			String[] kleineresFeld = new String[feld.length - mitte];
			for (int i = 0; i < mitte; i++) {

				kleineresFeld[i] = feld[i];
			}
			return istEnthaltenBinaer(wort, kleineresFeld);
		}

		return enthalten;
	}

	// Methode prüft, ob das Suchwort lexikalisch größer ist als das
	// Vergleichswort
	// Wenn das Suchwort lexikalisch größer ist, als das Suchwort, wird true
	// zurückgegeben
	private boolean suchwortGroesserAls(String suchwort, String vergleichswort) {
		boolean groesser = false;
		if (vergleichswort.compareToIgnoreCase(suchwort) < 0) {
			groesser = true;
		}
		return groesser;
	}
}
