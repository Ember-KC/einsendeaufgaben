package listen;

import junit.framework.TestCase;

public class StapelTest extends TestCase {

	public void testeStapelErzeugung() {
		Stapel s = new Stapel();
		assertTrue(
				"Ein neu erzeugter Stapel ist nicht leer, sollte es aber sein.",
				s.istLeer());
		assertEquals("Die Groesse des neuen Stapels betraegt nicht 0.", 0,
				s.liefereGroesse());
		assertNull(
				"liefereOberstesElement liefert bei neu erzeugtem Stapel nicht null",
				s.liefereOberstesElement());
		assertNull(
				"entferneOberstesElement liefert bei neu erzeugtem Stapel nicht null",
				s.entferneOberstesElement());
	}

	public void testeGroesseNachHinzufuegen() {
		Stapel s = new Stapel();
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu("" + i);
			assertEquals("Falsche Groesse nach Hinzufuegen.", i,
					s.liefereGroesse());
		}
	}

	public void testeGroesseNachHinzufuegenUndEntfernen() {
		Stapel s = new Stapel();
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu("" + i);
		}
		for (int i = 99; i >= 0; i--) {
			s.entferneOberstesElement();
			assertEquals("Falsche Groesse nach Entfernen.", i,
					s.liefereGroesse());
		}
	}

	public void testeIstLeerNachHinzufuegen() {
		Stapel s = new Stapel();
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu("" + i);
			assertFalse("Befuellter Stapel ist angeblich leer.", s.istLeer());
		}
	}

	public void testeIstLeerNachHinzufuegenUndEntfernen() {
		Stapel s = new Stapel();
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu("" + i);
		}
		for (int i = 99; i > 0; i--) {
			s.entferneOberstesElement();
			assertFalse("Befuellter Stapel ist angeblich leer.", s.istLeer());
		}
		s.entferneOberstesElement();
		assertTrue("Befuellter und geleerter Stapel ist nicht leer.",
				s.istLeer());
		assertTrue("Befuellter und geleerter Stapel ist nicht leer.",
				s.istLeer());
		assertTrue("Befuellter und geleerter Stapel ist nicht leer.",
				s.istLeer());
	}

	public void testeLiefereOberstesNachHinzufuegen() {
		Stapel s = new Stapel();
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu("" + i);
			assertEquals("Falsches Oberstes Element nach Hinzufuegen.", "" + i,
					s.liefereOberstesElement());
			assertEquals("Falsches Oberstes Element bei wiederholtem Aufruf.",
					"" + i, s.liefereOberstesElement());
			assertEquals("Falsches Oberstes Element bei wiederholtem Aufruf.",
					"" + i, s.liefereOberstesElement());
		}
	}

	public void testeLiefereOberstesNachHinzufuegenUndEntfernen() {
		Stapel s = new Stapel();
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu("" + i);
		}
		for (int i = 99; i > 0; i--) {
			s.entferneOberstesElement();
			assertEquals("Falsches Oberstes Element nach Entfernen.", "" + i,
					s.liefereOberstesElement());
			assertEquals("Falsches Oberstes Element bei wiederholtem Aufruf.",
					"" + i, s.liefereOberstesElement());
			assertEquals("Falsches Oberstes Element bei wiederholtem Aufruf.",
					"" + i, s.liefereOberstesElement());
		}
		s.entferneOberstesElement();
		assertNull(
				"Nach dem Entfernen aller Elemente wird nicht null zurueckgeliefert",
				s.liefereOberstesElement());
		assertNull(
				"Nach dem Entfernen aller Elemente wird nicht null zurueckgeliefert",
				s.liefereOberstesElement());
		assertNull(
				"Nach dem Entfernen aller Elemente wird nicht null zurueckgeliefert",
				s.liefereOberstesElement());
	}

	public void testeMehrmaligesEntfernenAufLeerenStapel() {
		Stapel s = new Stapel();
		for (int i = 1; i <= 100; i++) {
			assertNull("Entfernen auf leeren Stapel liefert nicht null.",
					s.entferneOberstesElement());
		}
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu("" + i);
		}
		for (int i = 1; i <= 100; i++) {
			s.entferneOberstesElement();
		}
		for (int i = 1; i <= 100; i++) {
			assertNull("Entfernen auf geleerten Stapel liefert nicht null.",
					s.entferneOberstesElement());
		}
	}

	public void testeGroesseNachHinzufuegenGleicherElemente() {
		Stapel s = new Stapel();
		String a = "A";
		for (int i = 1; i <= 100; i++) {
			s.fuegeElementHinzu(a);
			assertEquals("Falsche Groesse nach Hinzufuegen.", i,
					s.liefereGroesse());
		}
	}

}
