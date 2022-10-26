package J05046;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = Integer.parseInt(sc.nextLine());
		 ArrayList<Product> list = new ArrayList<>();
		 while(t-- > 0) {
			 list.add(new Product(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
		 }
		 Collections.sort(list);
		 for(Product x : list) {
			 System.out.println(x);
		 }
		 sc.close();
	}
}
//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000
