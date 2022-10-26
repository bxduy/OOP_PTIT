package J05011;

import java.text.ParseException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Time> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Time(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		sc.close();
		Collections.sort(list);
		for(Time x : list) {
			System.out.println(x);
		}
	}
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00