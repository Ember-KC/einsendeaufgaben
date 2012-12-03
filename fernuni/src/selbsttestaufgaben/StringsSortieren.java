package selbsttestaufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringsSortieren {
	// als Pflegemittel getarnter String-Test ;)

	public static void main(String[] args) {
		System.out.println("String 1: ");
		Scanner scan = new Scanner(System.in);
		ArrayList<String> stringCollection = new ArrayList<String>();
		stringCollection.add(scan.nextLine());
		System.out.println("String 2:");
		stringCollection.add(scan.nextLine());
		System.out.println("String 3:");
		stringCollection.add(scan.nextLine());
		Collections.sort(stringCollection);
		for (String sortierterString : stringCollection) {
			System.out.println(sortierterString);

		}
		scan.close();
	}

	/*
	 * public static ArrayList<String> sortStrings(Collection<String> liste) {
	 * Collection<String> stringList = new ArrayList<String>();
	 * stringList.sort(liste);
	 * 
	 * for (String unsortierterString : liste) { if (stringList.isEmpty()) {
	 * stringList.add(unsortierterString);
	 * 
	 * } for (String sortierterString : stringList) { if
	 * (unsortierterString.compareTo(sortierterString) < 0) {
	 * stringList.add(unsortierterString);
	 * 
	 * } else continue; }
	 * 
	 * }
	 * 
	 * return stringList;
	 * 
	 * }
	 */
}
