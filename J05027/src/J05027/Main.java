package J05027;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Lecturers> list = new ArrayList<>();
		while(t-- > 0) {
			Lecturers lec = new Lecturers(sc.nextLine(), sc.nextLine());
			list.add(lec);
		}
		int k = Integer.parseInt(sc.nextLine());
		while(k-- > 0) {
			String word = sc.nextLine();
			System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + word + ":");
			word = word.toLowerCase();
			for(Lecturers lec : list) {
				String name = lec.getName();
				name = name.toLowerCase();
				if(name.contains(word)) {
					System.out.println(lec);
				}
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
//1
//aN
