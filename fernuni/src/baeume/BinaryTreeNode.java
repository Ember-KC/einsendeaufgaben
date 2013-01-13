package baeume;

public class BinaryTreeNode {
	private int entry;
	private BinaryTreeNode leftNeighbour;
	private BinaryTreeNode rightNeighbour;

	// Konstruktor für Blätter (Einträge ohne Nachfolger)

	public BinaryTreeNode(int entry) {
		this.entry = entry;
	}

	// Konstruktor für Einträge mit Nachfolgern

	public BinaryTreeNode(int entry, BinaryTreeNode leftNeighbour,
			BinaryTreeNode rightNeighbour) {
		this.entry = entry;
		this.leftNeighbour = leftNeighbour;
		this.rightNeighbour = rightNeighbour;

	}

	public BinaryTreeNode getLeftNeighbour() {
		return this.leftNeighbour;
	}

	public void setLeftNeighbour(BinaryTreeNode leftNeighbour) {
		this.leftNeighbour = leftNeighbour;
	}

	public BinaryTreeNode getRightNeighbour() {
		return this.rightNeighbour;
	}

	public void setRightNeighbour(BinaryTreeNode rightNeighbour) {
		this.rightNeighbour = rightNeighbour;
	}

	public int getEntry() {
		return this.entry;
	}

	public void setEntry(int entry) {
		this.entry = entry;
	}

	public void printNode() {
		System.out.println("Eintrag des aktuellen Knotens: " + this.getEntry());
	}

}
