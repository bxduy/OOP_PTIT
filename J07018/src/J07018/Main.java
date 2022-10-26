package J07018;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Student> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
		}
		list.forEach(stu -> {System.out.println(stu);});
	}
}
