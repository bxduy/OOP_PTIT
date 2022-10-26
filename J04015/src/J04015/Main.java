package J04015;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ID, name;
		long salary;
		ID = sc.nextLine();
		name = sc.nextLine();
		salary = sc.nextLong();
		Teacher teacher = new Teacher(ID, name, salary);
		System.out.println(teacher);
		sc.close();
	}
}
