package bai3;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SONGUYEN.IN"));
		int n = Integer.parseInt(sc.next());
		while(sc.hasNext()) {
			String num = sc.next();	
			BigInteger tmp = new BigInteger(num);
			BigInteger n7 = new BigInteger("7");
			BigInteger n13 = new BigInteger("13");
			int ok1 = 0, ok2 = 0;
			if(tmp.mod(n7).equals(new BigInteger("0"))) ok1 = 1;
			if(tmp.mod(n13).equals(new BigInteger("0"))) ok2 = 1;
			if(ok1 == 1 && ok2 == 1) {
				System.out.println("Both");
			}else if(ok1 == 1 && ok2 == 0) {
				System.out.println("Div 7");
			}else if(ok2 == 1 && ok1 == 0) {
				System.out.println("Div 13");
			}else {
				System.out.println("None");
			}
		}
	}
}
