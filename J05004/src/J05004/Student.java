package J05004;

public class Student {
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
	
	public String toString() {
		return iD + " " + name + " " +cLass + " " + birthday + " " + String.format("%.2f", gpa);
	}
}
