package baeume;

public class BinaryTreeMain {

	public static void main(String[] args) {
		// Knoten bauen und verdrahten
		BinaryTreeNode knoten1 = new BinaryTreeNode(6, null,
				new BinaryTreeNode(5));
		BinaryTreeNode knoten2 = new BinaryTreeNode(2, new BinaryTreeNode(9),
				knoten1);
		BinaryTreeNode knoten3 = new BinaryTreeNode(1, new BinaryTreeNode(4),
				new BinaryTreeNode(8));
		BinaryTreeNode knoten4 = new BinaryTreeNode(7, knoten2, knoten3);

		// zum Schluss wird der Root-Knoten an den Baum gesetzt
		BinaryTree myTree = new BinaryTree(knoten4);
		myTree.contains(2);

	}
}
