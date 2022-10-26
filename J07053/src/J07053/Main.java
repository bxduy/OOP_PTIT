package J07053;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, ParseException, IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Point> list = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			list.add(new Point(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
		}
		sc.close();
		Collections.sort(list);
		for(Point x : list) {
			System.out.println(x);
		}
	}
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9
