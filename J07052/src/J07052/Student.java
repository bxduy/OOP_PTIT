package J07052;

public class Student implements Comparable<Student>{
	private String iD, name;
	private double priorityPoint, p1, p2, p3, total;
	
	public Student(String iD, String name, double p1, double p2, double p3) {
		super();
		this.iD = iD;
		this.name = chuanTen(name);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		if(iD.startsWith("KV1")) priorityPoint = 0.5;
		else if(iD.startsWith("KV2")) priorityPoint = 1;
		else priorityPoint = 2.5;
		this.total = p1*2 + p2 + p3 + priorityPoint;
	}
	
	private String chuanTen(String ten) {
		ten = ten.trim().toLowerCase();
		ten = ten.replaceAll("\\s+", " ");
		String tmp[] = ten.split(" ");
		ten = "";
		for(int i = 0; i < tmp.length; i++) {
			ten += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i != tmp.length-1) ten += " ";
		}
		return ten;
	}
	
	public String toString() {
		return iD + " " + name + " " + ((priorityPoint - (int)priorityPoint == 0) ? (int)priorityPoint : String.format("%.1f", priorityPoint)) + " " + ((total - (int)(total) == 0) ? (int)(total) : String.format("%.1f", total));
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.total > o.total) return -1;
		if(this.total < o.total) return 1;
		return this.iD.compareTo(o.iD);
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

}
