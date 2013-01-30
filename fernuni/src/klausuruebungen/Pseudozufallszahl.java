package klausuruebungen;

public class Pseudozufallszahl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pseudozufallszahl pseudo = new Pseudozufallszahl();
		System.out.println(pseudo.zufallszahl(5));
		pseudo.gebeZufallszahlenAus(5, 30);
	}

	public long zufallszahl(int n) {

		if (n < 3) {
			return n + 1;
		}
		return 1 + (((zufallszahl(n - 1) - zufallszahl(n - 2)) * zufallszahl(n - 3)) % 100);

	}

	public void gebeZufallszahlenAus(int n, int x) {
		for (int i = n; i <= x; i++) {
			System.out.println(this.zufallszahl(i));
		}

	}

}
