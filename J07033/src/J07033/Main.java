package J07033;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(new File("SINHVIEN.in"));
		 ArrayList<Student> list = new ArrayList<>();
		 int t = Integer.parseInt(sc.nextLine());
		 while(t-- > 0) {
			 list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		 }
		 sc.close();
		 Collections.sort(list);
		 list.forEach(stu -> {System.out.println(stu);});
	}
}
