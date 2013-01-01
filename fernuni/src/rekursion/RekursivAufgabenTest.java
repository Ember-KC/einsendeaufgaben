package rekursion;

import junit.framework.TestCase;

import org.junit.Test;

public class RekursivAufgabenTest extends TestCase {

	@Test
	public void testPower() {
		RekursivAufgaben ra = new RekursivAufgaben();
		int ergebnis = ra.power(4, 3);
		assertEquals(64, ergebnis);
	}

	public void testFibonacci() {
		RekursivAufgaben ra = new RekursivAufgaben();
		int ergebnis = ra.fibIterativ(9);
		assertEquals(34, ergebnis);
	}

	public void testPalindrom() {
		RekursivAufgaben ra = new RekursivAufgaben();
		boolean ergebnis = ra.istPalindrom("Lagerregal");
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
}
