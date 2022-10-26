package J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String name, cLass, birthday;
			name = sc.nextLine();
			cLass = sc.nextLine();
			birthday = sc.nextLine();
			SimpleDateFormat spfm = new SimpleDateFormat("dd/MM/yyyy");
			Date date = spfm.parse(birthday);
			birthday = spfm.format(date);
			double gpa = Double.parseDouble(sc.nextLine());
			Student student = new Student(name, cLass, birthday, gpa);
			System.out.println(student);
		}
		sc.close();
	}
}
