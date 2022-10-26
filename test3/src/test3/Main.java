package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.nextLine());
		ArrayList<Team> list = new ArrayList<>();
		while(n1-- > 0) {
			list.add(new Team(sc.nextLine(), sc.nextLine()));
		}
		int n2 = Integer.parseInt(sc.nextLine());
		ArrayList<Member> list2 = new ArrayList<>();
		while(n2-- > 0) {
			Member mem = new Member( sc.nextLine(), sc.nextLine());
			
			list2.add(mem);
			
		}
		Collections.sort(list2);
		for(Member x : list2) {
			//ArrayList<Member> res = map.get(x.getiDT());
			System.out.print(x);
			for(Team res : list) {
				String s1 = x.getiDT();
				String s2 = res.getiDT();
				if(s1.equals(s2)) {
					System.out.println(" " +res);
				}
			}
		}
	}
}
