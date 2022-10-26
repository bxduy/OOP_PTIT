package J07085;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream sc = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
		ArrayList<String> list = (ArrayList<String>) sc.readObject();
		sc.close();
//		Scanner sc = new Scanner(new File("DATA.in"));
//		ArrayList<String> list = new ArrayList<>();
//		while(sc.hasNext()) {
//			list.add(sc.next());
//		}
		for(String x : list) {
			String ans = "";
			for(int i = 0; i < x.length(); i++) {
				if(x.charAt(i) >= '0' && x.charAt(i) <= '9') {
					if(ans.isEmpty() && x.charAt(i) == '0') {
						continue;
					}
					
					ans += x.charAt(i);
				}
			}
			System.out.println(ans + " " + add(ans));
		}
	}
	
	public static int add(String s) {
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt("" + s.charAt(i));
		}
		return sum;
	}
	
}
