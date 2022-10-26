package test1test1;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DATA.in"));
		long ans = 0;
		while(sc.hasNext()) {
			String in = sc.next();
			try {
				int s = Integer.parseInt(in);
			}catch (NumberFormatException e) {
				// TODO: handle exception
				try {
					long tmp = Long.parseLong(in);
					ans += tmp;
				}catch (NumberFormatException x) {
					// TODO: handle exception
					continue;
				}
			}
		}
		System.out.println(ans);
	}
}
