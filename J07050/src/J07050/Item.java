package J07050;

public class Item implements Comparable<Item>{
	public static int cnt = 1;
	private String iD, name, group;
	private double purchasePrice, price, benefit;
	public Item(String name, String group, double purchasePrice, double price) {
		super();
		this.iD = "MH" + String.format("%02d", cnt);
		cnt++;
		this.name = name;
		this.group = group;
		this.purchasePrice = purchasePrice;
		this.price = price;
		this.benefit = price - purchasePrice;
	}
	
	public int compareTo(Item o) {
		if(this.benefit > o.benefit) return -1;
		if(this.benefit < o.benefit) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " + group + " " + String.format("%.2f", benefit);
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public double getPrice() {
		return price;
	} 
	
}
