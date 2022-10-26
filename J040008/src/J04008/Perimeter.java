package J04008;

public class Perimeter {
	private double edge1, edge2, edge3;

	public Perimeter(double edge1, double edge2, double edge3) {
		super();
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}
	
	public double perimeter() {
		return edge1 + edge2 + edge3;
	}
	
}
