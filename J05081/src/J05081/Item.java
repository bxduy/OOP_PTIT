package J05081;

public class Item implements Comparable<Item>{
	public static int cnt = 1;
	private String name, iD, unit;
	private int benefit, purchasePrice, price;
	public Item(String name, String unit, int purchasePrice, int price) {
		super();
		this.iD = "MH" + String.format("%03d", cnt);
		cnt++;
		this.name = name;
		this.unit = unit;
		this.purchasePrice = purchasePrice;
		this.price = price;
		this.benefit = price - purchasePrice;
	}
	
	public String toString() {
		return iD + " " + name + " " + unit + " " + purchasePrice + " " + price + " " + benefit;
	}
	
	public int compareTo(Item o) {
		if(this.benefit > o.benefit) return -1;
		if(this.benefit < o.benefit) return 1;
		return 0;
	}
	
}
