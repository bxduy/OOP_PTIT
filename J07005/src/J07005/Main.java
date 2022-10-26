package J07005;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		DataInputStream sc = new DataInputStream(new FileInputStream("DATA.in"));
		int[] a = new int[1000];
		for(int i = 0; i < 100000; i++) {
			a[sc.readInt()]++;
		}
		for(int i = 0; i < 1000; i++) {
			if(a[i] > 0) {
				System.out.println(i + " " + a[i]);
			}
		}
		sc.close();
	}
}
