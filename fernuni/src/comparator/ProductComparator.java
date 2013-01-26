package comparator;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	/**
	 * This method compares two products by their respective names.
	 * 
	 * @param p1
	 *            - the first product which to compare
	 * @param p2
	 *            - the second product which to compare
	 * @return int - negative int if first product is bigger than second, 0 if
	 *         they are equal, positive int if second product is bigger than
	 *         first
	 */
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().compareTo(p2.getName());

	}
}
