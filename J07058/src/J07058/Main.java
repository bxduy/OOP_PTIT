package J07058;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		SubjectList list = new SubjectList();
		int t = Integer.parseInt(sc.nextLine());
		String ID, name, examForm; 
		while(t-- > 0) {
			ID = sc.nextLine();
			name = sc.nextLine();
			examForm = sc.nextLine();
			Subject sub = new Subject(ID, name, examForm);
			list.add(sub);
		}
		sc.close();
		list.sort();
		list.show();
	}
}
