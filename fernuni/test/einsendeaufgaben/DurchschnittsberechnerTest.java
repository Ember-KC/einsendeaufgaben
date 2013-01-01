package einsendeaufgaben;

import junit.framework.TestCase;
import selbsttestaufgaben.Durchschnittsberechner;

public class DurchschnittsberechnerTest extends TestCase {

	public void testeKleinesPositivesArray() {
		Durchschnittsberechner durch = new Durchschnittsberechner();
		double[] kleinesPositivesArray = { 2.00, 3.00 };
		double ergebnis = durch.berechneDurchschnitt(kleinesPositivesArray);
		assertEquals(2.5, ergebnis);

	}

	public void testeNullArray() {
		Durchschnittsberechner durch = new Durchschnittsberechner();
		double[] kleinesPositivesArray = null;
		double ergebnis = durch.berechneDurchschnitt(kleinesPositivesArray);
		assertEquals(0.0, ergebnis);

	}

	public void testeLeeresArray() {
		Durchschnittsberechner durch = new Durchschnittsberechner();
		double[] kleinesPositivesArray = { 0.00 };
		double ergebnis = durch.berechneDurchschnitt(kleinesPositivesArray);
		assertEquals(0.00, ergebnis);

	}

	public void testeNegativesArray() {
		Durchschnittsberechner durch = new Durchschnittsberechner();
		double[] kleinesPositivesArray = { -4.00, -3.00, -2.00 };
		double ergebnis = durch.berechneDurchschnitt(kleinesPositivesArray);
		assertEquals(-3.00, ergebnis);

	}

}
