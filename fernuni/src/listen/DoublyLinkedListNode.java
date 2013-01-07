package listen;

public class DoublyLinkedListNode {

	private String entry;
	private DoublyLinkedListNode next;
	private DoublyLinkedListNode prev;

	public DoublyLinkedListNode(String entry, DoublyLinkedListNode next,
			DoublyLinkedListNode prev) {

		this.entry = entry;
		this.next = next;
		this.prev = prev;

	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public DoublyLinkedListNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}

	public DoublyLinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyLinkedListNode prev) {
		this.prev = prev;
	}

	public void print() {
		System.out.print(this.entry);
	}

}
