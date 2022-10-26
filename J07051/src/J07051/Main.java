package J07051;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, ParseException, IOException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Room> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Room(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
		}
		sc.close();
		Collections.sort(list);
		for(Room x : list) {
			System.out.println(x);
		}
	}
}
