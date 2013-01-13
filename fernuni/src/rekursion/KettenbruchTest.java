package rekursion;

import junit.framework.TestCase;

public class KettenbruchTest extends TestCase {

	private static final double delta = 0.00000000000001;

	public void testeKeineWerteIterativ() {
		Kettenbruch k = new Kettenbruch(new int[0]);
		assertEquals(
				"Ein Kettenbruch ohne Werte besitzt bei iterativer Auswertung nicht den Wert 0.",
				0.0, k.werteIterativAus());
	}

	public void testeEinenWertIterativ() {
		for (int i = -1000; i < 1000; i++) {
			Kettenbruch k = new Kettenbruch(new int[] { i });
			assertEquals(
					"Ein Kettenbruch mit einem Wert besitzt bei iterativer Auswertung nicht den entsprechenden Wert.",
					(double) i, k.werteIterativAus());
		}
	}

	public void testeKleineWerteAnzahlIterativ() {
		Kettenbruch k = new Kettenbruch(new int[] { 5, 2, 8 });
		double erg = 5.470588235294118;
		assertEquals("Das Ergebnis der iterativen Auwertung ist falsch.", erg,
				k.werteIterativAus(), delta);
		k = new Kettenbruch(new int[] { 5, 2, 8, 4 });
		erg = 5.4714285714285715;
		assertEquals("Das Ergebnis der iterativen Auwertung ist falsch.", erg,
				k.werteIterativAus(), delta);
		k = new Kettenbruch(new int[] { 1, 2, 3, 4 });
		erg = 1.4 + 1.0 / 30;
		assertEquals("Das Ergebnis der iterativen Auwertung ist falsch.", erg,
				k.werteIterativAus(), delta);
		k = new Kettenbruch(new int[] { 2, 2, 2, 2 });
		erg = 2.4166666666666665;
		assertEquals("Das Ergebnis der iterativen Auwertung ist falsch.", erg,
				k.werteIterativAus(), delta);
	}

	public void testeGroßeWerteAnzahlIterativ() {
		int[] werte = new int[100];
		for (int i = 0; i < werte.length; i++) {
			werte[i] = 1;
		}
		Kettenbruch k = new Kettenbruch(werte);
		double erg = 1.618033988749895;
		assertEquals("Das Ergebnis der iterativen Auwertung ist falsch.", erg,
				k.werteIterativAus(), delta);
		werte = new int[300];
		for (int i = 0; i < werte.length; i++) {
			werte[i] = 2;
		}
		k = new Kettenbruch(werte);
		erg = 2.414213562373095;
		assertEquals("Das Ergebnis der iterativen Auwertung ist falsch.", erg,
				k.werteIterativAus(), delta);
		werte = new int[1000];
		for (int i = 0; i < werte.length; i++) {
			werte[i] = 3;
		}
		k = new Kettenbruch(werte);
		erg = 3.302775637731995;
		assertEquals("Das Ergebnis der iterativen Auwertung ist falsch.", erg,
				k.werteIterativAus(), delta);
	}

	public void testeKeineWerteRekursiv() {
		Kettenbruch k = new Kettenbruch(new int[0]);
		assertEquals(
				"Ein Kettenbruch ohne Werte besitzt bei rekursiver Auswertung nicht den Wert 0.",
				0.0, k.werteRekursivAus());
	}

	public void testeEinenWertRekursiv() {
		for (int i = -1000; i < 1000; i++) {
			Kettenbruch k = new Kettenbruch(new int[] { i });
			assertEquals(
					"Ein Kettenbruch mit einem Wert besitzt bei rekursiver Auswertung nicht den entsprechenden Wert.",
					(double) i, k.werteRekursivAus());
		}
	}

	public void testeKleineWerteAnzahlRekursiv() {
		Kettenbruch k = new Kettenbruch(new int[] { 5, 2, 8 });
		double erg = 5.470588235294118;
		assertEquals("Das Ergebnis der rekursiven Auwertung ist falsch.", erg,
				k.werteRekursivAus(), delta);
		k = new Kettenbruch(new int[] { 5, 2, 8, 4 });
		erg = 5.4714285714285715;
		assertEquals("Das Ergebnis der rekursiven Auwertung ist falsch.", erg,
				k.werteRekursivAus(), delta);
		k = new Kettenbruch(new int[] { 1, 2, 3, 4 });
		erg = 1.4 + 1.0 / 30;
		assertEquals("Das Ergebnis der rekursiven Auwertung ist falsch.", erg,
				k.werteRekursivAus(), delta);
		k = new Kettenbruch(new int[] { 2, 2, 2, 2 });
		erg = 2.4166666666666665;
		assertEquals("Das Ergebnis der rekursiven Auwertung ist falsch.", erg,
				k.werteRekursivAus(), delta);
	}

	public void testeGroßeWerteAnzahlRekursiv() {
		int[] werte = new int[100];
		for (int i = 0; i < werte.length; i++) {
			werte[i] = 1;
		}
		Kettenbruch k = new Kettenbruch(werte);
		double erg = 1.618033988749895;
		assertEquals("Das Ergebnis der rekursiven Auwertung ist falsch.", erg,
				k.werteRekursivAus(), delta);
		werte = new int[300];
		for (int i = 0; i < werte.length; i++) {
			werte[i] = 2;
		}
		k = new Kettenbruch(werte);
		erg = 2.414213562373095;
		assertEquals("Das Ergebnis der rekursiven Auwertung ist falsch.", erg,
				k.werteRekursivAus(), delta);
		werte = new int[1000];
		for (int i = 0; i < werte.length; i++) {
			werte[i] = 3;
		}
		k = new Kettenbruch(werte);
		erg = 3.302775637731995;
		assertEquals("Das Ergebnis der rekursiven Auwertung ist falsch.", erg,
				k.werteRekursivAus(), delta);
	}

	public void testeWurzel2Folge() {
		for (int i = 1; i <= 100; i++) {
			int[] folge = Kettenbruch.berechneWurzel2Folge(i);
			assertEquals("Die Laenge der Wurzel-2-Folge ist falsch!", i,
					folge.length);
			assertEquals("Der erste Eintrag der Wurzel-2-Folge bei Laenge " + i
					+ " ist falsch", 1, folge[0]);
			for (int j = 1; j < i; j++) {
				assertEquals("Der Eintrag der Wurzel-2-Folge an Index " + j
						+ " ist bei Laenge " + i + " nicht 2.", 2, folge[j]);
			}
		}
	}

	public void testeEFolge() {
		for (int i = 1; i <= 20; i++) {
			int[] folge = Kettenbruch.berechneEFolge(i);
			assertEquals("Die Laenge der E-Folge ist falsch!", i, folge.length);
			assertEquals("Der erste Eintrag der E-Folge bei Laenge " + i
					+ " ist falsch", 2, folge[0]);
			for (int j = 1; j < i; j++) {
				assertEquals("Der Eintrag der E-Folge an Index " + j
						+ " ist bei Laenge " + i + " falsch.",
						(j % 3 == 2 ? 2 * (j / 3 + 1) : 1), folge[j]);
			}
		}
	}

	public void testeWurzel2Approximation() {
		double w2 = Kettenbruch.approximiereWurzel2(1);
		assertEquals("Das Ergebnis von Wurzel 2 ist bei n = 1 falsch.", 1.0,
				w2, delta);
		w2 = Kettenbruch.approximiereWurzel2(2);
		assertEquals("Das Ergebnis von Wurzel 2 ist bei n = 2 falsch.", 1.5,
				w2, delta);
		w2 = Kettenbruch.approximiereWurzel2(3);
		assertEquals("Das Ergebnis von Wurzel 2 ist bei n = 3 falsch.", 1.4,
				w2, delta);
		w2 = Kettenbruch.approximiereWurzel2(5);
		assertEquals("Das Ergebnis von Wurzel 2 ist bei n = 5 falsch.",
				1.4137931034482758, w2, delta);
		w2 = Kettenbruch.approximiereWurzel2(10);
		assertEquals("Das Ergebnis von Wurzel 2 ist bei n = 10 falsch.",
				1.4142136248948696, w2, delta);
		w2 = Kettenbruch.approximiereWurzel2(100);
		assertEquals("Das Ergebnis von Wurzel 2 ist bei n = 100 falsch.",
				1.4142135623730951, w2, delta);
	}

	public void testeEApproximation() {
		double w2 = Kettenbruch.approximiereE(1);
		assertEquals("Das Ergebnis von e ist bei n = 1 falsch.", 2.0, w2, delta);
		w2 = Kettenbruch.approximiereE(2);
		assertEquals("Das Ergebnis von e ist bei n = 2 falsch.", 3.0, w2, delta);
		w2 = Kettenbruch.approximiereE(3);
		assertEquals("Das Ergebnis von e ist bei n = 3 falsch.",
				2.6666666666666665, w2, delta);
		w2 = Kettenbruch.approximiereE(5);
		assertEquals("Das Ergebnis von e ist bei n = 5 falsch.",
				2.7142857142857144, w2, delta);
		w2 = Kettenbruch.approximiereE(10);
		assertEquals("Das Ergebnis von e ist bei n = 10 falsch.",
				2.718283582089552, w2, delta);
		w2 = Kettenbruch.approximiereE(100);
		assertEquals("Das Ergebnis von e ist bei n = 100 falsch.",
				2.7182818284590455, w2, delta);
	}
}
