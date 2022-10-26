package J07002;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		int ans = 0;
		while(sc.hasNext()) {
			try {
				int tmp = Integer.parseInt(sc.next());
				ans += tmp;
			}catch (NumberFormatException e) {
				// TODO: handle exception
				continue;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
