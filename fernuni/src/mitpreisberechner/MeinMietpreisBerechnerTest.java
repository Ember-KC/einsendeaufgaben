package mitpreisberechner;

import junit.framework.TestCase;

public class MeinMietpreisBerechnerTest extends TestCase {

	private MeinMietpreisBerechner m;

	public void setUp() {
		m = new MeinMietpreisBerechner();
	}

	public void testNegativeTage() {
		try {
			m.berechneMietpreis(-10, 10);
			fail("Bei negativer Tagesanzahl wird keine Ausnahme geworfen.");
		} catch (UngueltigeTagesanzahlAusnahme e) {
			// das sollte passieren
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei negativer Tagesanzahl wird falsche Ausnahme geworfen.");
		}
	}

	public void testNullTage() {
		try {
			m.berechneMietpreis(0, 10);
			fail("Bei 0 Tagen wird keine Ausnahme geworfen.");
		} catch (UngueltigeTagesanzahlAusnahme e) {
			// das sollte passieren
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei 0 Tagen wird falsche Ausnahme geworfen.");
		}
	}

	public void testPositiveTage() {
		try {
			assertEquals("falscher Mietpreisberechnet", 30120,
					m.berechneMietpreis(20, 10));
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei positiver Tagesanzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei positiver Tagesanzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		}
	}

	public void testNegativeKilometer() {
		try {
			m.berechneMietpreis(10, -10);
			fail("Bei negativer Kilometeranzahl wird keine Ausnahme geworfen.");
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei negativer Kilometeranzahl wird falsche Ausnahme geworfen.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			// das sollte passieren
		}
	}

	public void testNullKilometer() {
		try {
			assertEquals("falscher Mietpreisberechnet", 8000,
					m.berechneMietpreis(2, 0));
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei 0 Kilometern wird Ausnahme geworfen, sollte aber nicht passieren.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei 0 Kilometern wird Ausnahme geworfen, sollte aber nicht passieren.");
		}
	}

	public void testPositiveKilometer() {
		try {
			assertEquals("falscher Mietpreisberechnet", 20000,
					m.berechneMietpreis(2, 1000));
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei positiver Kilometeranzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei positiver Kilometeranzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		}
	}

}
