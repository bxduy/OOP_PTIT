package J07037;

public class Company implements Comparable<Company>{
	private String name, iD, amount;

	public Company(String name, String iD, String amount) {
		super();
		this.name = name;
		this.iD = iD;
		this.amount = amount;
	}
	
	public int compareTo(Company x) {
		return this.iD.compareTo(x.iD);
	}
	
	public String toString() {
		return iD + " " + name + " " + amount;
	}
	
}
