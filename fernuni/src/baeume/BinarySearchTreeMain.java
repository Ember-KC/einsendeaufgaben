package baeume;

public class BinarySearchTreeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree binTree = new BinarySearchTree(null);
		int[] entries = { 7, 12, 20, 3, 5, 1, 6, 9 };
		binTree.fillSearchTree(entries);
		binTree.printInorder();
	}

}
