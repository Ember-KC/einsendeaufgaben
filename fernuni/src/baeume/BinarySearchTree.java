package baeume;

public class BinarySearchTree extends BinaryTree {

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
}
