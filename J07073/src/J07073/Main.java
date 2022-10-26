package J07073;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(new File("MONHOC.in"));
		 ArrayList<Subject> list = new ArrayList<>();
		 int t = Integer.parseInt(sc.nextLine());
		 while(t-- > 0) {
			 Subject sub = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			 if(sub.getExam().equals("Truc tuyen") || sub.getExam().endsWith(".ptit.edu.vn")) {
				 list.add(sub);
			 }
		 }
		 sc.close();
		 Collections.sort(list);
		 for(Subject x : list) {
			 System.out.println(x);
		 }
	}
}
