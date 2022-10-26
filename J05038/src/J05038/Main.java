package J05038;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Employee> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Employee(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
		}
		//long sum = 0;
		Collections.sort(list);
		for(Employee x : list) {
			System.out.println(x);
			//sum += x.getTotal();
		}
		//System.out.println("Tong chi phi tien luong: " + sum);
		sc.close();
	}
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV