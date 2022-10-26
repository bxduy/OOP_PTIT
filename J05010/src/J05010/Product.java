package J05010;

public class Product implements Comparable<Product>{
	public static int cnt = 1;
	private String iD, name, productGroup;
	private double purchasePrice, price, benefit;
	
	public Product(String name, String productGroup, double purchasePrice, double price) {
		super();
		this.iD = String.valueOf(cnt);
		cnt++;
		this.name = name;
		this.productGroup = productGroup;
		this.purchasePrice = purchasePrice;
		this.price = price;
		this.benefit = price - purchasePrice;
	}
	
	public int compareTo(Product o) {
		if(this.benefit > o.benefit) return -1;
		if(this.benefit < o.benefit) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " + productGroup + " " + String.format("%.2f", benefit);
	}

	/**
	 * @return the productGroup
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
}
