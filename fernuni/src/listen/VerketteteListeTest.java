package listen;

import junit.framework.TestCase;

import org.junit.Test;

public class VerketteteListeTest extends TestCase {

	@Test
	public void testVerketteteListe1() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		int ergebnis = liste.size();
		assertEquals(2, ergebnis);
	}

	public void testVerketteteListe2() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		int ergebnis = liste.size();
		assertEquals(4, ergebnis);
	}

	public void testListenSummeIterativ1() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		int ergebnis = liste.sumIterativ();
		assertEquals(91, ergebnis);

	}

	public void testListenSummeIterativ2() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		int ergebnis = liste.sumIterativ();
		assertEquals(58, ergebnis);

	}

	public void testListenSizeRekursiv() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		int ergebnis = liste.sizeRekursiv();
		assertEquals(2, ergebnis);

	}

	public void testListenSummeRekursiv1() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		int ergebnis = liste.sumRekursiv();
		assertEquals(58, ergebnis);

	}

	public void testListenSummeRekursiv2() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		int ergebnis = liste.sumRekursiv();
		assertEquals(91, ergebnis);

	}

	public void testContains1() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		boolean ergebnis = liste.contains(15);
		assertEquals(true, ergebnis);

	}

	public void testContains2() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		boolean ergebnis = liste.contains(30);
		assertEquals(false, ergebnis);

	}

	public void testGetRekursiv1() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		int ergebnis = liste.getRekursiv(2);
		assertEquals(11, ergebnis);

	}

	public void testGetRekursiv2() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		int ergebnis = liste.getRekursiv(3);
		assertEquals(47, ergebnis);

	}

	public void testGetIterativ1() {
		VerketteteListe liste = new VerketteteListe();
		liste.add(47);
		liste.add(11);
		liste.add(15);
		liste.add(18);
		int ergebnis = liste.getRekursiv(3);
		assertEquals(47, ergebnis);

	}

}
