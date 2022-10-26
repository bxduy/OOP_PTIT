package J04009;

public class Point {
	private double x, y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	private double Distance(Point second) {
		return Math.sqrt(Math.pow(this.getX() - second.getX(), 2) + Math.pow(this.getY() - second.getY(), 2));
	}
	
	public static double distance(Point p1, Point p2) {
		return p1.Distance(p2);
	}
	
}
