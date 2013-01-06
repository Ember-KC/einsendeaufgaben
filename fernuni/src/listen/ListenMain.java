package listen;

public class ListenMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VerketteteListe liste = new VerketteteListe();
		liste.add(20);
		liste.add(3);
		liste.add(15);
		liste.add(18);
		liste.add(11);
		liste.add(47);
		System.out.println("Gesamtliste: ");
		liste.printList();
		// liste.printList();
		// liste.printReverseList();
		// liste.remove(15);
		// liste.add(2, 8);
		// liste.clear();
		VerketteteListe teilliste = liste.subList(1, 5);
		System.out.println();
		System.out.println("Teilliste: ");
		teilliste.printList();
		// System.out.println(liste.isEmpty());
	}
}
