package rekursion;

import java.util.Scanner;

public class RekursivAufgaben {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte eine Zahl ein!");
		int zahl = scan.nextInt();
		System.out.println("Rekursive Summe: " + summeRekursiv(zahl));
		System.out.println("Fakult�t iterativ: " + fakultaetIterativ(zahl));
		System.out.println("Fakult�t rekursiv: " + fakultaetRekursiv(zahl));
		scan.close();

	}

	static int summeRekursiv(int n) {
		// Basisfall: keine Zahl �brig
		if (n <= 0) {
			return 0;
		}
		// sonst: rekursiver Aufruf
		return summeRekursiv(n - 1) + n;
	}

	static int fakultaetIterativ(int n) {
		int ergebnis = 1;
		for (int i = 1; i <= n; i++) {
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}

	static int fakultaetRekursiv(int n) {
		int ergebnis = 0;
		if (n > 0) {
			ergebnis = fakultaetRekursiv(n - 1) * n;
		} else if (n == 0) {
			ergebnis = 1;
		}
		return ergebnis;
	}

	static int power(int b, int e) {
		int ergebnis = 0;
		if (e > 0) {
			ergebnis = power(b, e - 1) * b;

		} else if (e == 0) {
			return 1;
		}
		return ergebnis;
	}

	static int fibIterativ(int n) {

		int[] fibArray = new int[n + 1];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for (int j = 2; j < fibArray.length; j++) {
			fibArray[j] = fibArray[j - 1] + fibArray[j - 2];
		}

		return fibArray[fibArray.length - 1];
	}

	static boolean istPalindrom(String wort) {
		boolean palindrom = false;
		String output = "";

		for (int i = wort.length() - 1; i >= 0; i--) {
			output = output + wort.charAt(i);
		}
		if (wort.equalsIgnoreCase(output)) {
			palindrom = true;
		}
		return palindrom;

	}

	boolean istPalindromRekursiv(String s) {
		// Basisfall
		if (s.length() <= 1) {
			return true;
		}
		// erstes und letztes Zeichen vergleichen

		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}
		return istPalindromRekursiv(s.substring(1, s.length() - 1));
	}

	public long multipliziere(long a, long b) {

		if (a < 0 || b < 0) {
			throw new IllegalArgumentException(
					"Keine negativen Zahlen eingeben!");
		} else if (a <= 1) {
			return b;
		}
		// a muss bei jedem Durchgang dekrementiert werden;
		a--;

		return multipliziere(a, b) + b;

	}
}
