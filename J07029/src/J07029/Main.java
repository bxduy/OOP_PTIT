package J07029;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int[] prime = new int[1000001];
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
		int[] cnt = new int[1000001];
		Arrays.fill(cnt, 0);
		eratosthenes();
		for(Integer x : list) {
			if(prime[x] == 1) {
				cnt[x]++;
			}
		}
		int check = 0;
		for(int i = 1000000; i >= 0; i--) {
			if(cnt[i] > 0) {
				check++;
				System.out.println(i + " " + cnt[i]);
			}
			if(check == 10) {
				break;
			}
		}
	}
	public static void eratosthenes() {
		Arrays.fill(prime, 1);
		prime[0] = prime[1] = 0;
		for(int i = 2; i <= 1000; i++) {
			if(prime[i] == 1) {
				for(int j = i*i; j <= 1000000; j+=i) {
					prime[j] = 0;
				}
			}
		}
	}
}
