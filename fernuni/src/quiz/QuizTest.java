package quiz;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import junit.framework.TestCase;

public class QuizTest extends TestCase {

	public void testZahlenfrage() {
		String[] methodenName = { "istBeantwortet", "istRichtigBeantwortet",
				"legeAntwortFest", "liefereErreichtePunkte", "liefereFrage",
				"liefereMoeglichePunkte" };
		Class<?>[] rueckgabeTyp = { boolean.class, boolean.class, void.class,
				int.class, String.class, int.class };
		Class<?>[][] parameterTypen = { {}, {}, { int.class }, {}, {}, {} };
		String typName = "Zahlenfrage";

		Class<?> c = null;
		try {
			c = Class.forName(typName);
		} catch (ClassNotFoundException e) {
			fail("Der Typ " + typName + " wurde nicht gefunden.");
		}
		assertTrue("Der Typ " + typName + " ist keine Schnittstelle.",
				c.isInterface());

		for (int i = 0; i < methodenName.length; i++) {
			try {
				Method m = c.getDeclaredMethod(methodenName[i],
						parameterTypen[i]);
				assertEquals("Die Methode " + methodenName[i]
						+ " hat den falschen Rueckgabetyp.", rueckgabeTyp[i],
						m.getReturnType());
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
				fail("Die Methode "
						+ methodenName[i]
						+ " wurde nicht oder nicht mit den passenden Parametertypen gefunden.");
			}
		}
	}

	public void testAbstrakteZahlenfrageElemente() {
		String typName = "AbstrakteZahlenfrage";
		String[] methodenName = { "istBeantwortet", "legeAntwortFest",
				"liefereErreichtePunkte", "liefereFrage",
				"liefereMoeglichePunkte" };
		Class<?>[] rueckgabeTyp = { boolean.class, void.class, int.class,
				String.class, int.class };
		Class<?>[][] parameterTypen = { {}, { int.class }, {}, {}, {} };

		Class<?> c = null;
		try {
			c = Class.forName(typName);
		} catch (ClassNotFoundException e) {
			fail("Die Klasse " + typName + " wurde nicht gefunden.");
		}
		assertFalse("Der Typ " + typName
				+ " ist eine Schnittstelle und keine abstrakte Klasse.",
				c.isInterface());
		assertTrue("Die Klasse " + typName + " ist nicht abstrakt.",
				Modifier.isAbstract(c.getModifiers()));
		boolean implementsZahlenfrage = false;
		for (Class<?> i : c.getInterfaces()) {
			if (i.getName().equals("Zahlenfrage")) {
				implementsZahlenfrage = true;
			}
		}
		assertTrue("Die Klasse " + typName
				+ " implementiert nicht die Schnittstelle Zahlenfrage.",
				implementsZahlenfrage);

		for (int i = 0; i < methodenName.length; i++) {
			try {
				Method m = c.getDeclaredMethod(methodenName[i],
						parameterTypen[i]);
				assertEquals("Die Methode " + methodenName[i]
						+ " hat den falschen Rueckgabetyp.", rueckgabeTyp[i],
						m.getReturnType());
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
				fail("Die Methode "
						+ methodenName[i]
						+ " wurde nicht oder nicht mit den passenden Parametertypen gefunden.");
			}
		}
		try {
			c.getConstructor(new Class<?>[] { String.class, int.class });
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
			fail("Die Klasse " + typName
					+ " besitzt nicht den geforderten Konstruktor");
		}
	}

	public void testEinfacheZahlenfrageElemente() {
		String typName = "EinfacheZahlenfrage";
		String[] methodenName = { "istRichtigBeantwortet" };
		Class<?>[] rueckgabeTyp = { boolean.class };
		Class<?>[][] parameterTypen = { {} };

		Class<?> c = null;
		try {
			c = Class.forName(typName);
		} catch (ClassNotFoundException e) {
			fail("Die Klasse " + typName + " wurde nicht gefunden.");
		}
		assertFalse("Der Typ " + typName
				+ " ist eine Schnittstelle und keine Klasse.", c.isInterface());
		assertFalse("Die Klasse " + typName + " soll nicht abstrakt sein.",
				Modifier.isAbstract(c.getModifiers()));

		boolean extendsAbstrakteZahlenfrage = false;
		if (c.getSuperclass().getName().equals("AbstrakteZahlenfrage")) {
			extendsAbstrakteZahlenfrage = true;
		}
		assertTrue("Die Klasse " + typName
				+ " erweitert nicht die Klasse AbstrakteZahlenfrage.",
				extendsAbstrakteZahlenfrage);

		for (int i = 0; i < methodenName.length; i++) {
			try {
				Method m = c.getDeclaredMethod(methodenName[i],
						parameterTypen[i]);
				assertEquals("Die Methode " + methodenName[i]
						+ " hat den falschen Rueckgabetyp.", rueckgabeTyp[i],
						m.getReturnType());
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
				fail("Die Methode "
						+ methodenName[i]
						+ " wurde nicht oder nicht mit den passenden Parametertypen gefunden.");
			}
		}
		try {
			c.getConstructor(new Class<?>[] { String.class, int.class,
					int.class });
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
			fail("Die Klasse " + typName
					+ " besitzt nicht den geforderten Konstruktor");
		}
	}

	public void testSchaetzFrageElemente() {
		String typName = "SchaetzFrage";
		String[] methodenName = { "istRichtigBeantwortet" };
		Class<?>[] rueckgabeTyp = { boolean.class };
		Class<?>[][] parameterTypen = { {} };

		Class<?> c = null;
		try {
			c = Class.forName(typName);
		} catch (ClassNotFoundException e) {
			fail("Die Klasse " + typName + " wurde nicht gefunden.");
		}
		assertFalse("Der Typ " + typName
				+ " ist eine Schnittstelle und keine Klasse.", c.isInterface());
		assertFalse("Die Klasse " + typName + " soll nicht abstrakt sein.",
				Modifier.isAbstract(c.getModifiers()));

		boolean extendsAbstrakteZahlenfrage = false;
		if (c.getSuperclass().getName().equals("AbstrakteZahlenfrage")) {
			extendsAbstrakteZahlenfrage = true;
		}
		assertTrue("Die Klasse " + typName
				+ " erweitert nicht die Klasse AbstrakteZahlenfrage.",
				extendsAbstrakteZahlenfrage);

		for (int i = 0; i < methodenName.length; i++) {
			try {
				Method m = c.getDeclaredMethod(methodenName[i],
						parameterTypen[i]);
				assertEquals("Die Methode " + methodenName[i]
						+ " hat den falschen Rueckgabetyp.", rueckgabeTyp[i],
						m.getReturnType());
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
				fail("Die Methode "
						+ methodenName[i]
						+ " wurde nicht oder nicht mit den passenden Parametertypen gefunden.");
			}
		}
		try {
			c.getConstructor(new Class<?>[] { String.class, int.class,
					int.class, int.class });
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
			fail("Die Klasse " + typName
					+ " besitzt nicht den geforderten Konstruktor");
		}
	}

	public void testQuizElemente() {
		try {
			String typName = "Quiz";
			String[] methodenName = { "fuegeFrageHinzu",
					"berechneErreichtePunkte",
					"berechneMaximalMoeglichePunkte", "liefereFrage",
					"liefereFragenAnzahl" };
			Class<?>[] rueckgabeTyp = { boolean.class, int.class, int.class,
					Class.forName("Zahlenfrage"), int.class };
			Class<?>[][] parameterTypen = { { Class.forName("Zahlenfrage") },
					{}, {}, { int.class }, {} };

			Class<?> c = null;
			try {
				c = Class.forName(typName);
			} catch (ClassNotFoundException e) {
				fail("Die Klasse " + typName + " wurde nicht gefunden.");
			}
			assertFalse("Der Typ " + typName
					+ " ist eine Schnittstelle und keine Klasse.",
					c.isInterface());
			assertFalse("Die Klasse " + typName
					+ " ist abstrakt sollte sie aber nicht sein.",
					Modifier.isAbstract(c.getModifiers()));

			for (int i = 0; i < methodenName.length; i++) {
				try {
					Method m = c.getDeclaredMethod(methodenName[i],
							parameterTypen[i]);
					assertEquals("Die Methode " + methodenName[i]
							+ " hat den falschen Rueckgabetyp.",
							rueckgabeTyp[i], m.getReturnType());
				} catch (SecurityException e) {
				} catch (NoSuchMethodException e) {
					fail("Die Methode "
							+ methodenName[i]
							+ " wurde nicht oder nicht mit den passenden Parametertypen gefunden.");
				}
			}
			try {
				c.getConstructor(new Class<?>[] { int.class });
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
				fail("Die Klasse " + typName
						+ " besitzt nicht den geforderten Konstruktor.");
			}
		} catch (ClassNotFoundException e) {
			fail("Die Klasse Zahlenfrage fehlt.");
		}
	}

	public void testAbstrakteZahlenfrage() {
		int punkte = 10;
		String frage = "Was ist 2*2?";
		AbstrakteZahlenfrage azf = new AbstrakteZahlenfrage(frage, punkte) {
			public boolean istRichtigBeantwortet() {
				return false;
			}
		};
		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, azf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, azf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, azf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				azf.istBeantwortet());
		azf.legeAntwortFest(17);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				azf.istBeantwortet());
		assertEquals(
				"Bei einer falsch beantworteten Frage werden nicht 0 Punkte vergeben.",
				0, azf.liefereErreichtePunkte());

		azf = new AbstrakteZahlenfrage(frage, punkte) {
			public boolean istRichtigBeantwortet() {
				return true;
			}
		};
		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, azf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, azf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, azf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				azf.istBeantwortet());
		azf.legeAntwortFest(17);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				azf.istBeantwortet());
		assertEquals(
				"Bei einer richtig beantworteten Frage wird nicht alle Punktzahl vergeben.",
				punkte, azf.liefereErreichtePunkte());

	}

	public void testEinfacheZahlenfrage() {
		int punkte = 10;
		String frage = "Was ist 2*2?";
		int richtig = 4;
		EinfacheZahlenfrage ezf = new EinfacheZahlenfrage(frage, punkte,
				richtig);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, ezf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, ezf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, ezf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				ezf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				ezf.istRichtigBeantwortet());
		ezf.legeAntwortFest(17);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				ezf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei falsch beantworteten Frage true.",
				ezf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer falsch beantworteten Frage werden nicht 0 Punkte vergeben.",
				0, ezf.liefereErreichtePunkte());

		ezf = new EinfacheZahlenfrage(frage, punkte, richtig);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, ezf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, ezf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, ezf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				ezf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				ezf.istRichtigBeantwortet());
		ezf.legeAntwortFest(4);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				ezf.istBeantwortet());
		assertTrue(
				"Die Methode istRichtigBeantwortet() liefert bei richtig beantworteten Frage false.",
				ezf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer richtig beantworteten Frage werden nicht alle Punkte vergeben.",
				punkte, ezf.liefereErreichtePunkte());
	}

	public void testSchaetzFrage() {
		int punkte = 10;
		String frage = "Schaetze die Wurzel aus 123412?";
		int richtig = (int) Math.sqrt(123412);
		int prozent = 10;
		SchaetzFrage sf = new SchaetzFrage(frage, punkte, richtig, prozent);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, sf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, sf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		sf.legeAntwortFest(17);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei falsch beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer falsch beantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());

		sf = new SchaetzFrage(frage, punkte, richtig, prozent);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, sf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, sf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		sf.legeAntwortFest(richtig);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				sf.istBeantwortet());
		assertTrue(
				"Die Methode istRichtigBeantwortet() liefert bei richtig beantworteten Frage false.",
				sf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer richtig beantworteten Frage werden nicht alle Punkte vergeben.",
				punkte, sf.liefereErreichtePunkte());

		sf = new SchaetzFrage(frage, punkte, richtig, prozent);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, sf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, sf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		sf.legeAntwortFest((int) (richtig * 0.9) + 1);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				sf.istBeantwortet());
		assertTrue(
				"Die Methode istRichtigBeantwortet() liefert bei richtig beantworteten Frage false.",
				sf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer richtig beantworteten Frage werden nicht alle Punkte vergeben.",
				punkte, sf.liefereErreichtePunkte());

		sf = new SchaetzFrage(frage, punkte, richtig, prozent);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, sf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, sf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		sf.legeAntwortFest((int) (richtig * 0.9));
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei falsch beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer falsch beantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());

		sf = new SchaetzFrage(frage, punkte, richtig, prozent);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, sf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, sf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		sf.legeAntwortFest((int) (richtig * 1.1));
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				sf.istBeantwortet());
		assertTrue(
				"Die Methode istRichtigBeantwortet() liefert bei richtig beantworteten Frage false.",
				sf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer richtig beantworteten Frage werden nicht alle Punkte vergeben.",
				punkte, sf.liefereErreichtePunkte());

		sf = new SchaetzFrage(frage, punkte, richtig, prozent);

		assertEquals(
				"Die Methode liefereMoeglichePunkte() liefert nicht dem im Konstruktor übergebenen Wert.",
				punkte, sf.liefereMoeglichePunkte());
		assertEquals(
				"Die Methode liefereFrage() liefert nicht dem im Konstruktor übergebenen Wert.",
				frage, sf.liefereFrage());
		assertEquals(
				"Bei einer unbeantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());
		assertFalse(
				"Die Methode istBeantwortet() liefert bei einer unbeantworteten Frage true.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei nicht beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		sf.legeAntwortFest((int) (richtig * 1.1) + 1);
		assertTrue(
				"Die Methode istBeantwortet() liefert bei einer beantworteten Frage false.",
				sf.istBeantwortet());
		assertFalse(
				"Die Methode istRichtigBeantwortet() liefert bei falsch beantworteten Frage true.",
				sf.istRichtigBeantwortet());
		assertEquals(
				"Bei einer falsch beantworteten Frage werden nicht 0 Punkte vergeben.",
				0, sf.liefereErreichtePunkte());

	}

	public void testQuiz() {
		Quiz q = new Quiz(5);
		assertEquals(
				"Ein neu erzeugtes Quiz sollte noch keine Fragen gespeichert haben.",
				0, q.liefereFragenAnzahl());
		assertEquals("Ein neu erzeugtes Quiz kann maximal 0 Punkte haben.", 0,
				q.berechneMaximalMoeglichePunkte());
		assertEquals(
				"Ein neu erzeugtes Quiz sollte noch keine Punkte vergeben haben.",
				0, q.berechneErreichtePunkte());
		assertNull(
				"Bei einem neu erzeugten Quiz gibt es noch keine Frage an Position 3.",
				q.liefereFrage(3));
		assertNull(
				"Bei einem Quiz gibt es noch keine Frage an negativen Positionen.",
				q.liefereFrage(-3));

		EinfacheZahlenfrage[] e = new EinfacheZahlenfrage[5];
		for (int i = 0; i < e.length; i++) {
			e[i] = new EinfacheZahlenfrage("", i + 1, 3 + i);
			assertTrue(
					"Die Methode fuegeFrageHinzu() liefert nicht true, obwohl Platz sein sollte.",
					q.fuegeFrageHinzu(e[i]));
			assertEquals("Die Fragenanzahl ist falsch.", i + 1,
					q.liefereFragenAnzahl());
			assertEquals("Die maximal moegliche Punktanzahl ist falsch",
					(i + 1) * (i + 2) / 2, q.berechneMaximalMoeglichePunkte());
		}
		for (int i = 0; i < e.length; i++) {
			assertEquals("Die Frage an Position " + i + " ist falsch", e[i],
					q.liefereFrage(i));
			q.liefereFrage(i).legeAntwortFest(3 + i);
		}
		assertEquals("Die berechnte Gesamtpunktzahl ist falsch", (e.length + 1)
				* (e.length) / 2, q.berechneErreichtePunkte());

		assertFalse(
				"Die Methode q.fuegeFrageHinzu() liefert true, obwohl kein Platz mehr sein sollte.",
				q.fuegeFrageHinzu(new EinfacheZahlenfrage("", 1, 1)));

		q = new Quiz(5);

		e = new EinfacheZahlenfrage[4];
		for (int i = 0; i < e.length; i++) {
			e[i] = new EinfacheZahlenfrage("", i + 1, 3 + i);
			q.fuegeFrageHinzu(e[i]);
		}
		q.fuegeFrageHinzu(new SchaetzFrage("", 10, 0, 10));
		for (int i = 0; i < e.length; i++) {
			q.liefereFrage(i).legeAntwortFest(i);
		}
		q.liefereFrage(4).legeAntwortFest(12);
		assertEquals("Die berechnte Gesamtpunktzahl ist falsch", 0,
				q.berechneErreichtePunkte());

	}

}
