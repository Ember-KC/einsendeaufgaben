package selbsttestaufgaben;

import java.util.Scanner;

public class NamenPruefen {
	static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final String BINDESTRICH = "-";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Geben Sie bitte Ihren Namen ein!");
		Scanner scan = new Scanner(System.in);
		String personenName = scan.nextLine();
		checkName(personenName);

	}

	public static void checkName(String name) {
		name = name.toUpperCase();
		boolean anfangOk = anfangPruefen(name);
		boolean restOk = restPruefen(name);
		if (anfangOk && restOk) {
			System.out.println("Name ok.");
		} else
			System.out.println("Name nicht ok.");

	}

	public static boolean anfangPruefen(String name) {
		boolean anfangStatus = false;
		if (ALPHABET.indexOf(name.charAt(0)) >= 0) {
			anfangStatus = true;
		}
		return anfangStatus;
	}

	public static boolean restPruefen(String name) {
		boolean endStatus = false;
		for (int i = 0; i < name.length(); i++) {
			if (ALPHABET.indexOf(name.charAt(i)) >= 0
					|| name.contains(BINDESTRICH)) {
				endStatus = true;
			} else
				endStatus = false;

		}
		return endStatus;

	}
}
