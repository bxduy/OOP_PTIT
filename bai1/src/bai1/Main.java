package bai1;

import java.util.*;

public class Main {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] fibo = new long[100];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2; i <= 92; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		int t = sc.nextInt();
		while(t-- > 0) {
			long n = sc.nextLong();
			boolean check = true;
			for(int i = 0; i <= 92; i++) {
				if(fibo[i] == n) {
					System.out.println("YES");
					check = false;
					break;
				}
			}
			if(check) {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
