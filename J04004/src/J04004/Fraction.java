package J04004;

public class Fraction {
	private long numerator, denominator;

	/**
	 * @return the numerator
	 */
	public long getNumerator() {
		return numerator;
	}

	/**
	 * @return the denominator
	 */
	public long getDenominator() {
		return denominator;
	}

	public Fraction(long numerator, long denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	private long Gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return Gcd(b, a%b);
	}
	
	private Fraction Sum(Fraction second) {
		long dem = this.getDenominator() * second.getDenominator();
		long num = this.getNumerator() * (dem/this.getDenominator()) + second.getNumerator() * (dem/second.getDenominator());
		long gcd = Gcd(num, dem);
		Fraction ans = new Fraction(num/gcd, dem/gcd);
		return ans;
	}
	
	public static Fraction Sum(Fraction fr1, Fraction fr2) {
		return fr1.Sum(fr2);
	}
}
