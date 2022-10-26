package J05023;

public class Student {
	private String iD, name, clas, email;

	public Student(String iD, String name, String clas, String email) {
		super();
		this.iD = iD;
		this.name = name;
		this.clas = clas;
		this.email = email;
	}
	
	public String toString() {
		return iD + " " + name + " " + clas + " " + email;
	}

	/**
	 * @return the clas
	 */
	public String getClas() {
		return clas;
	}

	
	
}
