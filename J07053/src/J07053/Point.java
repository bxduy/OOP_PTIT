package J07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Point implements Comparable<Point>{
	public static int cnt = 1;
	private String name, iD, birthday;
	private double p1, p2, bonus;
	private int age;
	private long total;
	public Point(String name, String birthday, double p1, double p2) throws ParseException {
		super();
		this.iD = "PH" + String.format("%02d", cnt);
		cnt++;
		this.name = name;
		this.birthday = birthday;
		this.p1 = p1;
		this.p2 = p2;
		if(p1 >= 8 && p2 >= 8) this.bonus = 1;
		else if(p1 >= 7.5 && p2 >= 7.5) this.bonus = 0.5;
		else this.bonus = 0;
		this.age = 2021 - Integer.parseInt(this.birthday.substring(6));
		this.total = Math.round((p1+p2)/2 + bonus);
		if(this.total >= 10) this.total = 10;
	}
	
	public String toString() {
		String s;
		if(total  >= 9) s = "Xuat sac";
		else if(total == 8) s = "Gioi";
		else if(total == 7) s = "Kha";
		else if(total >= 5) s = "Trung binh";
		else s = "Truot";
		
		return iD + " " + name + " " + age + " " + total + " " + s;
	}
	
	private String chuanNgay(String s) throws ParseException {
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sp.parse(s);
		s = sp.format(date);
	
		return s;
	}
	
	private String chuanTen(String s) {
		String tmp[] = s.trim().toLowerCase().replaceAll("\\s+", " ").split(" ");
		s = "";
		int n = tmp.length;
		for(int i = 0; i < n; i++) {
			s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i < n-1) s += " ";
		}
		return s;
	}

	@Override
	public int compareTo(Point o) {
		if(this.total > o.total) return -1;
		if(this.total < o.total) return 1;
		return this.iD.compareTo(o.iD);
	}
	
}
