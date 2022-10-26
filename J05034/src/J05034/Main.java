package J05034;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, ArrayList<Intern>> map = new LinkedHashMap<>();
		while(t-- > 0) {
			Intern intern = new Intern(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			if(map.containsKey(intern.getCompany())) {
				ArrayList<Intern> list = map.get(intern.getCompany());
				list.add(intern);
				map.put(intern.getCompany(), list);
			}else {
				ArrayList<Intern> list = new ArrayList<>();
				list.add(intern);
				map.put(intern.getCompany(), list);
			}
		}
		int k = Integer.parseInt(sc.nextLine());
		while(k-- > 0) {
			String company = sc.nextLine();
			ArrayList<Intern> list = map.get(company);
			//ArrayList<Intern> listt = new ArrayList<>(list);
			Collections.sort(list);
			for(Intern x : list) {
				System.out.println(x);
			}
		}
		sc.close();
	}
}
//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//2
//FPT
//VNPT
