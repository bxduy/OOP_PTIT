package J07025;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		ArrayList<Customer> list = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			list.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(list);
		list.forEach(cus ->{System.out.println(cus);});
	}
}
