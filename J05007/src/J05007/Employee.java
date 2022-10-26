package J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>{
	public static int cnt = 1;
	private String iD, name, gender, birthday, address, tax, contract;   
	
	public Employee(String name, String gender, String birthday, String address, String tax, String contract) {
		super();
		this.iD = String.format("%05d", cnt);
		cnt++;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.tax = tax;
		this.contract = contract;
	}
	
	public int compareTo(Employee o) {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null, date2 = null;
		try {
			date1 = sp.parse(this.birthday);
			date2 = sp.parse(o.birthday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = date1.compareTo(date2);
		if(i < 0) return -1;
		if(i > 0) return 1;
		return 0;
	}
	
	public String toString() {
		return iD + " " + name + " " + gender + " " + birthday + " " + address + " " + tax + " " + contract;
	}
	
}
