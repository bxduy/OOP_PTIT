package j08026;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			System.out.println(change_s_to_t(s, t));
		}
	}
	public static int change_s_to_t(int s, int t) {
		if(s >= t) return s-t;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(s);
		int[] a = new int[20001];
		while(a[t] == 0) {
			int res = q.poll();
			if(res - 1 > 0 && a[res-1] == 0) {
				a[res-1] = a[res]+1;
				q.offer(res-1);
			}
			if(res*2 < 20000 && a[res*2] == 0) {
				a[res*2] = a[res]+1;
				q.offer(res*2);
			}
		}
		return a[t];
	}
}
