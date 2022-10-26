package J05050;

public class Bill implements Comparable<Bill>{
	private String iD, group;
	private long coefficient, old, neww, amount, tmpMoney, exceed, total;
	public static int cnt = 1;
	
	public Bill(String group, long old, long neww) {
		super();
		this.iD = "KH" + String.format("%02d", cnt++);
		this.group = group;
		this.coefficient = 2;
		if(this.group.equals("KD")) this.coefficient = 3;
		else if(this.group.equals("TT")) this.coefficient = 4;
		else if(this.group.equals("NN")) this.coefficient = 5;
		this.old = old;
		this.neww = neww;
		this.amount = this.neww - this.old;
		this.tmpMoney = this.amount * this.coefficient * 550;
		double exceed = 0;
		if(this.amount > 100) exceed = this.tmpMoney*1.0;
		else if(this.amount >= 50) exceed = this.tmpMoney/100.0*35;
		this.exceed = (long)Math.round(exceed);
		this.total = this.tmpMoney+this.exceed;
	}
	
	public String toString() {
		return iD + " " + coefficient + " " + tmpMoney + " " + exceed + " " + total;
	}

	@Override
	public int compareTo(Bill o) {
		if(this.total > o.total) return -1;
		return 1;
	}
	
}
