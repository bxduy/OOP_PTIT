package contestbai1;

import java.util.*;
import java.io.*;

public class Main {
	public static boolean check(int n) {
		if(n < 10) return false;
		String s = String.valueOf(n);
		for(int i = 0;  i < s.length()-1; i++) {
			if(s.charAt(i) > s.charAt(i+1))return false;
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
		int cnt1[] = new int[10001];
		int cnt2[]= new int[10001];
		int arr[] = new int [10001];
		Arrays.fill(cnt1, 0);
		Arrays.fill(cnt2, 0);
		Arrays.fill(arr, 0);
		for(Integer x : list1) {
			if(check(x)) {
				cnt1[x]++;
				arr[x] = 1;
			}
		}
		for(Integer x : list2) {
			if(arr[x] == 1) {
				cnt2[x]++;
			}
		}
		for(int i = 11; i < 10000; i++) {
			if(arr[i] == 1) {
				System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
			}
		}
	}
}
