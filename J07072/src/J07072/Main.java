package J07072;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		ArrayList<Name> list = new ArrayList<>();
		while(sc.hasNextLine()) {
			list.add(new Name(sc.nextLine()));
		}
		sc.close();
		Collections.sort(list);
		for(Name x : list) {
			System.out.println(x);
		}
	}
}
