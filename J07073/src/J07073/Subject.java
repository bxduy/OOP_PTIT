package J07073;

public class Subject implements Comparable<Subject>{
	private String iD, name, credit, teach, exam;

	public Subject(String iD, String name, String credit, String teach, String exam) {
		super();
		this.iD = iD;
		this.name = name;
		this.credit = credit;
		this.teach = teach;
		this.exam = exam;
	}

	@Override
	public int compareTo(Subject o) {
		// TODO Auto-generated method stub
		return this.iD.compareTo(o.iD);
		
	}
	
	public String toString() {
		return iD + " " + name + " " + credit + " " + teach + " " + exam;
	}

	/**
	 * @return the exam
	 */
	public String getExam() {
		return exam;
	}

	
}
