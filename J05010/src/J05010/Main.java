package J05010;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ProductList list = new ProductList();
		while(t-- > 0) {
			list.add(new Product(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		sc.close();
		list.sort();
		list.show();
	}
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//ien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37
