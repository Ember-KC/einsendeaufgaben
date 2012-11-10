package einsendeaufgaben;

public class KontoManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bank = new Bank("Commerzbank", 29040090);
		Kunde kunde = new Kunde("Kathrin Siegmann");
		Konto konto = new Konto(1234567, bank, kunde);

		System.out.println(konto.liefereKontostand());
		konto.einzahlen(500);
		System.out.println(konto.liefereKontostand());

	}

}
