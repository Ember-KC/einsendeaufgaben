package selbsttestaufgaben;

public class Durchschnittsberechner {

	public static void main(String[] args) {
		Durchschnittsberechner durch = new Durchschnittsberechner();
		double[] feld = { 2.00, 3.00 };
		System.out.println(durch.berechneDurchschnitt(feld));
	}

	public double berechneDurchschnitt(double[] feld) {
		double erg = 0;
		try {
			for (double i : feld) {
				erg = erg + i;
				i++;
			}
			int laenge = feld.length;
			erg = erg / feld.length;
		} catch (Exception e) {

		}
		return erg;
	}
}