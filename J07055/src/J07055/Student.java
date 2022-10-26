package J07055;

public class Student implements Comparable<Student>{
	public static int cnt = 1;
	private String iD, name, classification;
	private double p1, p2, p3, finalGrade;
	
	public Student(String name, double p1, double p2, double p3) {
		super();
		this.iD = "SV" + String.format("%02d", cnt);
		cnt++;
		this.name = chuanTen(name);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.finalGrade = p1*0.25 + p2*0.35 + p3*0.4;
		if(finalGrade >= 8) {
			this.classification = "GIOI";
		}else if(finalGrade >= 6.5) this.classification = "KHA";
		else if(finalGrade >= 5) this.classification = "TRUNG BINH";
		else this.classification = "KEM";
	}
	
	public int compareTo(Student o) {
		if(this.finalGrade > o.finalGrade) return -1;
		return 1;
	}
	
	public String toString() {
		return iD + " " + name + " " + String.format("%.2f", finalGrade) + " " + classification;
	}
	
	private String chuanTen(String name) {
		name = name.trim().toLowerCase();
		name = name.replaceAll("\\s+", " ");
		String[] tmp = name.split(" ");
		name = "";
		for(int i = 0; i < tmp.length; i++) {
			name += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i != tmp.length - 1) name += " ";
		}
		return name;
	}
	
}
