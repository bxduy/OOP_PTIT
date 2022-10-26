package j08011;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		 ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		 LinkedHashSet<Integer> set = new LinkedHashSet<>();
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			if(check(n)) {
				set.add(n);
				if(map.containsKey(n)) {
					map.put(n, map.get(n)+1);
				}else {
					map.put(n, 1);
				}
			}
		 }
		 for(Integer x : set) {
			 ArrayList<Integer> tmp = new ArrayList<>();
			 tmp.add(x);
			 tmp.add(map.get(x));
			 list.add(tmp);
		 }
		 list.sort(new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				// TODO Auto-generated method stub
				return -(o1.get(1) - o2.get(1));
			}
			 
		});
		 for(ArrayList<Integer> x : list) {
			 for(int it : x) {
				 System.out.print(it + " ");
			 }
			 System.out.println();
		 }
	}
	public static boolean check(int n) {
		String s = String.valueOf(n);
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) > s.charAt(i+1)) return false;
		}
		return true;
	}
}
