package J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	public static int cnt = 1;
	private String iD, name, cl, bir;
	private double gpa;
	
	public Student(String name, String cl, String bir, double gpa) throws ParseException {
		super();
		this.iD = "B20DCCN" + String.format("%03d", cnt);
		cnt++;
		this.name = chuanTen(name);
		this.cl = cl;
		this.bir = chuanNgay(bir);
		this.gpa = gpa;
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
	
	public String toString() {
		return iD + " " + name + " " + cl + " " + bir + " " + String.format("%.2f", gpa);
	}
	
}
