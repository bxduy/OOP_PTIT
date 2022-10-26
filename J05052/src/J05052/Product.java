package J05052;

public class Product implements Comparable<Product>{
	private String iD, name, order, group;
	private long amount, price, discount, total;
	
	public Product(String name, String iD, long amount, long price) {
		super();
		this.iD = iD;
		this.order = iD.substring(1, 4);
		this.group = iD.substring(4);
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.discount = this.amount*this.price*50/100;
		if(this.group.equals("2")) this.discount = this.amount*this.price*30/100;
		this.total = this.amount*this.price-this.discount;
	}
	
	public String toString() {
		return name + " " + iD + " " + order + " " + discount + " " + total;
	}

	@Override
	public int compareTo(Product o) {
		return this.order.compareTo(o.order);
	}
	
	
}
