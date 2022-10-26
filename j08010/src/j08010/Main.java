package j08010;

import java.util.*;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		LinkedHashSet<String> set = new LinkedHashSet<>();
		int res = 0;
		while(sc.hasNext()) {
			String s = sc.next();
			if(check(s)) {
				set.add(s);
				res = Math.max(res, s.length());
				if(map.containsKey(s)) map.put(s, map.get(s)+1);
				else map.put(s, 1);
			}
		}
		ArrayList<String> list = new ArrayList<>();
		for(String x : set) {
			if(x.length() == res) list.add(x);
		}
		for(String x : list) {
			System.out.println(x + " " + map.get(x));
		}
		sc.close();
	}
	public static boolean check(String s) {
		String ans = "";
		for(int i = s.length() - 1; i >= 0; i--) ans += s.charAt(i);
		return s.equals(ans);
	}
}
