package test9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		ArrayList<SV> list1 = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			list1.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		sc = new Scanner(new File("DETAI.in"));
		ArrayList<DT> list2 = new ArrayList<>();
		t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			list2.add(new DT(sc.nextLine(), sc.nextLine()));
		}
		sc = new Scanner(new File("HOIDONG.in"));
		t = Integer.parseInt(sc.nextLine());
		ArrayList<HD> list3 = new ArrayList<>();
		while(t-- > 0) {
			String sid = sc.next();
			String tid = sc.next();
			String hd = sc.next();
			for(SV x1 : list1) {
				if(x1.getSiD().equals(sid)) {
					for(DT x2 : list2) {
						if(x2.getTiD().equals(tid)) {
							list3.add(new HD(x1, x2, hd));
						}
					}
				}
			}
		}
		Collections.sort(list3);
		String check = "";
		for(HD x : list3) {
			if(!check.equals(x.res)) {
				check  = x.res;
				System.out.println("DANH SACH HOI DONG " + x.res.charAt(2) + ":");
			}
			
			
			System.out.println(x);
		}

	}
}
