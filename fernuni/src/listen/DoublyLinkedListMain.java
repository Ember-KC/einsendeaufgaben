package listen;

public class DoublyLinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoublyLinkedList doppelliste = new DoublyLinkedList();
		doppelliste.enqueue("Test1");
		System.out.println("\n Listeninhalt: ");
		doppelliste.printList();
		doppelliste.enqueue("Test2");
		System.out.println("\n Listeninhalt: ");
		doppelliste.printList();
		doppelliste.enqueue("Test3");
		System.out.println("\n Listeninhalt: ");
		doppelliste.printList();
		doppelliste.dequeue();
		System.out.println("\n Listeninhalt: ");
		doppelliste.printList();
		doppelliste.dequeue();
		System.out.println("\n Listeninhalt: ");
		doppelliste.printList();
		doppelliste.dequeue();
		System.out.println("\n Listeninhalt: ");
		doppelliste.printList();

	}
}
