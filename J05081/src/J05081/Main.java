package J05081;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ItemList list = new ItemList();
		String name, unit;
		int purchasePrice, price;
		while(t-- > 0) {
			name = sc.nextLine();
			unit = sc.nextLine();
			purchasePrice = Integer.parseInt(sc.nextLine());
			price = Integer.parseInt(sc.nextLine());
			Item item = new Item(name, unit, purchasePrice, price);
			list.add(item);
		}
		sc.close();
		list.sort();
		list.show();
	}
}
