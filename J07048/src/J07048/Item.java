package J07048;

public class Item implements Comparable<Item>{
	private String iD, name;
	private int price, warrantyPeriod;
	
	public Item(String iD, String name, int price, int warrantyPeriod) {
		super();
		this.iD = iD;
		this.name = name;
		this.price = price;
		this.warrantyPeriod = warrantyPeriod;
	}
	
	public int compareTo(Item o) {
		if(this.price > o.price) return -1;
		if(this.price < o.price) return 1;
		return this.iD.compareTo(o.iD);
	}
	
	public String toString() {
		return iD + " " + name + " " + price + " " + warrantyPeriod;
	}
	
}
