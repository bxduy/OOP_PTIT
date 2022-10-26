package J07052;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(new File("THISINH.in"));
		 int t = Integer.parseInt(sc.nextLine());
		 ArrayList<Student> list = new ArrayList<>();
		 while(t-- > 0) {
			 list.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		 }
		 Collections.sort(list);
		 int k = Integer.parseInt(sc.nextLine());
		 double pass = list.get(k-1).getTotal();
		 System.out.printf("%.1f\n", pass);
		 for(Student x : list) {
			 if(x.getTotal() >= pass) {
				 System.out.println(x + " TRUNG TUYEN");
			 }else {
				 System.out.println(x + " TRUOT");
			 }
		 }
		 sc.close();
	}
}
