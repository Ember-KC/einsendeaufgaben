package einsendeaufgaben;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import junit.framework.TestCase;

public class KontoTest extends TestCase {

	public void testAttributExistenz() {
		assertEquals(
				"Die Klasse Konto besitzt nicht genau 4 (Instanz-)Variablen.",
				4, Konto.class.getDeclaredFields().length);
	}

	public void testAttributKontostand() {
		String attrName = "kontostand";
		Class<?> attrTyp = long.class;
		try {
			Field f = Konto.class.getDeclaredField(attrName);
			assertFalse("Das Attribut " + attrName
					+ " der Klasse Konto ist als static deklariert.",
					Modifier.isStatic(f.getModifiers()));
			assertEquals("Das Attribut " + attrName
					+ " der Klasse Konto ist nicht vom Typ " + attrTyp + ".",
					attrTyp, f.getType());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Die Klasse Konto besitzt kein Attribut " + attrName
					+ ". Beachten Sie Groß- und Kleinschreibung.");
			e.printStackTrace();
		}
	}

	public void testAttributNummer() {
		String attrName = "nummer";
		Class<?> attrTyp = long.class;
		try {
			Field f = Konto.class.getDeclaredField(attrName);
			assertFalse("Das Attribut " + attrName
					+ " der Klasse Konto ist als static deklariert.",
					Modifier.isStatic(f.getModifiers()));
			assertEquals("Das Attribut " + attrName
					+ " der Klasse Konto ist nicht vom Typ " + attrTyp + ".",
					attrTyp, f.getType());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Die Klasse Konto besitzt kein Attribut " + attrName
					+ ". Beachten Sie Groß- und Kleinschreibung.");
			e.printStackTrace();
		}
	}

	public void testAttributInhaber() {
		String attrName = "inhaber";
		Class<?> attrTyp = Kunde.class;
		try {
			Field f = Konto.class.getDeclaredField(attrName);
			assertFalse("Das Attribut " + attrName
					+ " der Klasse Konto ist als static deklariert.",
					Modifier.isStatic(f.getModifiers()));
			assertEquals("Das Attribut " + attrName
					+ " der Klasse Konto ist nicht vom Typ " + attrTyp + ".",
					attrTyp, f.getType());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Die Klasse Konto besitzt kein Attribut " + attrName
					+ ". Beachten Sie Groß- und Kleinschreibung.");
			e.printStackTrace();
		}
	}

	public void testAttributBank() {
		String attrName = "bank";
		Class<?> attrTyp = Bank.class;
		try {
			Field f = Konto.class.getDeclaredField(attrName);
			assertFalse("Das Attribut " + attrName
					+ " der Klasse Konto ist als static deklariert.",
					Modifier.isStatic(f.getModifiers()));
			assertEquals("Das Attribut " + attrName
					+ " der Klasse Konto ist nicht vom Typ " + attrTyp + ".",
					attrTyp, f.getType());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Die Klasse Konto besitzt kein Attribut " + attrName
					+ ". Beachten Sie Groß- und Kleinschreibung.");
			e.printStackTrace();
		}
	}

	public void testKonstruktor() {
		Constructor<?>[] cons = Konto.class.getDeclaredConstructors();
		assertEquals("Die Klasse Konto besitzt mehr als einen Konstruktor.", 1,
				cons.length);
		Konto k = null;
		Bank bank = new Bank("Test", 124);
		Kunde kunde = new Kunde("Testkunde");
		int nummer = 123;
		try {
			Constructor<Konto> c = Konto.class.getDeclaredConstructor(
					long.class, Bank.class, Kunde.class);
			k = c.newInstance(nummer, bank, kunde);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keinen Konstruktor mit den folgenden Parametertypen: long, Bank, Kunde");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (InstantiationException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (Throwable t) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + t);
		}
		// überprüfe Werte der Attribute
		String attrName = "kontostand";
		Field f = null;
		try {
			f = Konto.class.getDeclaredField(attrName);
			f.setAccessible(true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Wert von Attribut " + attrName
					+ " kann nicht überprüft werden, da es nicht existiert.");
			e.printStackTrace();
		}
		try {
			assertEquals(
					attrName
							+ " besitzt nach der Ausführung des Konstruktors nicht den erwarteten Wert.",
					0, f.getLong(k));
		} catch (IllegalArgumentException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		}
		attrName = "nummer";
		try {
			f = Konto.class.getDeclaredField(attrName);
			f.setAccessible(true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Wert von Attribut " + attrName
					+ " kann nicht überprüft werden, da es nicht existiert.");
			e.printStackTrace();
		}
		try {
			assertEquals(
					attrName
							+ " besitzt nach der Ausführung des Konstruktors nicht den erwarteten Wert.",
					nummer, f.getLong(k));
		} catch (IllegalArgumentException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		}
		attrName = "bank";
		try {
			f = Konto.class.getDeclaredField(attrName);
			f.setAccessible(true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Wert von Attribut " + attrName
					+ " kann nicht überprüft werden, da es nicht existiert.");
			e.printStackTrace();
		}
		try {
			assertEquals(
					attrName
							+ " besitzt nach der Ausführung des Konstruktors nicht den erwarteten Wert.",
					bank, f.get(k));
		} catch (IllegalArgumentException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		}
		attrName = "inhaber";
		try {
			f = Konto.class.getDeclaredField(attrName);
			f.setAccessible(true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Wert von Attribut " + attrName
					+ " kann nicht überprüft werden, da es nicht existiert.");
			e.printStackTrace();
		}
		try {
			assertEquals(
					attrName
							+ " besitzt nach der Ausführung des Konstruktors nicht den erwarteten Wert.",
					kunde, f.get(k));
		} catch (IllegalArgumentException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Wert von Attribut " + attrName
					+ " konnte nicht überprüft werden.");
			e.printStackTrace();
		}
	}

	public void testeMethodenExistenz() {
		Method[] meths = Konto.class.getDeclaredMethods();
		assertEquals("Die Klasse Konto besitzt nicht genau 7 Methoden.", 7,
				meths.length);
	}

	public void testeAuszahlenEigenschaften() {
		String methName = "auszahlen";
		Class<?> retType = void.class;
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(methName, long.class);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine Methode " + methName
					+ " mit folgenden Parametern: long");
			e.printStackTrace();
		}
		assertFalse("Die Methode " + methName
				+ " der Klasse Konto ist als static deklariert.",
				Modifier.isStatic(m.getModifiers()));
		assertEquals("Die Methode " + methName
				+ " der Klasse Konto hat nicht den Rueckgabetyp: " + retType,
				retType, m.getReturnType());
	}

	public void testeEinzahlenEigenschaften() {
		String methName = "einzahlen";
		Class<?> retType = void.class;
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(methName, long.class);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine Methode " + methName
					+ " mit folgenden Parametern: long");
			e.printStackTrace();
		}
		assertFalse("Die Methode " + methName
				+ " der Klasse Konto ist als static deklariert.",
				Modifier.isStatic(m.getModifiers()));
		assertEquals("Die Methode " + methName
				+ " der Klasse Konto hat nicht den Rueckgabetyp: " + retType,
				retType, m.getReturnType());
	}

	public void testeLiefereBanknameEigenschaften() {
		String methName = "liefereBankname";
		Class<?> retType = String.class;
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(methName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine Methode " + methName
					+ " ohne Parameter.");
			e.printStackTrace();
		}
		assertFalse("Die Methode " + methName
				+ " der Klasse Konto ist als static deklariert.",
				Modifier.isStatic(m.getModifiers()));
		assertEquals("Die Methode " + methName
				+ " der Klasse Konto hat nicht den Rueckgabetyp: " + retType,
				retType, m.getReturnType());
	}

	public void testeLiefereBLZEigenschaften() {
		String methName = "liefereBLZ";
		Class<?> retType = long.class;
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(methName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine Methode " + methName
					+ " ohne Parameter.");
			e.printStackTrace();
		}
		assertFalse("Die Methode " + methName
				+ " der Klasse Konto ist als static deklariert.",
				Modifier.isStatic(m.getModifiers()));
		assertEquals("Die Methode " + methName
				+ " der Klasse Konto hat nicht den Rueckgabetyp: " + retType,
				retType, m.getReturnType());
	}

	public void testeLiefereInhabernameEigenschaften() {
		String methName = "liefereInhabername";
		Class<?> retType = String.class;
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(methName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine Methode " + methName
					+ " ohne Parameter.");
			e.printStackTrace();
		}
		assertFalse("Die Methode " + methName
				+ " der Klasse Konto ist als static deklariert.",
				Modifier.isStatic(m.getModifiers()));
		assertEquals("Die Methode " + methName
				+ " der Klasse Konto hat nicht den Rueckgabetyp: " + retType,
				retType, m.getReturnType());
	}

	public void testeLiefereKontonummerEigenschaften() {
		String methName = "liefereKontonummer";
		Class<?> retType = long.class;
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(methName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine Methode " + methName
					+ " ohne Parameter.");
			e.printStackTrace();
		}
		assertFalse("Die Methode " + methName
				+ " der Klasse Konto ist als static deklariert.",
				Modifier.isStatic(m.getModifiers()));
		assertEquals("Die Methode " + methName
				+ " der Klasse Konto hat nicht den Rueckgabetyp: " + retType,
				retType, m.getReturnType());
	}

	public void testeLiefereKontostandEigenschaften() {
		String methName = "liefereKontostand";
		Class<?> retType = long.class;
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(methName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine Methode " + methName
					+ " ohne Parameter.");
			e.printStackTrace();
		}
		assertFalse("Die Methode " + methName
				+ " der Klasse Konto ist als static deklariert.",
				Modifier.isStatic(m.getModifiers()));
		assertEquals("Die Methode " + methName
				+ " der Klasse Konto hat nicht den Rueckgabetyp: " + retType,
				retType, m.getReturnType());
	}

	public void testeEinzahlenAuszahlen() {
		Bank bank = new Bank("Test", 124);
		Kunde kunde = new Kunde("Testkunde");
		Konto k = createKonto(123, bank, kunde);
		Method m = getMethod("einzahlen", long.class);
		long ein = 20000;
		callVoidMethod(k, m, ein);
		Field kontostand = getField("kontostand");
		try {
			assertEquals(
					"Der Kontostand hat nach der Einzahlung nicht den gewünschten Wert",
					ein, kontostand.getLong(k));
		} catch (IllegalArgumentException e) {
			fail("Der Wert des Attributs kontostand konnte nach dem Einzahlen nicht überprüft werden.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Der Wert des Attributs kontostand konnte nach dem Einzahlen nicht überprüft werden.");
			e.printStackTrace();
		}
		m = getMethod("auszahlen", long.class);
		long aus = 10000;
		callVoidMethod(k, m, aus);
		try {
			assertEquals(
					"Der Kontostand hat nach der Einzahlung nicht den gewünschten Wert",
					ein - aus, kontostand.getLong(k));
		} catch (IllegalArgumentException e) {
			fail("Der Wert des Attributs kontostand konnte nach dem Auszahlen nicht überprüft werden.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Der Wert des Attributs kontostand konnte nach dem Auszahlen nicht überprüft werden.");
			e.printStackTrace();
		}
		callVoidMethod(k, m, aus);
		try {
			assertEquals(
					"Der Kontostand hat nach der Einzahlung nicht den gewünschten Wert",
					ein - aus - aus, kontostand.getLong(k));
		} catch (IllegalArgumentException e) {
			fail("Der Wert des Attributs kontostand konnte nach dem Auszahlen nicht überprüft werden.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Der Wert des Attributs kontostand konnte nach dem Auszahlen nicht überprüft werden.");
			e.printStackTrace();
		}

	}

	public void testeLiefereBankname() {
		String bankname = "Testbank";
		Bank bank = new Bank(bankname, 124);
		Kunde kunde = new Kunde("Testkunde");
		Konto k = createKonto(123, bank, kunde);
		Method m = getMethod("liefereBankname");
		Object o = callMethod(k, m);
		assertEquals("Die Methode liefereBankname liefert den falschen Wert.",
				bankname, o);
	}

	public void testeLiefereBLZ() {
		long blz = 124;
		Bank bank = new Bank("Testbank", blz);
		Kunde kunde = new Kunde("Testkunde");
		Konto k = createKonto(123, bank, kunde);
		Method m = getMethod("liefereBLZ");
		Object o = callMethod(k, m);
		assertEquals("Die Methode liefereBLZ liefert den falschen Wert.", blz,
				o);
	}

	public void testeLiefereInhabername() {
		Bank bank = new Bank("Testbank", 124);
		String kundenname = "Testkunde";
		Kunde kunde = new Kunde(kundenname);
		Konto k = createKonto(123, bank, kunde);
		Method m = getMethod("liefereInhabername");
		Object o = callMethod(k, m);
		assertEquals(
				"Die Methode liefereInhabername liefert den falschen Wert.",
				kundenname, o);
	}

	public void testeLiefereKontonummer() {
		Bank bank = new Bank("Testbank", 124);
		Kunde kunde = new Kunde("Testkunde");
		long nummer = 123;
		Konto k = createKonto(nummer, bank, kunde);
		Method m = getMethod("liefereKontonummer");
		Object o = callMethod(k, m);
		assertEquals(
				"Die Methode liefereKontonummer liefert den falschen Wert.",
				nummer, o);
	}

	public void testeLiefereKontostand() {
		Bank bank = new Bank("Testbank", 124);
		Kunde kunde = new Kunde("Testkunde");
		Konto k = createKonto(123, bank, kunde);
		Method get = getMethod("liefereKontostand");
		Field f = getField("kontostand");
		Object o = callMethod(k, get);
		try {
			assertEquals(
					"liefereKontostand liefert nicht den Wert der Variable kontostand.",
					f.getLong(k), o);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		Method einz = getMethod("einzahlen", long.class);
		Method ausz = getMethod("auszahlen", long.class);
		long ein = 20000;
		long aus = 5000;
		callVoidMethod(k, einz, ein);
		o = callMethod(k, get);
		try {
			assertEquals(
					"liefereKontostand liefert nach dem Einzahlen nicht den Wert der Variable kontostand.",
					f.getLong(k), o);
			assertEquals(
					"liefereKontostand liefert nach dem Einzahlen nicht den erwarteten Wert .",
					o, ein);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		callVoidMethod(k, ausz, aus);
		o = callMethod(k, get);
		try {
			assertEquals(
					"liefereKontostand liefert nach dem Auszahlen nicht den Wert der Variable kontostand.",
					f.getLong(k), o);
			assertEquals(
					"liefereKontostand liefert nach dem Auszahlen nicht den erwarteten Wert .",
					o, ein - aus);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		callVoidMethod(k, ausz, aus);
		o = callMethod(k, get);
		try {
			assertEquals(
					"liefereKontostand liefert nach dem Auszahlen nicht den Wert der Variable kontostand.",
					f.getLong(k), o);
			assertEquals(
					"liefereKontostand liefert nach dem Auszahlen nicht den erwarteten Wert .",
					o, ein - aus - aus);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void testGetter() {
		long blz = 124;
		TestBank bank = new TestBank("Testbank", blz);
		String kundenname = "Testkunde";
		TestKunde kunde = new TestKunde(kundenname);
		Konto k = createKonto(123, bank, kunde);
		long neueBlz = 125;
		String neuerKundenname = "NeuerName";
		String neuerBankname = "NeueBank";
		kunde.setName(neuerKundenname);
		bank.setBLZ(neueBlz);
		bank.setName(neuerBankname);
		Method m = getMethod("liefereInhabername");
		Object o = callMethod(k, m);
		assertEquals(
				"Die Methode liefereInhabername liefert den falschen Wert. Verwenden Sie evtl. nicht die Methode liefereName() der Klasse Kunde?",
				neuerKundenname, o);
		m = getMethod("liefereBLZ");
		o = callMethod(k, m);
		assertEquals(
				"Die Methode liefereBLZ liefert den falschen Wert. Verwenden Sie evtl. nicht die Methode liefereBLZ() der Klasse Bank?",
				neueBlz, o);
		m = getMethod("liefereBankname");
		o = callMethod(k, m);
		assertEquals(
				"Die Methode liefereBankname liefert den falschen Wert. Verwenden Sie evtl. nicht die Methode liefereName() der Klasse Bank?",
				neuerBankname, o);
	}

	private Field getField(String name) {
		Field f = null;
		try {
			f = Konto.class.getDeclaredField(name);
			f.setAccessible(true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			fail("Die Klasse Konto besitzt keine Attribut " + name + ".");
			e.printStackTrace();
		}
		return f;
	}

	private Method getMethod(String name, Class<?>... params) {
		Method m = null;
		try {
			m = Konto.class.getDeclaredMethod(name, params);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keine passende Methode " + name
					+ ".");
			e.printStackTrace();
		}
		return m;
	}

	private void callVoidMethod(Konto k, Method m, Object... args) {
		try {
			m.invoke(k, args);
		} catch (IllegalArgumentException e) {
			fail("Das Ausführen der Methode " + m.getName() + "(" + args
					+ ") ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Das Ausführen der Methode " + m.getName() + "(" + args
					+ ") ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			fail("Das Ausführen der Methode " + m.getName() + "(" + args
					+ ") ist fehlgeschlagen: " + e);
			e.printStackTrace();
		}
	}

	private Object callMethod(Konto k, Method m, Object... args) {
		try {
			return m.invoke(k, args);
		} catch (IllegalArgumentException e) {
			fail("Das Ausführen der Methode " + m.getName() + "(" + args
					+ ") ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Das Ausführen der Methode " + m.getName() + "(" + args
					+ ") ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			fail("Das Ausführen der Methode " + m.getName() + "(" + args
					+ ") ist fehlgeschlagen: " + e);
			e.printStackTrace();
		}
		return null;
	}

	private Konto createKonto(long nummer, Bank bank, Kunde kunde) {
		Constructor<?>[] cons = Konto.class.getDeclaredConstructors();
		assertEquals("Die Klasse Konto besitzt mehr als einen Konstruktor.", 1,
				cons.length);
		Konto k = null;
		try {
			Constructor<Konto> c = Konto.class.getDeclaredConstructor(
					long.class, Bank.class, Kunde.class);
			k = c.newInstance(nummer, bank, kunde);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail("Die Klasse Konto besitzt keinen Konstruktor mit den folgenden Parametertypen: long, Bank, Kunde");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (InstantiationException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + e);
			e.printStackTrace();
		} catch (Throwable t) {
			fail("Das Ausführen des Konstruktors ist fehlgeschlagen: " + t);
		}
		return k;
	}

	private static class TestBank extends Bank {

		private long blz;

		private String name;

		public TestBank(String bankname, long bankleitzahl) {
			super(bankname, bankleitzahl);
			name = bankname;
			blz = bankleitzahl;
		}

		public long liefereBLZ() {
			return blz;
		}

		public String liefereName() {
			return name;
		}

		void setName(String n) {
			name = n;
		}

		void setBLZ(long b) {
			blz = b;
		}
	}

	private static class TestKunde extends Kunde {
		private String name;

		public TestKunde(String n) {
			super(n);
			name = n;
		}

		public String liefereName() {
			return name;
		}

		void setName(String n) {
			this.name = n;
		}
	}
}
