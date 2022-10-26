package J04013;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, area;
		double p1, p2, p3;
		ArrayList<Student> list = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			area = sc.nextLine();
			name = sc.nextLine();
			
			p1 = Double.parseDouble(sc.nextLine());
			p2 = Double.parseDouble(sc.nextLine());
			p3 = Double.parseDouble(sc.nextLine());
			p1 *= 2;
			Student student = new Student(area, name, p1, p2, p3);
			
			list.add(student);
		}
		Collections.sort(list);
		list.forEach(stu -> {System.out.println(stu);});
		sc.close();
	}
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7