package suchen_und_sortieren;

import junit.framework.TestCase;

import org.junit.Test;

public class FelderDurchsuchenTest extends TestCase {

	@Test
	public void testBestimmeAnzahl() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		int[] testfeld = { 3, 5, 6, 2, 7, 4, 9, 3 };
		int x = fd.bestimmeAnzahl(3, testfeld);
		assertEquals(2, x);

	}

	public void testBestimmeAnzahl1() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		int[] testfeld = { 1, 2, 6, 3, 4, 8, 1, 3, 5, 2, 7, 9, 1, 4, 5, 1, 4 };
		int x = fd.bestimmeAnzahl(1, testfeld);
		assertEquals(4, x);

	}

	public void testIstEnthalten() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		String[] testfeld = { "Sonne", "Mond", "Sterne" };
		boolean x = fd.istEnhalten("Weltall", testfeld);
		assertEquals(false, x);
	}

	public void testIstEnthalten1() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		String[] testfeld = { "Sonne", "Mond", "Sterne" };
		boolean x = fd.istEnhalten("Sonne", testfeld);
		assertEquals(true, x);
	}

	public void testIstEnthalten2() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		String[] testfeld = {};
		boolean x = fd.istEnhalten("Weltall", testfeld);
		assertEquals(false, x);
	}

	public void testMaximumFinden1() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		int[] testfeld = { 3, 5, 6, 2, 7, 4, 9, 3 };
		int x = fd.maximumFinden(testfeld);
		assertEquals(9, x);

	}

	public void testMaximumFinden2() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		int[] testfeld = { 1, 2, 6, 3, 4, 8, 1, 3, 5, 2, 7, 9, 1, 4, 5, 1, 4,
				50 };
		int x = fd.maximumFinden(testfeld);
		assertEquals(50, x);

	}

	public void testBestimmeAnfang() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		char[] charfeld = { 's', 't', 'b', 'e', 's', 'o', 'n', 'n', 'e', 't',
				'z' };
		int x = fd.bestimmeAnfangDesWortes(charfeld, "Sonne");
		assertEquals(4, x);
	}

	public void testIstEnthalteBinaer1() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		String wort = "g";
		String[] stringTest = { "c", "d", "e" };
		boolean ergebnis = fd.istEnthaltenBinaer(wort, stringTest);
		assertEquals(false, ergebnis);
	}

	public void testIstEnthalteBinaer2() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		String wort = "a";
		String[] stringTest = { "a", "d", "e" };
		boolean ergebnis = fd.istEnthaltenBinaer(wort, stringTest);
		assertEquals(true, ergebnis);
	}

	public void testIstEnthalteBinaer3() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		String wort = "a";
		String[] stringTest = { "c", "d", "e", "z" };
		boolean ergebnis = fd.istEnthaltenBinaer(wort, stringTest);
		assertEquals(false, ergebnis);
	}

	public void testIstEnthalteBinaer4() {
		FelderDurchsuchen fd = new FelderDurchsuchen();
		String wort = "d";
		String[] stringTest = { "a", "c", "d", "e", "l", "s", "t", "v", "z" };
		boolean ergebnis = fd.istEnthaltenBinaer(wort, stringTest);
		assertEquals(true, ergebnis);
	}
}
