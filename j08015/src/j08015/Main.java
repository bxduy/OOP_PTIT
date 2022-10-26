package j08015;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			long[] a = new long[n];
			for(int i = 0; i < n; i++) a[i] = sc.nextLong();
			System.out.println(count(a, k));
		}
	}

	private static long count(long[] a, long k) {
		// TODO Auto-generated method stub
		long cnt = 0;
		HashMap<Long, Long> map = new HashMap<>();
		for(int i = 0; i < a.length; i++) {
			if(!map.containsKey(a[i])) map.put(a[i], (long)1);
			else map.put(a[i], map.get(a[i])+1);
		}
		for(int i = 0; i < a.length; i++) {
			if(map.get(k-a[i]) != null) cnt += map.get(k-a[i]);
			if(a[i] == k-a[i]) cnt--;
		}
		return cnt/2;
	}
}
