package J04001;

import java.util.*;

public class Point {
	
	private double x, y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	private double Distance(Point second) {
		return Math.sqrt(Math.pow(this.x - second.x, 2) + Math.pow(this.y - second.y, 2));
	}
	
	public static double distance(Point p1, Point p2){
		return p1.Distance(p2);
	}
}
