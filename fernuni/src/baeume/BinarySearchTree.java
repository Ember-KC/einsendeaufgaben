package baeume;

public class BinarySearchTree extends BinaryTree {
	boolean gefunden = false;

	public BinarySearchTree(BinaryTreeNode root) {
		super(root);
	}

	public void fillSearchTree(int[] entries) {
		// 1. Werte des Baums werden als Array übergeben
		// 2. Element an index[0] in den ersten Knoten schreiben;

		BinaryTreeNode current = new BinaryTreeNode(entries[0], null, null);
		setRoot(current);
		// 3. mit for-Schleife durch Array iterieren und mit dem jeweiligen Wert
		// add() aufrufen
		for (int i = 1; i < entries.length; i++) {
			addChildNodeForNode(current, entries[i]);
		}
	}

	// 4. add() benötigt zwei Eingabeparameter: den aktuellen Knoten (um
	// vergleichen zu können) und den Wert, der
	// hinzugefügt wird. Die Methode fügt dem übergebenen Knoten einen
	// Child-Knoten hinzu.
	public void addChildNodeForNode(BinaryTreeNode node, int wert) {
		// 5. if (current.getEntry() == 0) --> neuen Knoten hinzufügen -->
		// return
		if (node == null) {
			return;
		}
		// 6. if Wert < current.getEntry() --> add() mit dem linken Nachbarn
		// aufrufen
		if (wert < node.getEntry()) {
			if (node.getLeftNeighbour() == null) {
				node.setLeftNeighbour(new BinaryTreeNode(wert));
				return;
			} else {
				addChildNodeForNode(node.getLeftNeighbour(), wert);
			}
		}

		// 7. if Wert > current.getEntry() --> add() mit dem rechten Nachbarn
		// aufrufen
		if (wert > node.getEntry()) {
			if (node.getRightNeighbour() == null) {
				node.setRightNeighbour(new BinaryTreeNode(wert));
				return;
			} else {
				addChildNodeForNode(node.getRightNeighbour(), wert);
			}
		}

	}

	public boolean containsValue(int wert) {
		return containsValue(this.getRoot(), wert);

	}

	public boolean containsValue(BinaryTreeNode node, int wert) {

		if (node == null) {
			return gefunden;
		}
		// 1. Mit dem Root-Knoten beginnen und den Root-Inhalt mit dem Wert
		// vergleichen
		// 2. if Wert == root-Wert --> gefunden auf true setzen und
		// zurückgeben
		if (node.getEntry() == wert) {
			gefunden = true;
			return gefunden;
		}
		// 3. Wenn der Wert kleiner als der aktuelle Knoten ist: Methode
		// erneut aufrufen mit dem linken Nachbarn des Knotens
		if (wert < node.getEntry()) {
			containsValue(node.getLeftNeighbour(), wert);
		}
		// 4. Wenn der Wert größer als der aktuelle Knoten ist: Methode erneut
		// aufrufen mit dem rechten Nachbarn des Knotens
		if (wert > node.getEntry()) {
			containsValue(node.getRightNeighbour(), wert);
		}
		return gefunden;
	}
}
