package mitpreisberechner;

import java.util.Enumeration;

import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class MietpreisBerechnerTestTest extends TestCase {

	public void setUp() {
	}

	public void testTestA() {
		String name = "testA";
		MyTest.t = 1;
		MyTest.k = 10;
		MyTest.r = 0;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 6000;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
			// fail(name + " stuft richtige Implementierung als falsch ein!");
		}

	}

	public void testTestB() {
		String name = "testB";
		MyTest.t = 2;
		MyTest.k = 0;
		MyTest.r = 8001;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 8000;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
		}

	}

	public void testTestC() {
		String name = "testC";
		MyTest.t = 4;
		MyTest.k = 200;
		MyTest.r = 11999;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 12000;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
		}

	}

	public void testTestD() {
		String name = "testD";
		MyTest.t = 8;
		MyTest.k = 250;
		MyTest.r = 21000;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 20750;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
		}

	}

	public void testTestE() {
		String name = "testE";
		MyTest.t = 11;
		MyTest.k = 199;
		MyTest.r = 0;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 26000;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
		}

	}

	public void testTestF() {
		String name = "testF";
		MyTest.t = 13;
		MyTest.k = 150;
		MyTest.r = 300;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 30000;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
		}

	}

	public void testTestG() {
		String name = "testG";
		MyTest.t = 14;
		MyTest.k = 150;
		MyTest.r = 0;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 31800;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
		}

	}

	public void testTestH() {
		String name = "testH";
		MyTest.t = 20;
		MyTest.k = 250;
		MyTest.r = 35000;
		MyBerechner.wurdeAufgerufen = false;
		TestResult tr = new TestResult();
		junit.framework.Test t = new TestSuite(MyTest.class);
		t.run(tr);
		assertTrue(
				"Entweder wird m nicht für die Berechnung verwendet oder tag = "
						+ MyTest.t + " und km = " + MyTest.k
						+ " werden nicht überprüft.",
				MyBerechner.wurdeAufgerufen);
		Enumeration<TestFailure> e = tr.failures();
		if (!e.hasMoreElements()) {
			fail("Falsche Implementierung wird nicht erkannt!");
		} else {
			TestFailure tf = null;
			while (e.hasMoreElements()) {
				tf = e.nextElement();
				if (tf.trace().contains("MietpreisBerechnerTest." + name)) {
					break;
				}
			}
			assertNotNull(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf);
			assertTrue(
					name
							+ " hätte auf Grund falscher Implementierung fehlgeschlagen sollen, ist es aber nicht.",
					tf.trace().contains("MietpreisBerechnerTest." + name));
			if (tf.trace().startsWith(
					"junit.framework.AssertionFailedError: expected")) {
				fail(name + " gibt keine eigene Fehlermeldung an.");
			}
		}
		MyTest.r = 33000;
		MyBerechner.wurdeAufgerufen = false;
		tr = new TestResult();
		t = new TestSuite(MyTest.class);
		t.run(tr);
		e = tr.failures();
		if (e.hasMoreElements()) {
			TestFailure tf = e.nextElement();
			assertFalse(name
					+ " stuft richtige Implementierung als falsch ein.", tf
					.trace().contains("MietpreisBerechnerTest." + name));
		}

	}

	public static class MyTest extends MietpreisBerechnerTest {

		static int t;
		static int k;
		static long r;

		public void setUp() {
			m = new MyBerechner(t, k, r);
		}
	}

}

class MyBerechner extends MietpreisBerechner {

	private int t;
	private int k;
	private long r;
	static boolean wurdeAufgerufen = false;

	public MyBerechner(int t, int k, long r) {
		this.t = t;
		this.k = k;
		this.r = r;
	}

	public long berechneMietpreis(int tage, int km) {
		if (tage == t && km == k) {
			wurdeAufgerufen = true;
			return r;
		}
		return super.berechneMietpreis(tage, km);
	}
}
