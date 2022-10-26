package J07084;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc =  new Scanner(new File("ONLINE.in"));
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
