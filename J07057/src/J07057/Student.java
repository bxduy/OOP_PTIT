package J07057;

public class Student implements Comparable<Student>{
	public static int cnt = 1;
	private String iD, name, ethnic, status;
	private int area;
	private double point, total;
	
	public Student(String name , double point, String ethnic, int area) {
		super();
		this.iD = "TS" + String.format("%02d", cnt);
		cnt++;
		this.name = chuanTen(name);
		this.ethnic = ethnic;
		this.area = area;
		this.point = point;
		this.total = this.point;
		if(this.area == 1) this.total += 1.5;
		else if(this.area == 2)  this.total += 1;
		if(this.ethnic.equals("Kinh")) this.total += 0;
		else this.total += 1.5;
		if(this.total >= 20.5) this.status = "Do";
		else this.status = "Truot";
	}
	
	
	
	private String chuanTen(String s) {
		String tmp[] = s.trim().toLowerCase().split("\\s+");
		s = "";
		int n = tmp.length;
		for(int i = 0; i < n; i++) {
			s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i != n-1) s += " ";
		}
		return s;
	}

	public String toString() {
		return iD + " " + name + " " + String.format("%.1f", total) + " " + status;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.total > o.total) return -1;
		if(this.total < o.total) return 1;
		return this.iD.compareTo(o.iD);
	}
	
}
