package J05005;

public class Student implements Comparable<Student>{
	public static int cnt = 1;
	private String iD, name, cLass, birthday;
	private double gpa;
	public Student(String name, String cLass, String birthday, double gpa) {
		super();
		this.iD = "B20DCCN" + String.format("%03d", cnt);
		cnt++;
		this.name = name;
		this.cLass = cLass;
		this.birthday = birthday;
		this.gpa = gpa;
	}
	
	public int compareTo(Student o) {
		if(this.gpa > o.gpa) return -1;
		if(this.gpa < o.gpa) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " +cLass + " " + birthday + " " + String.format("%.2f", gpa);
	}
}
