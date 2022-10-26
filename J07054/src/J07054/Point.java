package J07054;

public class Point implements Comparable<Point>{
	public static int cnt = 1;
	private String iD, name;
	private double p1, p2, p3, total;
	
	public Point(String name, double p1, double p2, double p3) {
		super();
		this.iD = "SV" + String.format("%02d", cnt);
		cnt++;
		this.name = chuanten(name);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.total = Math.round((p1*3 + p2*3 + p3*2) * 1.0)/8.00;
	}
	
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}


	private String chuanten(String ten) {
		String tmp[] = ten.trim().toLowerCase().replaceAll("\\s+", " ").split(" ");
		ten = "";
		for(int i = 0; i < tmp.length; i++) {
			ten += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i < tmp.length-1) ten += " ";
		}
		return ten;
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if(this.total > o.total) return -1;
		if(this.total < o.total) return 1;
		return this.iD.compareTo(o.iD);
	}
	
	public String toString() {
		return iD + " " + name + " " + String.format("%.2f", total);
	}
	
	
}
