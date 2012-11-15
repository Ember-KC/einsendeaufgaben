package einsendeaufgaben;

/**
 * Programm zur Berechnung des Durschnittes aus einem Array von int-Zahlen.
 */
public class Durchschnitt {

	/**
	 * Methode zur Berechnung des Durchschnittes eines Arrays von nichtnegativen
	 * int-Zahlen.
	 * 
	 * @param feld
	 *            ein Array von int-Zahlen.
	 * @return Der berechnete Durchschnitt der Zahlen im Array.
	 */
	public double berechneDurchschnitt(int[] feld) {
		double durchschnitt = 0.00;
		double summe = 0;
		for (int i = 0; i < feld.length; i++) {

			summe = summe + feld[i];

		}
		if (summe > 0) {

			durchschnitt = summe / feld.length;

		}
		return durchschnitt;
	}
}