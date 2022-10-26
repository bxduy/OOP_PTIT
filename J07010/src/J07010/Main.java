package J07010;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("SV.in"));
		int t = Integer.parseInt(sc.nextLine());
		int k = t;
		StudentList list = new StudentList();
		String iD, name, cLass, birthday;
		double gpa;
		while(t-- > 0) {
			int n = k - t;
			String tmp = String.valueOf(n);
			while(tmp.length() < 3) tmp = "0" + tmp;
			iD = "B20DCCN" + tmp;
			name = sc.nextLine();
			cLass = sc.nextLine();
			birthday = sc.nextLine();
			gpa = Double.parseDouble(sc.nextLine());
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			Date date = simple.parse(birthday);
			birthday = simple.format(date);
			Student student = new Student(iD, name, cLass, birthday, gpa);
			list.add(student);
		}
		sc.close();
		list.show();
	}
}
