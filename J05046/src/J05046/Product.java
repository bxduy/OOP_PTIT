package J05046;

import java.util.HashMap;

public class Product implements Comparable<Product>{
	private String iD, name;
	private long amount, price, discount, total;
	public static HashMap<String, Integer> map = new HashMap<>();
	
	public Product(String name, long amount, long price) {
		super();
		String tmp[] = name.trim().split("\\s+");
		String s = tmp[0].substring(0, 1).toUpperCase() + tmp[1].substring(0, 1).toUpperCase();
		if(map.containsKey(s)) map.put(s, map.get(s)+1);
		else map.put(s, 1);
		this.iD = s + String.format("%02d", map.get(s));
		this.name = name;
		this.amount = amount;
		this.price = price;
		long dis = this.amount * this.price;
		this.discount = 0;
		if(this.amount > 10) this.discount = dis * 5/100;
		else if(this.amount >= 8) this.discount = dis*2/100;
		else if(this.amount >= 5) this.discount = dis/100;
		this.total = dis - this.discount;
	}
	
	public String toString() {
		return iD + " " + name + " " + discount + " " + total;
	}

	@Override
	public int compareTo(Product o) {
		if(this.discount > o.discount) return -1;
		return 1;
	}
	
}
