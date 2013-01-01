package mitpreisberechner;

public class MietpreisBerechnerTest extends junit.framework.TestCase {

	protected MietpreisBerechner m;

	public void setUp() {
		m = new MietpreisBerechner();
	}

	public void testA() {
		long x = m.berechneMietpreis(1, 10);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 6000, x);

	}

	public void testB() {
		long x = m.berechneMietpreis(2, 0);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 8000, x);
	}

	public void testC() throws UngueltigeTagesanzahlAusnahme,
			UngueltigeKilometerangabeAusnahme {
		long x = m.berechneMietpreis(4, 200);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 12000, x);
	}

	public void testD() {
		long x = m.berechneMietpreis(8, 250);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 20750, x);
	}

	public void testE() {
		long x = m.berechneMietpreis(11, 199);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 26000, x);
	}

	public void testF() {
		long x = m.berechneMietpreis(13, 150);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 30000, x);
	}

	public void testG() {
		long x = m.berechneMietpreis(14, 150);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 31800, x);
	}

	public void testH() {
		long x = m.berechneMietpreis(20, 250);
		assertEquals("Mietpreis wird nicht korrekt berechnet!", 33000, x);
	}
}