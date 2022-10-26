package J04014;

public class Fraction {
	private long numerator, denominator;

	public Fraction(long numerator, long denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	private static long Gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return Gcd(b, a%b);
	}
	
	public void Simplify() {
		long tmp = Gcd(numerator, denominator);
		this.numerator /= tmp;
		this.denominator /= tmp;
	}
	
	public static Fraction Sum(Fraction first, Fraction second) {
		long num = first.numerator * second.denominator + first.denominator * second.numerator;
		long dom = first.denominator * second.denominator;
		Fraction ans = new Fraction(num*num, dom*dom);
		return ans;
	}
	
	public static Fraction Mul(Fraction first, Fraction second, Fraction third) {
		long num = first.numerator * second.numerator * third.numerator;
		long dom = first.denominator * second.denominator * third.denominator;
		Fraction ans = new Fraction(num, dom);
		return ans;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
}
