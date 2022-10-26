package J04005;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String birthDay = sc.next();
		double point1 = sc.nextDouble();
		double point2 = sc.nextDouble();
		double point3 = sc.nextDouble();
		Student student = new Student(point1, point2, point3, name, birthDay);
		System.out.println(student);
	}
}
