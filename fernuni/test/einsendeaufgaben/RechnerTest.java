package einsendeaufgaben;

import junit.framework.TestCase;
import selbsttestaufgaben.Rechner;

public class RechnerTest extends TestCase {

	public void testeNegativzahlen() {
		Rechner r = new Rechner();
		int x = r.berechne(-2, -5);
		assertEquals(10, x);
	}

	public void testeNegativzahlen1() {
		Rechner r = new Rechner();
		int x = r.berechne(-2, 5);
		assertEquals(10, x);
	}

	public void testeNegativzahlen2() {
		Rechner r = new Rechner();
		int x = r.berechne(2, -5);
		assertEquals(10, x);
	}

	public void testeNegativzahlen3() {
		Rechner r = new Rechner();
		int x = r.berechne(2, 5);
		assertEquals(10, x);
	}
}
