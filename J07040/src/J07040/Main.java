package J07040;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("NHIPHAN.in")));
		ArrayList<String> list = (ArrayList<String>)in.readObject();
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		for(String x : list) {
			Scanner sc = new Scanner(x);
			while(sc.hasNext()) {
				set1.add(sc.next().toLowerCase());
			}
			sc.close();
		}
		in.close();
		Scanner sc = new Scanner(new File("VANBAN.in"));
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		while(sc.hasNext()) {
			set2.add(sc.next().toLowerCase());
		}
		sc.close();
		for(String x : set2) {
			if(set1.contains(x)) {
				System.out.println(x);
			}
		}
	}
}
