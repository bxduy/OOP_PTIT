package J07004;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DATA.in"));
		HashMap<Integer, Integer> map = new HashMap<>();
		while(sc.hasNextInt()) {
			int tmp = sc.nextInt();
			if(map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp) + 1);
			}else {
				map.put(tmp, 1);
			}
		}
		Set<Integer> set = map.keySet();
		for(Integer it : set) {
			System.out.println(it + " " + map.get(it));
		}
		sc.close();
	}
}
