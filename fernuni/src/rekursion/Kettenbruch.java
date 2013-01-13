package rekursion;

public class Kettenbruch {
	int[] werte;
	double zaehler = 1.00;

	public Kettenbruch(int[] werte) {
		this.werte = werte;
	}

	// Funktion erzeugt ein Array, dass die ersten i Elemente der Darstellung
	// der eulerschen Zahl als Kettenbruch enthält
	public static int[] berechneEFolge(int n) {
		int[] eulerArray = new int[n];
		if (eulerArray.length <= 0) {
			System.out.println("Array darf nicht leer sein.");
			return eulerArray;
		}
		if (eulerArray.length > 0) {
			eulerArray[0] = 2;
		}
		if (eulerArray.length > 1) {
			eulerArray[1] = 1;
		}
		int zahl = 2;
		int j = 2;
		for (int i = 2; i <= eulerArray.length - 1;) {
			eulerArray[i] = zahl;
			zahl = zahl + 2;
			if (i + 1 == eulerArray.length) {
				break;
			}
			eulerArray[i + 1] = 1;
			if (i + 2 == eulerArray.length) {
				break;
			}
			eulerArray[i + 2] = 1;
			i = i + 3;
		}

		return eulerArray;
	}

	// wertet ein Array mit einem "eulerschen Kettenbruch" aus
	public static double approximiereE(int n) {
		int[] eulerArray = berechneEFolge(n);
		Kettenbruch kette = new Kettenbruch(eulerArray);
		double ergebnis = kette.werteRekursivAus();
		return ergebnis;
	}

	// Funktion erzeugt ein Array, dass die ersten n-Stellen der Darstellung von
	// Wurzel2 als Kettenbruch enthält
	public static int[] berechneWurzel2Folge(int n) {
		int[] wurzelArray = new int[n];
		if (wurzelArray.length <= 0) {
			return wurzelArray;
		}

		if (wurzelArray.length >= 1) {
			wurzelArray[0] = 1;
		}
		for (int i = 1; i <= wurzelArray.length - 1; i++) {
			wurzelArray[i] = 2;
		}

		return wurzelArray;
	}

	// wertet ein Array mit einem "Wurzel2-Kettenbruch" aus
	public static double approximiereWurzel2(int n) {
		int[] eulerArray = berechneWurzel2Folge(n);
		Kettenbruch kette = new Kettenbruch(eulerArray);
		double ergebnis = kette.werteRekursivAus();
		return ergebnis;
	}

	public double werteRekursivAus() {
		double ergebnis = 0.00;

		if (this.werte.length == 0) {
			return ergebnis;
		}

		else if (this.werte.length == 1) {
			ergebnis = this.werte[0];
			return ergebnis;
		}
		int index = 0;
		return werteRekursivAus(index);
	}

	private double werteRekursivAus(int index) {
		if (index == werte.length - 1) {
			double ergebnis = werte[index];
			// double ergebnis = 1 / werte[index];
			return ergebnis;
		}
		double zwischenergebnis = this.werte[index]
				+ (zaehler / werteRekursivAus(index + 1));
		return zwischenergebnis;
	}

	public double werteIterativAus() {
		double ergebnis = 0.00;
		if (this.werte.length == 0) {
			return ergebnis;
		}

		else if (this.werte.length == 1) {
			ergebnis = this.werte[0];
			return ergebnis;
		}
		ergebnis = zaehler / werte[this.werte.length - 1];

		for (int i = this.werte.length - 1; i >= 2; i--) {
			ergebnis = zaehler / ((this.werte[i - 1] + ergebnis));
		}
		ergebnis = ergebnis + werte[0];
		return ergebnis;
	}
}
