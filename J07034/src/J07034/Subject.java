package J07034;

public class Subject implements Comparable<Subject>{
	private String name, iD, numberCredit;

	public Subject(String name, String iD, String numberCredit) {
		super();
		this.name = name;
		this.iD = iD;
		this.numberCredit = numberCredit;
	}
	
	public int compareTo(Subject s) {
		return this.name.compareTo(s.name);
	}
	
	public String toString() {
		return iD + " " + name + " " + numberCredit;
	}
	
}
