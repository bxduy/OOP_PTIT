package bai4;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("MATRIX.in"));
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String s = sc.nextLine();
			String[] tmp1 = s.split(" ");
			int n = Integer.parseInt(tmp1[0]), m = Integer.parseInt(tmp1[1]), res = Integer.parseInt(tmp1[2]);
			int[][] a = new int[n][m];
			s = sc.nextLine();
			tmp1 = s.split(" ");
			int x = 0;
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					a[i][j] = Integer.parseInt(tmp1[x]);
					x++;
					if(j == res-1) ans.add(a[i][j]);
				}
			}
			Collections.sort(ans);
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(j != res-1)
						System.out.print(a[i][j] + " ");
					else {
						System.out.print(ans.get(i) + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
