package J05009;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentList list = new StudentList();
		int t = Integer.parseInt(sc.nextLine());
		double m = 0;
		String name, birthday;
		double p1, p2, p3;
		while(t-- > 0) {
			name = sc.nextLine();
			birthday = sc.nextLine();
			p1 = Double.parseDouble(sc.nextLine());
			p2 = Double.parseDouble(sc.nextLine());
			p3 = Double.parseDouble(sc.nextLine());
			m = Math.max(m, p1+p2+p3);
			list.add(new Student(name, birthday, p1, p2, p3));
		}
		sc.close();
		list.sort();
		list.show(m);
	}
}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5
