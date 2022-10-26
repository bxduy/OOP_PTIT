package J04003;

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
	
	private void Compact() {
		long gcd = this.Gcd(this.getNumerator(), this.getDenominator());
		this.numerator /= gcd;
		this.denominator /= gcd;
	}
	
	public void CompactFraction() {
		this.Compact();
	}
	
}
