package einsendeaufgaben;

public class Konto {

	// Variablen

	private long kontostand = 0;
	private long nummer;
	private Bank bank;
	private Kunde inhaber;

	// Konstruktor

	public Konto(long ktoNr, Bank bank, Kunde inhaber) {
		nummer = ktoNr;
		this.bank = bank;
		this.inhaber = inhaber;

	}

	// Methoden

	void auszahlen(long auszahlBetrag) {
		this.kontostand = liefereKontostand();
		this.kontostand = this.kontostand - auszahlBetrag;
	}

	void einzahlen(long einzahlBetrag) {
		this.kontostand = liefereKontostand();
		this.kontostand = this.kontostand + einzahlBetrag;
	}

	String liefereBankname() {
		return bank.liefereName();
	}

	long liefereBLZ() {
		return bank.liefereBLZ();
	}

	String liefereInhabername() {
		return inhaber.liefereName();
	}

	long liefereKontonummer() {
		return nummer;

	}

	long liefereKontostand() {
		return this.kontostand;

	}

	/**
	 * @param args
	 */

}
