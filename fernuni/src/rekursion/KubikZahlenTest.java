package rekursion;

import junit.framework.TestCase;

import org.junit.Test;

public class KubikZahlenTest extends TestCase{

	@Test
	public void testKubikZahlRekursiv1() {
		KubikZahlen kubi = new KubikZahlen();
		int ergebnis = kubi.berechneSummeKubikZahlenRekursiv(4);
		assertEquals(100, ergebnis);
	
	}
	
	public void testKubikZahlRekursiv2() {
		KubikZahlen kubi = new KubikZahlen();
		int ergebnis = kubi.berechneSummeKubikZahlenRekursiv(6);
		assertEquals(441, ergebnis);
	
	}
	
	public void testKubikZahlIterativ1() {
		KubikZahlen kubi = new KubikZahlen();
		int ergebnis = kubi.berechneSummeKubikZahlenIterativ(6);
		assertEquals(441, ergebnis);
	
	}
	
	@Test
	public void testKubikZahlIterativ2() {
		KubikZahlen kubi = new KubikZahlen();
		int ergebnis = kubi.berechneSummeKubikZahlenIterativ(4);
		assertEquals(100, ergebnis);
	
	}

}
