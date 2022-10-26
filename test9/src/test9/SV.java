package test9;

public class SV {
	private String siD, nameS, phone, email;

	public SV(String siD, String nameS, String phone, String email) {
		super();
		this.siD = siD;
		this.nameS = nameS;
		this.phone = phone;
		this.email = email;
	}

	/**
	 * @return the siD
	 */
	public String getSiD() {
		return siD;
	}
	
	public String toString() {
		return siD + " " + nameS + " ";
	}
	
	
}
