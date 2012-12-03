package einsendeaufgaben;

import junit.framework.TestCase;

public class WoerterratenTest extends TestCase {

	Woerterraten wr;

	public void setUp() {
		wr = new Woerterraten();
	}

	private void init(String wort) {
		wr.zuRatendesWort = wort;
		wr.init();
	}

	public void testeEinfachesVorkommenAnfang() {
		String w = "HAUS";
		char c = 'H';
		init(w);
		wr.aktualisiereLoesung(c);
		assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
				+ " nicht korrekt ersetzt", "H***", wr.erratenesWort.toString());
	}

	public void testeEinfachesVorkommenMitte() {
		String w = "HAUS";
		char c = 'A';
		init(w);
		wr.aktualisiereLoesung(c);
		assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
				+ " nicht korrekt ersetzt", "*A**", wr.erratenesWort.toString());
	}

	public void testeEinfachesVorkommenEnde() {
		String w = "HAUS";
		char c = 'S';
		init(w);
		wr.aktualisiereLoesung(c);
		assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
				+ " nicht korrekt ersetzt", "***S", wr.erratenesWort.toString());
	}

	public void testeMehrfachesVorkommen() {
		String w = "TEST";
		char c = 'T';
		init(w);
		wr.aktualisiereLoesung(c);
		assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
				+ " nicht korrekt ersetzt", "T**T", wr.erratenesWort.toString());
		wr = new Woerterraten();
		w = "ESTEAFAKATASDSATALOPTONMKTNKL";
		c = 'T';
		init(w);
		wr.aktualisiereLoesung(c);
		assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
				+ " nicht korrekt ersetzt", "**T******T*****T****T****T***",
				wr.erratenesWort.toString());
	}

	public void testeNurGleiche() {
		String w = "LLLLLLLL";
		char c = 'L';
		init(w);
		wr.aktualisiereLoesung(c);
		assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
				+ " nicht korrekt ersetzt", "LLLLLLLL",
				wr.erratenesWort.toString());
	}

	public void testeAlleBuchstabenEinfach() {
		for (char c = 'A'; c <= 'Z'; c++) {
			String w = "" + c;
			init(w);
			wr.aktualisiereLoesung(c);
			assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
					+ " nicht korrekt ersetzt", "" + c,
					wr.erratenesWort.toString());
		}
	}

	public void testeAlleBuchstabenMehrfach() {
		for (char c = 'A'; c <= 'Z'; c++) {
			String w = "" + c + c + c;
			init(w);
			wr.aktualisiereLoesung(c);
			assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
					+ " nicht korrekt ersetzt", "" + c + c + c,
					wr.erratenesWort.toString());
		}
	}

	public void testeSehrLangesWort() {
		String w = new String();
		String loesung = new String();
		char c = 'G';
		// hier kann die Laenge auch noch erhoeht werden, nur steigen die
		// Laufzeiten mit der Zeit sehr stark
		int laenge = 4000;
		for (long i = 0; i < laenge; i++) {
			w += "GP";
			loesung += "G*";
		}
		init(w);
		wr.aktualisiereLoesung(c);
		assertEquals("Der Buchstabe " + c + " wurde im Wort " + w
				+ " nicht korrekt ersetzt", loesung,
				wr.erratenesWort.toString());
	}

	public void testeMehrmaligenAufruf() {
		String w = "HOLUNDERBUSCH";
		String buchstaben = "CRDNBLHOUSE";
		init(w);
		for (char c : buchstaben.toCharArray()) {
			wr.aktualisiereLoesung(c);
		}
		assertEquals("Das komplette Erraten des Wortes " + w
				+ " hat nicht funktioniert", w, wr.erratenesWort.toString());
	}

}
