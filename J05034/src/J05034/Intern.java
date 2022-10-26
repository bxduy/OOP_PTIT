package J05034;

public class Intern implements Comparable<Intern>{
	private String order, iD, name, clas, email, company;
	public static int cnt = 1;
	public Intern(String iD, String name, String clas, String email, String company) {
		super();
		this.order = String.valueOf(cnt);
		cnt++;
		this.iD = iD;
		this.name = name;
		this.clas = clas;
		this.email = email;
		this.company = company;
	}
	
	
	
	
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}


	public int compareTo(Intern o) {
		return this.iD.compareTo(o.iD);
	}
	
	public String toString() {
		return order + " " + iD + " " + name + " " + clas + " " + email + " " + company;
	}
	
}
