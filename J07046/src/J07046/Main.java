package J07046;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc = new Scanner(new File("D:\\JavaPtit\\J07046\\src\\J07046\\KHACHHANG.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Stay> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Stay(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		sc.close();
		Collections.sort(list);
		for(Stay x : list) {
			System.out.println(x);
		}
	}
}
