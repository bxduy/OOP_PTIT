package J04001;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			System.out.printf("%.4f", Point.distance(new Point(x1,  y1), new Point(x2, y2)));
			System.out.println();
		}
		sc.close();
	}
	
}
