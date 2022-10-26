package J07058;

public class Subject implements Comparable<Subject>{
	private String ID, name, examForm;

	public Subject(String iD, String name, String examForm) {
		super();
		ID = iD;
		this.name = name;
		this.examForm = examForm;
	}
	
	public int compareTo(Subject a) {
		return this.ID.compareTo(a.ID);
	}
	
	public String toString() {
		return ID + " " + name + " " + examForm;
	}
	
}
