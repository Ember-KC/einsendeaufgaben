package listen;

public class DoublyLinkedList {

	private DoublyLinkedListNode head;

	public DoublyLinkedList() {
		this.head = null;

	}

	// Hinzufügen eines Eintrags am Ende der Liste
	public void enqueue(String value) {
		enqueue(this.head, value, this.size());

	}

	private DoublyLinkedListNode enqueue(DoublyLinkedListNode node,
			String value, int steps) {
		// Die Größe der Liste wird der Variablen steps zugewiesen
		// Wenn steps = 1 ist das letzte Element der Liste erreicht
		// Der neue Knoten wird dann dahinter eingefügt
		if (steps == 1) {
			DoublyLinkedListNode newNode = new DoublyLinkedListNode(value,
					null, node);
			node.setNext(newNode);
			return newNode;
		}
		// Wenn steps = 0 ist, dann handelt es sich um eine leere Liste der
		// Größe 0
		// Der neue Knoten wird am Kopf der Liste (head) eingefügt
		else if (steps == 0) {
			this.head = new DoublyLinkedListNode(value, null, null);
			return this.head;
		}
		// Wenn Steps weder 1 noch 0 ist, wird die Methode wieder aufgerufen mit
		// dem nächsten Knoten und steps wird dekrementiert
		return enqueue(node.getNext(), value, steps - 1);
	}

	// Entfernen eines Eintrags am Anfang der Liste
	public void dequeue() {
		if (this.size() == 0) {
			this.head = null;
		}
		DoublyLinkedListNode newFirst = this.head.getNext();
		DoublyLinkedListNode oldFirst = this.head;
		this.head = newFirst;
	}

	// Methode bestimmt die Größe der Liste
	public int size() {
		int count = 0;

		DoublyLinkedListNode current = this.head;
		for (int i = 0; current != null; i++) {
			count++;
			current = current.getNext();
		}
		return count;

	}

	// Methode druckt die Liste
	public void printList() {
		printList(this.head);
	}

	private void printList(DoublyLinkedListNode node) {
		if (node == null) {
			return;
		}
		node.print();
		System.out.print(" ");
		printList(node.getNext());
	}

}
