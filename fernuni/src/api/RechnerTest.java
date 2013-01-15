package api;

import java.io.IOException;

import junit.framework.TestCase;

public class RechnerTest extends TestCase {

	public void testeRechner1() throws IOException {
		Rechner rechner = new Rechner("daten/Zahlen.txt");
		long ergebnis = rechner.addiere();
		assertEquals("Fehler!", 177, ergebnis);
	}

	public void testeRechner2() throws IOException {
		Rechner rechner = new Rechner("daten/Zahlen01.txt");
		long ergebnis = rechner.addiere();
		assertEquals("Fehler!", 27, ergebnis);
	}

}
