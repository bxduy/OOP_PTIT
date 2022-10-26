package J05023;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, ArrayList<Student>> map = new LinkedHashMap<>();
		while(t-- > 0) {
			Student stu = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			String tmp = stu.getClas().substring(1, 3);
			if(map.containsKey(tmp)) {
				ArrayList<Student> list = map.get(tmp);
				list.add(stu);
				map.put(tmp, list);
			}else {
				ArrayList<Student> listStu = new ArrayList<>();
				listStu.add(stu);
				map.put(tmp, listStu);
			}
		}
		int k = Integer.parseInt(sc.nextLine());
		while(k-- > 0) {
			String s = sc.nextLine();
			String tmp = s.substring(2);
			System.out.println("DANH SACH SINH VIEN KHOA " + s +":");
			ArrayList<Student> list = map.get(tmp);
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
//2015
