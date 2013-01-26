package rekursion;

import junit.framework.TestCase;

import org.junit.Test;

public class RekursivAufgabenTest extends TestCase {

	@Test
	public void testPower() {
		int ergebnis = RekursivAufgaben.power(4, 3);
		assertEquals(64, ergebnis);
	}

	public void testFibonacci() {
		int ergebnis = RekursivAufgaben.fibIterativ(9);
		assertEquals(34, ergebnis);
	}

	public void testPalindrom() {
		boolean ergebnis = RekursivAufgaben.istPalindrom("Lagerregal");
		assertEquals(true, ergebnis);
	}

	public void testPalindromRekursiv() {
		RekursivAufgaben ra = new RekursivAufgaben();
		boolean ergebnis = ra.istPalindromRekursiv("anna");
		assertEquals(true, ergebnis);
	}

	public void testPalindromRekursiv1() {
		RekursivAufgaben ra = new RekursivAufgaben();
		boolean ergebnis = ra.istPalindromRekursiv("lagerregal");
		assertEquals(true, ergebnis);
	}

	public void testPalindromRekursiv2() {
		RekursivAufgaben ra = new RekursivAufgaben();
		boolean ergebnis = ra.istPalindromRekursiv("Arschloch");
		assertEquals(false, ergebnis);
	}

	public void testeMultipliziere1() {
		RekursivAufgaben ra = new RekursivAufgaben();
		long ergebnis = ra.multipliziere(4, 3);
		assertEquals(12, ergebnis);
	}

	public void testeMultipliziere2() {
		RekursivAufgaben ra = new RekursivAufgaben();
		long ergebnis = ra.multipliziere(7, 7);
		assertEquals(49, ergebnis);
	}

	public void testIllegalArguments() throws Exception {
		try {
			RekursivAufgaben ra = new RekursivAufgaben();
			ra.multipliziere(-7, 7);
			fail("Keine negativen Zahlen eingeben!");
		} catch (IllegalArgumentException expected) {
			assertTrue("Exception fliegt nicht!", expected.getMessage()
					.indexOf("") >= 0);
		}

	}

	public void testeKomischeRekursivAufgabe1() {
		RekursivAufgaben ra = new RekursivAufgaben();
		int ergebnis = ra.komischeRekursivAufgabe(4);
		assertEquals(8, ergebnis);
	}

	public void testeKomischeRekursivAufgabe2() {
		RekursivAufgaben ra = new RekursivAufgaben();
		int ergebnis = ra.komischeRekursivAufgabe(6);
		assertEquals(2, ergebnis);
	}
}
