package J07010;

public class Student {
	private String ID, name, cLass, birthday;
	private double gpa;

	public Student(String iD, String name, String cLass, String birthday, double gpa) {
		super();
		ID = iD;
		this.name = name;
		this.cLass = cLass;
		this.birthday = birthday;
		this.gpa = gpa;
	}
	
	public String toString() {
		return ID + " " + name + " " + cLass + " " + " " + birthday + " " + String.format("%.2f", gpa);
	}
	
}
