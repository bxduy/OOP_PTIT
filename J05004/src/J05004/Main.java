package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String name, birthday, cLass;
			double gpa;
			name = sc.nextLine();
			name = standardized(name);
			cLass = sc.nextLine();
			birthday = sc.nextLine();
			SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sp.parse(birthday);
			birthday = sp.format(date);
			gpa = Double.parseDouble(sc.nextLine());
			Student student = new Student(name, cLass, birthday, gpa);
			System.out.println(student);
		}
	}
	public static String standardized(String s) {
		s = s.replaceAll("\\s+", " ");
		s = s.trim().toLowerCase();
		String[] tmp = s.split(" ");
		s = "";
		for(int i = 0; i < tmp.length; i++) {
			s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i < tmp.length-1) {
				s += " ";
			}
		}
		return s;
	}
}
