package J07054;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		ArrayList<Point> list = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			list.add(new Point(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		sc.close();
		int cnt = 0, step = 1;
		double tmp = 11;
		Collections.sort(list);
		for(Point x : list) {
			if(x.getTotal() < tmp) {
				cnt += step;
				step = 1;
				tmp = x.getTotal();
			}else {
				step++;
			}
			System.out.println(x + " " + cnt);
			
		}
	}
}
