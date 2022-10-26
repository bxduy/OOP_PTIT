package J05020;

public class Student implements Comparable<Student>{
	private String iD, name, cLass, email;

	public Student(String iD, String name, String cLass, String email) {
		super();
		this.iD = iD;
		this.name = name;
		this.cLass = cLass;
		this.email = email;
	}
	
	public int compareTo(Student o) {
//		if(this.cLass.compareTo(o.cLass) != 0) return this.cLass.compareTo(o.cLass);
//		else {
			return this.iD.compareTo(o.iD);
//		}
	}
	
	public String toString() {
		return iD + " " + name + " " + cLass + " " + email;
	}
	
}
