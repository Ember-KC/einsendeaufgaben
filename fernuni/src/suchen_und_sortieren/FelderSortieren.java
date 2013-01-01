package suchen_und_sortieren;

public class FelderSortieren {

	// Sortieren durch Insertion sort

	public void sortiereAbsteigend(String[] feld) {
		int vertauschzaehler = 0;
		int vergleichzaehler = 0;
		for (int i = 1; i < feld.length; i++) {

			for (int j = i; j > 0; j--) {
				vergleichzaehler++;

				if (feld[j].compareTo(feld[j - 1]) > 0) {
					String tmp = feld[j];
					feld[j] = feld[j - 1];
					feld[j - 1] = tmp;
					vertauschzaehler++;
				} else {
					break;
				}
			}
		}
		System.out.println("Anzahl Vergleichsoperationen: " + vergleichzaehler
				+ "\n" + "Anzahl Vertauschsoperationen: " + vertauschzaehler);
	}

	public void sortiereAbsteigend(int[] feld) {
		int vertauschzaehler = 0;
		int vergleichzaehler = 0;
		for (int i = 1; i < feld.length; i++) {

			for (int j = i; j > 0; j--) {
				vergleichzaehler++;

				if (feld[j] > feld[j - 1]) {
					int tmp = feld[j];
					feld[j] = feld[j - 1];
					feld[j - 1] = tmp;
					vertauschzaehler++;
				} else {
					break;
				}
			}
		}
		System.out.println("Anzahl Vergleichsoperationen: " + vergleichzaehler
				+ "\n" + "Anzahl Vertauschsoperationen: " + vertauschzaehler);
	}

	public void sortiereIntAufsteigend(int[] feld) {
		int vertauschzaehler = 0;
		int vergleichzaehler = 0;
		for (int i = 1; i < feld.length; i++) {

			for (int j = i; j > 0; j--) {
				vergleichzaehler++;

				if (feld[j] < feld[j - 1]) {
					int tmp = feld[j];
					feld[j] = feld[j - 1];
					feld[j - 1] = tmp;
					vertauschzaehler++;
				} else {
					break;
				}
			}
		}
		System.out.println("Anzahl Vergleichsoperationen: " + vergleichzaehler
				+ "\n" + "Anzahl Vertauschsoperationen: " + vertauschzaehler);
	}

	// sortieren mit Bubblesort

	public void sortiereAufsteigend(String[] feld) {

		for (int i = 0; i < feld.length - 1; i++) {
			boolean sorted = true;

			for (int j = 0; j < feld.length - 1 - i; j++) {
				if (feld[j].compareTo(feld[j + 1]) > 0) {
					String tmp = feld[j];
					feld[j] = feld[j + 1];
					feld[j + 1] = tmp;

					sorted = false;
				}
			}
			if (sorted) {
				break;
			}
		}

	}

	// sortieren mit Selection-Sort

	public void sortiere(double[] feld) {

		for (int i = 0; i < feld.length - 1 - i; i++) {
			int max = 0;

			for (int j = 0; j < feld.length - 1 - i; j++) {

				if (feld[max] < feld[j]) {
					max = j;
				}
			}

			if (max != feld[feld.length - 1 - i]) {

				double tmp = feld[feld.length - 1 - i];
				feld[feld.length - 1 - i] = feld[max];
				feld[max] = tmp;
			}

		}

	}

}
