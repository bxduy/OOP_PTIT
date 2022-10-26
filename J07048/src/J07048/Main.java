package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SANPHAM.in"));
		int t = Integer.parseInt(sc.nextLine());
		ItemList list = new ItemList();
		while(t-- > 0) {
			list.add(new Item(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
		}
		sc.close();
		list.sort();
		list.show();
	}
}
