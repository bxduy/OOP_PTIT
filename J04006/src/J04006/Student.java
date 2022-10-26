package J04006;

public class Student {
	private String ID, name, birthday, Class;
	private double gpa;
	
	public Student(String name, String birthday, String class1, double gpa) {
		super();
		ID = "B20DCCN001";
		this.name = name;
		this.birthday = birthday;
		Class = class1;
		this.gpa = gpa;
	}
	
	public String toString() {
		return ID + " " + name + " " + Class + " " + birthday + " " + String.format("%.2f", gpa);
	}
	
}
