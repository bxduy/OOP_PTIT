package J07007;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
	String s;
	private TreeSet<String> set;
	public WordSet(String s) throws IOException {
		super();
		this.s = s;
		set = new TreeSet<>();
		Scanner sc = new Scanner(new File("VANBAN.in"));
		while(sc.hasNext()) {
			String tmp = sc.next();
			set.add(tmp.toLowerCase());	
		}
		sc.close();
	}
	public String toString() {
		String ans = "";
		for(String x : set) {
			ans += x + "\n";
		}
		return ans;
	}
	
}
