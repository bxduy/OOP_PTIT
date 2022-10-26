package J05033;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		TimeList list = new TimeList();
		while(t-- > 0) {
			list.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();
		list.sort();
		list.show();
	}
}
