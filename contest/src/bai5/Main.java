package bai5;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream sc1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
		ArrayList<String> list1 = (ArrayList<String>) sc1.readObject();
		sc1.close();
		ObjectInputStream sc2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
		ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();
		sc2.close();
		TreeSet<String> set1 = new TreeSet<>();
		TreeSet<String> set2 = new TreeSet<>();
		TreeSet<String> set = new TreeSet<>();
		set1.addAll(list1);
		for(Integer x : list2) {
			set2.add(String.valueOf(x));
		}
		for(String x : set1) {
			for(String x2 : set2) {
				set.add(x + x2);
			}
		}
		for(String x : set)
			System.out.println(x);
	}
}
