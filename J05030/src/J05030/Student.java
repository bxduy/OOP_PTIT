package J05030;

public class Student implements Comparable<Student>{
	private String iD, name, clas;
	private double point1, point2, point3;
	
	public Student(String iD, String name, String clas, double point1, double point2, double point3) {
		super();
		this.iD = iD;
		this.name = name;
		this.clas = clas;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		return iD + " " + name + " " + clas + " " + String.format("%.1f", point1) + " " + String.format("%.1f", point2) + " " + String.format("%.1f", point3);
	}
	
}
