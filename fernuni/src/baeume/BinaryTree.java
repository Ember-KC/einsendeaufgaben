package baeume;

public class BinaryTree {
	private BinaryTreeNode root;
	private boolean gefunden = false;

	public BinaryTree(BinaryTreeNode root) {
		this.root = root;
	}

	public BinaryTreeNode getRoot() {
		return this.root;
	}

	public void setRoot(BinaryTreeNode node) {
		this.root = node;
	}

	// Baum mit der Pre-Order-Durchlaufstrategie ausdrucken = erst aktuellen
	// Knoten ausdrucken, dann weiter durchlaufen
	public void printPreorder() {
		printPreorder(this.root);
	}

	private void printPreorder(BinaryTreeNode current) {
		if (current == null) {
			return;
		}
		current.printNode();
		printPreorder(current.getLeftNeighbour());
		printPreorder(current.getRightNeighbour());

	}

	// Baum mit der Post-Order-Durchlaufstrategie ausdrucken = erst bis zum
	// Blatt durchlaufen, dann rekursiv aktuellen Knoten ausdrucken

	public void printPostorder() {
		printPostorder(this.root);
	}

	private void printPostorder(BinaryTreeNode current) {
		if (current == null) {
			return;
		}
		// wenn beim Durchlaufen ein Knoten ohne Nachfolger gefunden wird, wird
		// der Knoten gedruckt
		if (current.getLeftNeighbour() == null
				&& current.getRightNeighbour() == null) {
			current.printNode();
			return;
		}
		// Baum mit getLeftNeighbour durchlaufen, bis der erste Knoten ohne
		// Nachfolger gefunden wird
		printPostorder(current.getLeftNeighbour());
		// Baum mit getRightNeighbour durchlaufen, bis der erste ohne Nachfolger
		// gefunden wird
		printPostorder(current.getRightNeighbour());
		// bei der Rückabwicklung der Rekursion werden die auf dem Weg zum Blatt
		// durchlaufenen Knoten gedruckt
		current.printNode();

	}

	// Baum mit in-order-Durchlaufstrategie durchlaufen

	public void printInorder() {
		printInorder(this.root);
	}

	private void printInorder(BinaryTreeNode current) {
		if (current == null) {
			return;
		}
		// wenn beim Durchlaufen ein Knoten ohne Nachfolger gefunden wird, wird
		// der Knoten gedruckt
		if (current.getLeftNeighbour() == null
				&& current.getRightNeighbour() == null) {
			current.printNode();
			return;
		}
		// Baum mit getLeftNeighbour durchlaufen, bis der erste Knoten ohne
		// Nachfolger gefunden wird
		printInorder(current.getLeftNeighbour());
		current.printNode();
		// Baum mit getRightNeighbour durchlaufen, bis der erste ohne Nachfolger
		// gefunden wird
		printInorder(current.getRightNeighbour());
		// bei der Rückabwicklung der Rekursion werden die auf dem Weg zum Blatt
		// durchlaufenen Knoten gedruckt

	}

	public void contains(int x) {
		System.out.println("Der Baum enthält den Wert " + x + ": "
				+ contains(this.root, x));
	}

	private boolean contains(BinaryTreeNode current, int x) {
		if (current == null) {
			return false;
		}
		if (current.getEntry() == x) {
			gefunden = true;
			return gefunden;
		}
		contains(current.getLeftNeighbour(), x);
		contains(current.getRightNeighbour(), x);
		return gefunden;
	}
}
