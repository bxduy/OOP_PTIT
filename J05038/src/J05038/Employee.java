package J05038;

public class Employee implements Comparable<Employee>{
	private String iD, name, position;
	private long payDay, workDays, allowance, bonus, total, monthSa;
	public static int cnt = 1;
	
	public Employee(String name, long payDay, long workDays, String position) {
		super();
		this.iD = "NV" + String.format("%02d", cnt++);
		this.name = name;
		this.position = position;
		this.payDay = payDay;
		this.workDays = workDays;
		this.monthSa = this.workDays*this.payDay;
		this.bonus = 0;
		if(this.workDays >= 25) this.bonus = this.monthSa/5;
		else if(this.workDays >= 22) this.bonus = this.monthSa/10;
		this.allowance = 250000;
		if(this.position.equals("PGD")) this.allowance = 200000;
		else if(this.position.equals("TP")) this.allowance = 180000;
		else if(this.position.equals("NV")) this.allowance = 150000;
		this.total = this.monthSa + this.bonus + this.allowance;
	}

	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	
	public String toString() {
		return iD + " " + name + " " + monthSa + " " + bonus + " " + allowance + " " + total;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.total > o.total) return -1;
		return 1;
	}
	
	
}
