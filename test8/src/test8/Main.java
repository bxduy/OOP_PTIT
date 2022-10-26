package test8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int n1 = Integer.parseInt(sc.nextLine());
		HashMap<String, SV> map = new HashMap<>();
		while(n1-- > 0) {
			SV tmp = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			map.put(tmp.getiDS(), tmp);
		}
		sc = new Scanner(new File("DETAI.in"));
		int n2 = Integer.parseInt(sc.nextLine());
		HashMap<String, DeTai> mapdt = new HashMap<>();
		while(n2-- > 0) {
			DeTai tmp = new DeTai(sc.nextLine(), sc.nextLine());
			mapdt.put(tmp.getiD(), tmp);
		}
		sc = new Scanner(new File("NHIEMVU.in"));
		int n3 = Integer.parseInt(sc.nextLine());
		ArrayList<NhiemVu> list = new ArrayList<>();
		while(n3-- > 0) {
			list.add(new NhiemVu(sc.next(), sc.next()));
		}
		list.sort(new Comparator<NhiemVu>() {
			public int compare(NhiemVu fi, NhiemVu se) {
				DeTai a = mapdt.get(fi.getTiD());
				DeTai b = mapdt.get(se.getTiD());
				return a.compareTo(b);
			}

			
		});
		for(NhiemVu x : list) {
			System.out.println(map.get(x.getiDS()) + " " + mapdt.get(x.getTiD()));
		}
	}
}
