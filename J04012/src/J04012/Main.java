package J04012;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String name, position;
		long salary, workDay;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		salary = sc.nextLong();
		workDay = sc.nextLong();
		position = sc.next();
		Staff staff = new Staff(name, position, salary, workDay);
		System.out.println(staff);
		sc.close();
	}
}
