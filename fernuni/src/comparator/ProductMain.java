package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		Product p1 = new Product("Ente", 3.50, "A-23578");
		productList.add(p1);
		Product p2 = new Product("Weihnachtsmann", 10.70, "A-345679789");
		productList.add(p2);
		Product p3 = new Product("Osterhase", 5.50, "A-09876");
		productList.add(p3);
		Product p4 = new Product("Klapper Klaus", 7.90, "A-34545435");
		productList.add(p4);
		Product p5 = new Product("Schokohuhn", 3.50, "A-45645763");
		productList.add(p5);
		Product p6 = new Product("Krokantmeerschweinchen", 15.50, "A-4564562");
		productList.add(p6);
		System.out.println("Unsortierte Liste: ");
		for (Product p : productList) {
			System.out.println(p.getName());

		}
		ProductComparator p = new ProductComparator();
		Collections.sort(productList, p);
		System.out.println("Sortierte Liste: ");

		for (Product pr : productList) {
			System.out.println(pr.getName());

		}

	}

}
