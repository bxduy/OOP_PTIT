package J05032;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<People> list = new ArrayList<>();
		while(t-- > 0) {
			String s = sc.nextLine();
			String tmp[] = s.split(" ");
			list.add(new People(tmp[0], tmp[1]));
		}
		sc.close();
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(0));
	}
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990