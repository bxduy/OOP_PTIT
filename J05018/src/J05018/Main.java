package J05018;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		StudentList list = new StudentList();
		while(t-- > 0) {
			String name = sc.nextLine();
			String s = sc.nextLine();
			s = s.replaceAll("\\s+", " ");
			String[] tmp = s.split(" ");
			ArrayList<Double> point = new ArrayList<>();
			for(int i = 0; i < 10; i++) {
				point.add(Double.parseDouble(tmp[i]));
			}
			list.add(new Student(name, point));
		}
		sc.close();
		list.sort();
		list.show();
	}
}
//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
