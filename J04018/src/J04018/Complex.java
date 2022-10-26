package J04018;

public class Complex {
	private int real, virtual;

	public Complex(int real, int virtual) {
		super();
		this.real = real;
		this.virtual = virtual;
	}
	
	public static Complex sum(Complex first, Complex second) {
		return first.sum(second);
	}
	
	private Complex sum(Complex x) {
		int real = this.real + x.real;
		int virtual = this.virtual + x.virtual;
		return new Complex(real, virtual);
	}
	
	public static Complex mul(Complex first, Complex second) {
		return first.mul(second);
	}
	
	private Complex mul(Complex x) {
		int real = this.real*x.real - this.virtual*x.virtual;
		int virtual = this.real*x.virtual + this.virtual*x.real;
		return new Complex(real, virtual);
	}
	
	public String toString() {
		return real + " " + ((virtual > 0) ? "+" : "-") + " " + Math.abs(virtual) + "i";
	}
	
}
