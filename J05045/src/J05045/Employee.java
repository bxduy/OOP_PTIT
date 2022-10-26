package J05045;

public class Employee implements Comparable<Employee>{
	private String iD, name, po;
	private long salary, workDays, bonus, tmp, remain, total, ofSa;
	public static int cnt = 1;
	
	public Employee(String name, String po, long salary, long workDays) {
		super();
		this.iD = "NV" + String.format("%02d", cnt++);
		this.name = name;
		this.po = po;
		this.salary = salary;
		this.workDays = workDays;
		this.bonus = 500;
		bonus();
		this.ofSa = this.salary*this.workDays;
		tmp();
		this.total = this.ofSa+this.bonus;
		this.remain = this.total-this.tmp;
	}
	
	private void bonus() {
		this.bonus = 100;
		if(this.po.equals("PGD")) this.bonus = 400;
		else if(this.po.equals("TP")) this.bonus = 300;
		else if(this.po.equals("KT")) this.bonus = 250;
		else if(this.po.equals("GD")) this.bonus = 500;
	}
	
	private void tmp() {
		long res = this.ofSa+this.bonus;
		if(res*2/3 < 25000) {
			this.tmp = Math.round(res*2.0/3000)*1000;
		}else this.tmp = 25000;
	}
	
	
	public String toString() {
		return iD + " " + name + " " + bonus + " " + ofSa + " " + tmp + " " + remain ;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.total > o.total) return -1;
		if(this.total > o.total) return 1;
		return this.iD.compareTo(o.iD);
	}

	/**
	 * @return the po
	 */
	public String getPo() {
		return po;
	}

}
