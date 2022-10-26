package J07050;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATHANG.in"));
		int t = Integer.parseInt(sc.nextLine());
		ItemList list = new ItemList();
		while(t-- > 0) {
			list.add(new Item(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		sc.close();
		list.sort();
		list.show();
	}
}
