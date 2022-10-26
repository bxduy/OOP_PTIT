package bai6;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("LUYENTAP.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Submit> list = new ArrayList<>();
		while(t-- > 0) {
			String name = sc.nextLine();
			String s = sc.nextLine();
			String[] tmp = s.split(" ");
			list.add(new Submit(name, Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1])));
		}
		Collections.sort(list);
		for(Submit x : list) {
			System.out.println(x);
		}
	}
	
}
