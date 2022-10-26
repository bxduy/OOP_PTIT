package J04005;

public class Student {
	private double point1, point2, point3;
	private String name, birthDay;
	
	public Student(double point1, double point2, double point3, String name, String birthDay) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.name = name;
		this.birthDay = birthDay;
	}
	
	private double Total() {
		return this.point1 + this.point2 + this.point3;
	}
	
	public String toString() {
		return this.name + " " + this.birthDay + " " + String.format("%.1f", this.Total());
	}
	
}
