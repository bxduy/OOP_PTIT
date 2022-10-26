package J05024;

public class Student {
	private String iD, name, clas, email;

	public Student(String iD, String name, String clas, String email) {
		super();
		this.iD = iD;
		this.name = name;
		this.clas = clas;
		this.email = email;
	}

	/**
	 * @return the iD
	 */
	public String getiD() {
		return iD;
	}
	
	public String getClas() {
		return clas;
	}

	public String toString() {
		return iD + " " + name + " " + clas + " " + email;
	}
	
}
