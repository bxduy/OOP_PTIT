package test8;

public class SV {
	private String iDS, name, phone, email;

	public SV(String iDS, String name, String phone, String email) {
		super();
		this.iDS = iDS;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return iDS + " " + name + " " + phone + " " + email;
	}

	/**
	 * @return the iDS
	 */
	public String getiDS() {
		return iDS;
	}

	/**
	 * @param iDS the iDS to set
	 */
	public void setiDS(String iDS) {
		this.iDS = iDS;
	}
	
}
