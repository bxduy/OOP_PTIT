package J04013;

public class Student implements Comparable<Student>{
	private String name, area;
	private double point1, point2, point3, priorityPoint;
	
	public Student(String area, String name,  double point1, double point2, double point3) {
		super();
		this.name = name;
		this.area = area;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.PriorityPoint();
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	
	/**
	 * @return the point1
	 */
	public double getPoint1() {
		return point1;
	}


	/**
	 * @return the point2
	 */
	public double getPoint2() {
		return point2;
	}

	
	/**
	 * @return the point3
	 */
	public double getPoint3() {
		return point3;
	}
	
	private double TotalPoint() {
		return this.getPoint1() + this.getPoint2() + this.getPoint3() + this.priorityPoint;
	}
	
	private void PriorityPoint() {
		priorityPoint = 0.5;
		if(this.getArea().startsWith("KV2")) {
			priorityPoint = 1;
		}else if(this.getArea().startsWith("KV3")) {
			priorityPoint = 2.5;
		}
	}
	
	public String toString() {
		double total = TotalPoint();
		String ans = "";
		if(total>= 24.0) {
			ans = "TRUNG TUYEN";
		}else {
			ans = "TRUOT";
		}
		return area + " " + name + " " + (priorityPoint - (int)priorityPoint == 0 ? (int)priorityPoint : String.format("%.1f", priorityPoint)) + " " + (total - (int)total == 0 ? (int)total : String.format("%.1f", total)) + " " + ans;
	}

	@Override
	public int compareTo(Student o) {
		if(this.TotalPoint() > o.TotalPoint()) return -1;
		if(this.TotalPoint() < o.TotalPoint()) return 1;
		return this.area.compareTo(o.area);
	}
	
}
