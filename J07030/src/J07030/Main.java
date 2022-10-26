package J07030;

import java.util.*;
import java.io.*;

public class Main {
	public static int maxSize = 1000001;
	public static int[] prime = new int[maxSize];
	public static int[] a = new int[maxSize];
	public static void erathones() {
		Arrays.fill(prime, 1);
		prime[0] = prime[1] = 0;
		for(int i = 4; i < maxSize; i+=2) prime[i] = 0;
		for(int i = 3; i < Math.sqrt(maxSize); i += 2) {
			if(prime[i] == 1) {
				for(int j = i*i; j < maxSize; j+=i) {
					prime[j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
		ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
		ois.close();
		ObjectInputStream oiss = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
		ArrayList<Integer> list2 = (ArrayList<Integer>) oiss.readObject();
		oiss.close();
		erathones();
		Arrays.fill(a, 0);
		for(Integer x : list1) {
			if(prime[x] == 1 && a[x] == 0) {
				a[x] = 1;
			}
		}
		for(Integer x : list2) {
			if(prime[x] == 1 && a[x] == 1) {
				a[x] = 2;
			}
		}
		for(int i = 0; i < (maxSize-1)/2; i++) {
			if(a[i] == 1 && a[maxSize-1-i] == 1) {
				System.out.println(i + " " + (maxSize-1-i));
			}
		}
	}
}
