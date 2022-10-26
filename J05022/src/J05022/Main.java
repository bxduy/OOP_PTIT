package J05022;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, ArrayList<Student>> map = new LinkedHashMap<>();
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String iD, name, cl, email;
			iD = sc.nextLine();
			name = sc.nextLine();
			cl = sc.nextLine();
			email = sc.nextLine();
			Student stu = new Student(iD, name, cl, email);
			if(map.containsKey(cl)) {
				ArrayList<Student> tmp = map.get(cl);
				tmp.add(stu);
				map.put(cl, tmp);
			}else {
				ArrayList<Student> list = new ArrayList<>();
				list.add(stu);
				map.put(cl, list);
			}
		}
		int k = Integer.parseInt(sc.nextLine());
		while(k-- > 0) {
			String s = sc.nextLine();
			ArrayList<Student> list = map.get(s);
			System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
			for(Student x : list) {
				System.out.println(x);
			}
		}
		sc.close();
	}
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//2
//D15CQKT02-B
//D15CNPM3

