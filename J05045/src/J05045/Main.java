package J05045;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = Integer.parseInt(sc.nextLine());
		 LinkedHashMap<String, ArrayList<Employee>> map = new LinkedHashMap<>();
		 //ArrayList<Employee> list = new ArrayList<>();
		 while(t-- > 0) {
			 Employee em = new Employee(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
			 if(map.containsKey(em.getPo())) {
				 ArrayList<Employee> list = map.get(em.getPo());
				 list.add(em);
				 map.put(em.getPo(), list);
			 }else {
				 ArrayList<Employee> list = new ArrayList<>();
				 list.add(em);
				 map.put(em.getPo(), list);
			 }
		 }
		 String position = sc.nextLine();
		 sc.close();
		 //Collections.sort(list);
		 ArrayList<Employee> list = map.get(position);
		 list.forEach(e -> {System.out.println(e);});
	}
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28
