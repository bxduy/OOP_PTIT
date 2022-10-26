package J04002;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		String color = sc.next();
		if(height > 0 && width > 0) {
			Rectange rectan = new Rectange(width, height, color);
			System.out.printf("%.0f %.0f %s\n", rectan.findPerimeter(), rectan.findArea(), rectan.getColor());
		}else {
			System.out.println("INVALID");
		}
	}
}
