package J07056;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		ArrayList<Bill> list = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String name = sc.nextLine();
			String s = sc.nextLine();
			String tmp[] = s.split(" ");
			list.add(new Bill(name, tmp[0], Long.parseLong(tmp[1]), Long.parseLong(tmp[2])));
		}
		Collections.sort(list);
		sc.close();
		for(Bill x : list) {
			System.out.println(x);
		}
	}
}
