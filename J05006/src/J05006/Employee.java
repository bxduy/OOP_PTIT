package J05006;

public class Employee {
	private String iD, name, gender, birthday, address, taxCode, contractDate;
	public static int cnt = 1;
	public Employee(String name, String gender, String birthday, String address, String taxCode, String contractDate) {
		super();
		this.iD = String.format("%05d", cnt);
		cnt++;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.taxCode = taxCode;
		this.contractDate = contractDate;
	}
	
	public String toString() {
		return iD + " " + name + " " + gender + " " + birthday + " " + address + " " + taxCode + " " + contractDate;
	}
	
}
