package listen;

public class VerketteteListe {

	int summe = 0;

	private ListNode head;

	public VerketteteListe() {
		this.head = null;
	}

	public void add(int value) {
		ListNode newNode = new ListNode(value, this.head);
		this.head = newNode;
	}

	public int size() {
		int count = 0;

		ListNode current = this.head;
		for (int i = 0; current != null; i++) {
			count++;
			current = current.getNext();
		}
		return count;

	}

	public int sumIterativ() {
		int summe = 0;
		ListNode current = this.head;
		while (current != null) {
			summe = summe + current.getEntry();
			current = current.getNext();
		}

		return summe;

	}

	public int sizeRekursiv() {
		return size(this.head);
	}

	private int size(ListNode node) { // 1
		if (node == null) { // 2
			return 0; // 3
		} // 4
		return size(node.getNext()) + 1; // 5
	}

	public int sumRekursiv() {
		return sum(this.head);
	}

	private int sum(ListNode node) {
		if (node == null) {
			return 0;
		}
		return node.getEntry() + sum(node.getNext());

	}

	public void printList() {
		printList(this.head);
	}

	private void printList(ListNode node) {
		if (node == null) {
			return;
		}
		node.print();
		System.out.print(" ");
		printList(node.getNext());
	}

	// Liste umgekehrt herum ausdrucken

	public void printReverseList() {
		printReverseList(this.head);
	}

	private void printReverseList(ListNode node) {
		if (node == null) {
			return;
		}
		printReverseList(node.getNext());
		node.print();
		System.out.print(" ");
	}

	// Knoten in einer Liste löschen
	public void remove(int value) {
		this.head = remove(this.head, value);
	}

	private ListNode remove(ListNode node, int value) { // 1
		if (node == null) { // 2
			return null; // 3
		} // 4
		if (node.getEntry() == value) { // 5
			return node.getNext(); // 6
		} // 7
		node.setNext(remove(node.getNext(), value)); // 8
		return node; // 9
	}

	// Rekursiv prüfen, ob ein bestimmter Wert in einer Liste enthalten ist
	public boolean contains(int value) {
		return contains(this.head, value);
	}

	private boolean contains(ListNode node, int value) {
		if (node == null) {
			return false;
		}
		if (node.getEntry() == value) {
			return true;
		}
		return contains(node.getNext(), value);
	}

	// Neuen Knoten an einem bestimmten Index einfügen
	public void add(int index, int value) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("index muss im "
					+ "Bereich von 0 bis " + size() + " liegen.");
		}
		this.head = add(this.head, index, value);

	}

	private ListNode add(ListNode node, int steps, int value) { // 1
		if (steps == 0) { // 2
			return new ListNode(value, node); // 3
		} // 4
		node.setNext(add(node.getNext(), steps - 1, value)); // 5
		return node; // 6
	}

	// Wert der Liste an einem bestimmten Index rausfinden (rekursiv)

	public int getRekursiv(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Index muss im "
					+ "Bereich von 0 bis " + size() + " liegen.");
		}
		return getRekursiv(this.head, index);
	}

	private int getRekursiv(ListNode node, int index) {
		if (index == 0) {
			return node.getEntry();
		}
		return getRekursiv(node.getNext(), index - 1);
	}

	// Wert der Liste an einem bestimmten Index rausfinden (iterativ)
	public int getIterativ(int index) {
		int value = 0;
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Index muss im "
					+ "Bereich von 0 bis " + size() + " liegen.");
		}
		ListNode node = this.head;

		for (int i = index; i >= 0; i--) {
			if (index == 0) {
				value = node.getEntry();
			}
			node = node.getNext();

		}
		return value;

	}

	// Methode, die die Liste leert

	public void clear() {
		this.head = null;
	}

	public boolean isEmpty() {
		boolean istLeer = false;
		if (this.head == null) {
			istLeer = true;
		}
		return istLeer;
	}

	// Methode gibt eine Teilliste, die von einem Anfangsindex bis zu einem
	// Endindex geht, einer Liste zurück

	public VerketteteListe subList(int fromIndex, int toIndex) {
		if (fromIndex < 0 || toIndex < 0 || fromIndex > this.size()
				|| toIndex > this.size()) {
			throw new IndexOutOfBoundsException(
					"Der Index muss zwischen 0 und " + size() + " liegen.");
		} else if (fromIndex > toIndex) {
			throw new IndexOutOfBoundsException(
					"Der Startindex darf nicht größer als der Endindex sein!");
		}
		VerketteteListe teilliste = new VerketteteListe();
		subListRekursiv(teilliste, this.head, fromIndex, toIndex);
		return teilliste;
	}

	private VerketteteListe subListRekursiv(VerketteteListe teilliste,
			ListNode node, int fromIndex, int toIndex) {
		if (node == null) {
			return null;
		}
		subListRekursiv(teilliste, node.getNext(), fromIndex - 1, toIndex - 1);
		if (fromIndex <= 0 && toIndex >= 1) {
			teilliste.add(node.getEntry());
		}
		return teilliste;
	}

}
