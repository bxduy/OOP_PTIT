package J04009;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			double x1,x2,x3,y1,y2,y3;
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
			double e1, e2, e3;
			e1 = Point.distance(p1, p2);
			e2 = Point.distance(p1, p3);
			e3 = Point.distance(p3, p2);
			if(e1+e2>e3 && e1+e3>e2 && e2+e3>e1) {
				Area ar = new Area(e1, e2, e3);
				System.out.printf("%.3f\n", ar.area());
			}else {
				System.out.println("INVALID");
			}
		}
		sc.close();
	}
}
