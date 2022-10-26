package J07034;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		SubjectList list = new SubjectList();
		int t = Integer.parseInt(sc.nextLine());
		String name, iD, numberCredit;
		while(t-- > 0) {
			iD = sc.nextLine();
			name = sc.nextLine();
			numberCredit = sc.nextLine();
			Subject sub = new Subject(name, iD, numberCredit);
			list.add(sub);
		}
		sc.close();
		list.sort();
		list.show();
	}
}
