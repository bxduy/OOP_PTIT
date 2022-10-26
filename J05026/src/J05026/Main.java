package J05026;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, ArrayList<Lecturers>> map = new LinkedHashMap<>();
		while(t-- > 0) {
			Lecturers lec = new Lecturers(sc.nextLine(), sc.nextLine());
			String sub = lec.getSubject();
			if(map.containsKey(sub)) {
				ArrayList<Lecturers> list = map.get(sub);
				list.add(lec);
				map.put(sub, list);
			}else {
				ArrayList<Lecturers> list = new ArrayList<>();
				list.add(lec);
				map.put(sub, list);
			}
		}
		int k = Integer.parseInt(sc.nextLine());
		while(k-- > 0) {
			String s = sc.nextLine();
			s = s.toUpperCase();
			String tmp[] = s.split(" ");
			String sub = "";
			for(int i = 0; i < tmp.length; i++) {
				sub += String.valueOf(tmp[i].charAt(0));
			}
			System.out.println("DANH SACH GIANG VIEN BO MON " + sub + ":");
			ArrayList<Lecturers> list = map.get(sub);
			for(Lecturers x : list) {
				System.out.println(x);
			}
		}
		sc.close();
	}
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//2
//Cong nghe phan mem
//An toan thong tin
