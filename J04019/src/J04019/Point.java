package J04019;

import java.util.Scanner;

public class Point {
	private float x, y;

	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public static Point nextPoint(Scanner sc) {
		return new Point(sc.nextFloat(), sc.nextFloat());
	}
	
	public float distance(Point point2) {
		float px = this.x - point2.x;
		float py = this.y - point2.y;
		return (float) Math.sqrt(px*px + py*py);
	}
	
}
