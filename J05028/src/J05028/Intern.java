package J05028;

public class Intern implements Comparable<Intern>{
	private String iD, name;
	private int amount;

	public Intern(String iD, String name, int amount) {
		super();
		this.iD = iD;
		this.name = name;
		this.amount = amount;
	}
	
	public int compareTo(Intern o) {
		if(this.amount > o.amount) return -1;
		if(this.amount < o.amount) return 1;
		return this.iD.compareTo(o.iD);
	}
	
	public String toString() {
		return iD + " " + name + " " + amount;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	
	
}
