package J03026;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			String a = sc.next();
			String b = sc.next();
			if(a.equals(b)) {
				System.out.println(-1);
			}else {
				System.out.println(Math.max(a.length(), b.length()));
			}
		}
		sc.close();
	}
}
