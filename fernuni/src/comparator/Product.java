package comparator;

public class Product {
	private String name;
	private double price;
	private String articleNumber;

	public Product(String name, double price, String articleNumber) {
		this.name = name;
		this.price = price;
		this.articleNumber = articleNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}
}
