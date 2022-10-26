package J07057;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc  = new Scanner(new File("THISINH.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Student> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
		}
		sc.close();
		Collections.sort(list);
		for(Student x : list) {
			System.out.println(x);
		}
	}
}
