package J07003;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		 Scanner sc = new Scanner(new File("DATA.in"));
		 BigInteger num = new BigInteger(sc.next());
		 while(num.compareTo(new BigInteger("10")) >= 0) {
			 String s = "" + num;
			 int n = s.length();
			 
			 BigInteger tmp1 = new BigInteger(s.substring(0, n/2));
			 BigInteger tmp2 = new BigInteger(s.substring(n/2));
			 num = tmp1.add(tmp2);
			 System.out.println(num);
		 }
		 //System.out.println(num);
	}
}
