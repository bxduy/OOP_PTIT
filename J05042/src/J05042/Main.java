package J05042;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = Integer.parseInt(sc.nextLine());
		 ArrayList<Student> list = new ArrayList<>();
		 while(t-- > 0) {
			 String name, s;
			 name = sc.nextLine();
			 s = sc.nextLine();
			 String tmp[] = s.split(" ");
			 list.add(new Student(name, Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1])));
		 }
		 sc.close();
		 Collections.sort(list);
		 for(Student x : list) {
			 System.out.println(x);
		 }
	}
}
//4
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 600
//Bui Xuan Duy
//168 500
//Do Minh Ngoc 
//170 800