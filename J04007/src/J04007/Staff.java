package J04007;

public class Staff {
	private String ID, name, birthday, taxCode, sex, address, contactDate;

	public Staff(String name, String birthday, String taxCode, String sex, String address, String contactDate) {
		super();
		ID = "00001";
		this.name = name;
		this.birthday = birthday;
		this.taxCode = taxCode;
		this.sex = sex;
		this.address = address;
		this.contactDate = contactDate;
	}

	@Override
	public String toString() {
		return ID + " " + name + " " + sex + " " +  birthday + " " + address + " " + taxCode + " " + contactDate;
	}
	
	
	
}
