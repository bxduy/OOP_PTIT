package J05018;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
	public static int cnt = 1;
	private String iD, name, classification;
	private ArrayList<Double> point;
	private double finalGrade;
	
	public Student(String name, ArrayList<Double> point) {
		super();
		this.iD = "HS" + String.format("%02d", cnt);
		cnt++;
		this.name = name;
		this.point = point;
		double tmp = 0;
		for(int i = 0; i < point.size(); i++) {
			if(i == 0 || i == 1) {
				tmp += 2 * point.get(i);
			}else {
				tmp += point.get(i);
			}
		}
		tmp = tmp/12;
		this.finalGrade = Math.round(tmp * 10.0)/10.0;
		if(finalGrade >= 9) {
			this.classification = "XUAT SAC";
		}else if(finalGrade >= 8) {
			this.classification = "GIOI";
		}
		else if(finalGrade >= 7) {
			this.classification = "KHA";
		}
		else if(finalGrade >= 5) {
			this.classification = "TB";
		}
		else {
			this.classification = "YEU";
		}
	}
	
	public int compareTo(Student o) {
		if(this.finalGrade > o.finalGrade) return -1;
		if(this.finalGrade < o.finalGrade) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " + String.format("%.1f", finalGrade) + " " + classification;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @return the point
	 */
	public ArrayList<Double> getPoint() {
		return point;
	}

	
}
