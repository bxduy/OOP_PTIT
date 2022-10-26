package J05022;

public class Student {
	private String iD, name, cLass, email;

	public Student(String iD, String name, String cLass, String email) {
		super();
		this.iD = iD;
		this.name = name;
		this.cLass = cLass;
		this.email = email;
	}
	
	public String toString() {
		return iD + " " + name + " " + cLass + " " + email;
	}

	/**
	 * @return the cLass
	 */
	public String getcLass() {
		return cLass;
	}
	
}
