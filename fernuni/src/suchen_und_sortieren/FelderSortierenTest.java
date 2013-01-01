package suchen_und_sortieren;

import junit.framework.TestCase;

import org.junit.Test;

public class FelderSortierenTest extends TestCase {

	@Test
	public void testAbsteigendSortieren1() {
		FelderSortieren fs = new FelderSortieren();
		String[] feld = { "d", "a", "f", "z", "u" };
		fs.sortiereAbsteigend(feld);
		int indexZ = 10;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i].equalsIgnoreCase("z")) {
				indexZ = i;
				break;

			}
		}
		assertEquals(0, indexZ);
	}

	public void testAbsteigendSortieren2() {
		FelderSortieren fs = new FelderSortieren();
		String[] feld = { "d", "a", "f", "z", "u" };
		fs.sortiereAbsteigend(feld);
		int indexU = 10;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i].equalsIgnoreCase("u")) {
				indexU = i;
				break;

			}
		}
		assertEquals(1, indexU);
	}

	public void testAbsteigendSortieren3() {
		FelderSortieren fs = new FelderSortieren();
		String[] feld = { "d", "a", "f", "z", "u", "a" };
		fs.sortiereAbsteigend(feld);
		int indexA = 10;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i].equalsIgnoreCase("a")) {
				indexA = i;
				break;

			}
		}
		assertEquals(4, indexA);
	}

	public void testAbsteigendSortieren4() {
		FelderSortieren fs = new FelderSortieren();
		int[] feld = { 4, 35, 23, 5, 2, 67, 45, 21 };
		fs.sortiereAbsteigend(feld);
		int indexA = 10;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] == 2) {
				indexA = i;
				break;

			}
		}
		assertEquals(7, indexA);
	}

	public void testAufsteigendSortieren1() {
		FelderSortieren fs = new FelderSortieren();
		String[] feld = { "d", "a", "f", "z", "u", "a" };
		fs.sortiereAufsteigend(feld);
		int indexA = 10;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i].equalsIgnoreCase("a")) {
				indexA = i;
				break;

			}
		}
		assertEquals(0, indexA);
	}

	public void testAufsteigendSortieren2() {
		FelderSortieren fs = new FelderSortieren();
		String[] feld = { "d", "a", "f", "z", "u", "a" };
		fs.sortiereAufsteigend(feld);
		int indexF = 10;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i].equalsIgnoreCase("f")) {
				indexF = i;
				break;

			}
		}
		assertEquals(3, indexF);
	}

	public void testSortieren1() {
		FelderSortieren fs = new FelderSortieren();
		double[] feld = { 4.00, 13.90, 4.50, 12.50 };
		fs.sortiere(feld);
		int index = 10;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] == 4.50) {
				index = i;
				break;

			}
		}
		assertEquals(1, index);
	}
}
