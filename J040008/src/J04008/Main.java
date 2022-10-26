package J04008;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			double x1, y1, x2, y2, x3, y3;
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			Point p1, p2, p3;
			p1 = new Point(x1, y1);
			p2 = new Point(x2, y2);
			p3 = new Point(x3, y3);
			double edge1, edge2, edge3;
			edge1 = Point.distance(p1, p2);
			edge2 = Point.distance(p2, p3);
			edge3 = Point.distance(p1, p3);
			if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge3 + edge2 > edge1) {
				Perimeter per = new Perimeter(edge1, edge2, edge3);
				System.out.printf("%.3f", per.perimeter());
				System.out.println();
			}else {
				System.out.println("INVALID");
			}
			
		}
		sc.close();
	}
}
