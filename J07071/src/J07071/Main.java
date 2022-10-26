package J07071;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(new File("DANHSACH.in"));
		 int t = Integer.parseInt(sc.nextLine());
		 ArrayList<Name> list = new ArrayList<>();
		 while(t-- > 0) {
			 list.add(new Name(sc.nextLine().trim()));
		 }
		 Collections.sort(list);
		 int q = Integer.parseInt(sc.nextLine());
		 while(q-- > 0) {
			 String ques = sc.nextLine().trim();
			 for(Name x : list) {
				 if(x.check(ques)) {
					 System.out.println(x);
				 }
			 }
		 }
	}
}
