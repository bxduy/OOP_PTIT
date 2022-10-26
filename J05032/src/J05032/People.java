package J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People implements Comparable<People>{
	private String name, birthday;

	public People(String name, String birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	public int compareTo(People o) {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = null, d2 = null;
		try {
			d1 = sp.parse(this.birthday);
			d2 = sp.parse(o.birthday);
		}catch(ParseException e){
			e.printStackTrace();
		}
		int i = d1.compareTo(d2);
		return i;
	}
	
	public String toString() {
		return name;
	}
	
}
