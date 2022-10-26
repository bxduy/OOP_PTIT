package J07055;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(new File("BANGDIEM.in"));
		 ArrayList<Student> list = new ArrayList<>();
		 int t = Integer.parseInt(sc.nextLine());
		 while(t-- > 0) {
			 list.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		 }
		 sc.close();
		 Collections.sort(list);
		 for(Student x : list) {
			 System.out.println(x);
		 }
	}
}
