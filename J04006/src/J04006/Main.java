package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String name, Class, birthday;
		double gpa;
		name = sc.nextLine();
		Class = sc.next();
		birthday = sc.next();
		gpa = sc.nextDouble();
		SimpleDateFormat Simple = new SimpleDateFormat("dd/MM/yyyy");
		Date date = Simple.parse(birthday);
		birthday = Simple.format(date);
		Student student = new Student(name, birthday, Class, gpa);
		System.out.println(student);
		sc.close();
	}
}
