package klausuruebungen;

public class Binomial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Binomial bino = new Binomial();
		System.out.println("Rekursiv: " + bino.binomialRekursiv(49, 6));
		System.out.println("Iterativ: " + bino.binomialIterativ(4, 2));

	}

	public int binomialRekursiv(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return binomialRekursiv(n - 1, k - 1) + binomialRekursiv(n - 1, k);
	}

	public int binomialIterativ(int n, int k) {
		int erg = 1;
		for (int i = 1; i <= k; i++) {
			erg = erg * (n - i + 1);
			erg = erg / i;
		}
		return erg;
	}
}
