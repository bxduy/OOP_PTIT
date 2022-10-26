package J04014;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			long firNum, firDom, seNum, seDom;
			firNum = sc.nextLong();
			firDom = sc.nextLong();
			seNum = sc.nextLong();
			seDom = sc.nextLong();
			Fraction firF = new Fraction(firNum, firDom);
			Fraction seF = new Fraction(seNum, seDom);
			Fraction firAns = Fraction.Sum(firF, seF);
			firAns.Simplify();
			Fraction seAns = Fraction.Mul(firF, seF, firAns);
			seAns.Simplify();
			System.out.println(firAns + " " + seAns);
		}
		sc.close();
	}
}
