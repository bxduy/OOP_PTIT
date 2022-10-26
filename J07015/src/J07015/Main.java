package J07015;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int[] prime = new int[10001];
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
		int cnt[] = new int[100000];
		Arrays.fill(cnt, 0);
		eratosthenes();
		for(Integer x : arr) {
			if(prime[x] == 1) {
				cnt[x]++;
			}
		}
		for(int i = 0; i < 10000; i++) {
			if(cnt[i] > 0) {
				System.out.println(i + " " + cnt[i]);
			}
		}
	}
	public static void eratosthenes() {
		Arrays.fill(prime, 1);
		prime[0] = prime[1] = 0;
		for(int i = 2; i < 100; i++) {
			if(prime[i] == 1) {
				for(int j = i*i; j < 10000; j+=i) {
					prime[j] = 0;
				}
			}
		}
	}
}
