package test5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DAYSO.in"));
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++) a[i] = sc.nextInt();
			Arrays.sort(a);
			long res1 = 0, res2 = 0;
			for(int i = 0; i < n; i+=2) {
				res1 = res1*10+a[i];
			}
			for(int i = 1; i < n; i+=2) {
				res2 = res2*10+a[i];
			}
			System.out.println(res1+res2);
		}
	}
}
