package J04018;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			Complex first = new Complex(sc.nextInt(), sc.nextInt());
			Complex second = new Complex(sc.nextInt(), sc.nextInt());
			Complex sum = Complex.sum(first, second);
			System.out.println(Complex.mul(first, sum) + ", " + Complex.mul(sum, sum));
		}
		sc.close();
	}
}
