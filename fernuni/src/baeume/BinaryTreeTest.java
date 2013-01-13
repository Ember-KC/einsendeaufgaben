package baeume;

import junit.framework.TestCase;

public class BinaryTreeTest extends TestCase {
	private BinaryTree myTree;

	public void setUp() {
		BinaryTreeNode knoten1 = new BinaryTreeNode(6, null,
				new BinaryTreeNode(5));
		BinaryTreeNode knoten2 = new BinaryTreeNode(2, new BinaryTreeNode(9),
				knoten1);
		BinaryTreeNode knoten3 = new BinaryTreeNode(1, new BinaryTreeNode(4),
				new BinaryTreeNode(8));
		BinaryTreeNode knoten4 = new BinaryTreeNode(7, knoten2, knoten3);

		// zum Schluss wird der Root-Knoten an den Baum gesetzt
		myTree = new BinaryTree(knoten4);

	}

	public void testInorder() {

	}

}
