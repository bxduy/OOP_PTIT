package J07025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{
	private String iD, name, gender, bir, add;
	public static int cnt = 1;
	
	public Customer(String name, String gender, String bir, String add) throws ParseException {
		super();
		this.name = chuanTen(name);
		this.gender = gender;
		this.bir = chuanNgay(bir);
		this.add = add;
		this.iD = "KH" + String.format("%03d", cnt);
		cnt++;
	}
	
	private String chuanTen(String s) {
		String[] tmp = s.trim().toLowerCase().split("\\s+");
		String ans = "";
		for(int i = 0; i < tmp.length; i++) {
			ans += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1);
			if(i < tmp.length-1) ans += " ";
		}
		return ans;
	}
	
	private String chuanNgay(String s) throws ParseException {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sp.parse(s);
		s = sp.format(date);
		return s;
	}
	
	public int compareTo(Customer o) {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = null, d2 = null;
		try {
			 d1 = sp.parse(this.bir); d2 = sp.parse(o.bir);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  d1.compareTo(d2);
	}
	
	public String toString() {
		return iD + " " + name + " " + gender + " " + add + " " + bir;
	}
	
}
