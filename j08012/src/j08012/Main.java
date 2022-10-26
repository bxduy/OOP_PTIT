package j08012;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k = t;
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		while(t-- > 1) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(map.containsKey(n)) {
				HashSet<Integer> set = map.get(n);
				set.add(m);
			}else {
				HashSet<Integer> set = new HashSet<>();
				set.add(m);
				map.put(n, set);
			}
			if(map.containsKey(m)) {
				HashSet<Integer> set = map.get(m);
				set.add(n);
			}else {
				HashSet<Integer> set = new HashSet<>();
				set.add(n);
				map.put(m, set);
			}
		}
		sc.close();
		boolean check = true;
		for(Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()) {
			if(entry.getValue().size() == k-1) {
				check = false;
				break;
			}
		}
		if(check)System.out.println("No");
		else {
			System.out.println("Yes");
		}
	}
}
