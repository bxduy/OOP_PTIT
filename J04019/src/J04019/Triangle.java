package J04019;

public class Triangle {
	private Point p1, p2, p3;
	private float e1, e2, e3;
	
	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.cal();
	}
	
	private void cal() {
		e1 = this.p1.distance(p2);
		e2 = this.p2.distance(p3);
		e3 = this.p3.distance(p1);
	}
	
	public boolean valid() {
		if(e1+e2>e3 && e2+e3>e1 && e1+e3>e2) {
			return true;
		}
		return false;
	}
	
	public String getPerimeter() {
		return String.format("%.3f", e1+e2+e3);
	}
	
}
