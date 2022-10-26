package test7;

public class Polygon {
	private Point p[];

	public Polygon(Point[] p) {
		super();
		this.p = p;
	}
	
	
	public String getArea() {
		int n = p.length;
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < p.length; i++) {
			if(i < p.length-1) {
				sum1 += p[i].getX()*p[i+1].getY();
				sum2 += p[i].getY()*p[i+1].getX();
			}else {
				sum1+= p[i].getX()*p[0].getY();
				sum2 += p[i].getY()*p[0].getX();
			}
		}
		return String.format("%.3f", (Math.abs((sum1-sum2)*1.0/2)));
	}
	
}
