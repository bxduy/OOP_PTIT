package J05009;

public class Student implements Comparable<Student>{
	public static int cnt = 1;
	private String iD, name, birthday;
	private double point1, point2, point3, totalPoint;
	
	public Student(String name, String birthday, double point1, double point2, double point3) {
		super();
		this.iD = String.valueOf(cnt);
		cnt++;
		this.name = name;
		this.birthday = birthday;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.totalPoint = point1 + point2 + point3;
	}

	/**
	 * @return the totalPoint
	 */
	public double getTotalPoint() {
		return totalPoint;
	}

	public int compareTo(Student o) {
		if(this.totalPoint > o.totalPoint) return -1;
		if(this.totalPoint < o.totalPoint) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " + birthday + " " + totalPoint;
	}

	/**
	 * @return the point1
	 */
	public double getPoint1() {
		return point1;
	}

	/**
	 * @param point1 the point1 to set
	 */
	public void setPoint1(double point1) {
		this.point1 = point1;
	}

	/**
	 * @return the point2
	 */
	public double getPoint2() {
		return point2;
	}

	/**
	 * @param point2 the point2 to set
	 */
	public void setPoint2(double point2) {
		this.point2 = point2;
	}

	/**
	 * @return the point3
	 */
	public double getPoint3() {
		return point3;
	}

	/**
	 * @param point3 the point3 to set
	 */
	public void setPoint3(double point3) {
		this.point3 = point3;
	}
	
}
