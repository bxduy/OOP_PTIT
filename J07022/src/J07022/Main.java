package J07022;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		ArrayList<String> list = new ArrayList<>();
		while(sc.hasNext()) {
			String s = sc.next();
			try {
				int n = Integer.parseInt(s);
			}catch(NumberFormatException e) {
				list.add(s);
			}
		}
		Collections.sort(list);
		for(String x : list) {
			System.out.print(x + " ");
		}
	}
}
