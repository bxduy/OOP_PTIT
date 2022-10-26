package J07059;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("CATHI.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Time> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Time(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		sc.close();
		Collections.sort(list);
		for(Time x : list) {
			System.out.println(x);
		}
	}
}
