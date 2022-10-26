package J04009;

public class Area {
	private double e1, e2, e3;

	public Area(double e1, double e2, double e3) {
		super();
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	
	public double area() {
		double tmp = e1*e2*e3/Math.sqrt((e1 + e2 + e3)*(e1+e2-e3)*(e1-e2+e3)*(-e1+e2+e3));
		return Math.PI*Math.pow(tmp, 2);
	}
	
}
