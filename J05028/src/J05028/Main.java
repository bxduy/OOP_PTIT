package J05028;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Intern> temporaryList = new ArrayList<>();
		while(t-- > 0) {
			temporaryList.add(new Intern(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
		}
		int k = Integer.parseInt(sc.nextLine());
		while(k-- > 0) {
			ArrayList<Intern> officialList = new ArrayList<>();
			int begin = sc.nextInt();
			int end = sc.nextInt();
			for(Intern x : temporaryList) {
				if(x.getAmount() >= begin && x.getAmount() <= end) {
					officialList.add(x);
				}
			}
			Collections.sort(officialList);
			System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + begin + " DEN " + end + " SINH VIEN:");
			for(Intern x : officialList) {
				System.out.println(x);
			}
		}
		sc.close();
	}
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
