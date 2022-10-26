package J07016;

import java.util.*;
import java.io.*;

public class Main {
	static int isPrime[] = new int[10001];
	
	public static void erathonese() {
		Arrays.fill(isPrime, 1);
		isPrime[0] = isPrime[1] = 0;
		for(int i = 4; i <= 10000; i+=2) isPrime[i] = 0;
		for(int i = 3; i <= Math.sqrt(10000); i+=2) {
			if(isPrime[i] == 1) {
				for(int j = i*i; j <= 10000; j+=i) {
					isPrime[j] = 0;
				}
			}
		}
	}
	
	public static boolean check(int num) {
		String s = "" + num;
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream sc1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
		ArrayList<Integer> list1 = (ArrayList<Integer>) sc1.readObject();
		sc1.close();
		ObjectInputStream sc2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
		ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();
		sc2.close();
		erathonese();
		int[] cnt1 = new int[10000];
		int[] cnt2 = new int[10000];
		Arrays.fill(cnt1, 0);
		Arrays.fill(cnt2, 0);
		TreeSet<Integer> set = new TreeSet<>();
		for(Integer x : list1) {
			if(isPrime[x] == 1 && check(x)) {
				set.add(x);
				cnt1[x]++;
			}
		}
		for(Integer x : list2) {
			if(set.contains(x)) {
				cnt2[x]++;
			}
		}
		for(Integer x : set) {
			System.out.println(x + " " + cnt1[x] + " " + cnt2[x]);
		}
	}
}
