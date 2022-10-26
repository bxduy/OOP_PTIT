package J04004;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong();
		long dem1 = sc.nextLong();
		long num2 = sc.nextLong();
		long dem2 = sc.nextLong();
		Fraction ans = Fraction.Sum(new Fraction(num1, dem1), new Fraction(num2, dem2));
		System.out.println(ans.getNumerator() + "/" + ans.getDenominator());
		sc.close();
	}
}
