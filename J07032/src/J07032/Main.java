package J07032;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream sc1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
		ArrayList<Integer> list1 = (ArrayList<Integer>) sc1.readObject();
		sc1.close();
		ObjectInputStream sc2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
		ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();
		sc2.close();
		HashMap<Integer, Integer> map = new HashMap<>();
		TreeSet<Integer> set = new TreeSet<>();
		for(Integer x : list1) {
			if(check(String.valueOf(x))) {
				if(map.containsKey(x)) {
					map.put(x, map.get(x) + 1);
				}else {
					map.put(x, 1);
				}
			}
		}
		for(Integer x : list2) {
			if(map.get(x) > 0) {
				set.add(x);
				map.put(x, map.get(x) + 1);
			}
		}
		for(Integer x : set) {
			System.out.println(x + " " + map.get(x));
		}
	}
	public static boolean check(String s) {
		if(s.length() % 2 == 0 || s.length() == 1) return false;
		int n = s.length();
		for(int i = 0; i <= n/2; i++) {
			if(s.charAt(i) != s.charAt(n-i-1)) return false;
			if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
