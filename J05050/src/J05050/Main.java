package J05050;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = Integer.parseInt(sc.nextLine());
		 ArrayList<Bill> list = new ArrayList<>();
		 while(t-- > 0) {
			 list.add(new Bill(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
		 }
		 Collections.sort(list);
		 sc.close();list.forEach(bill -> {System.out.println(bill);});
	}
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700
