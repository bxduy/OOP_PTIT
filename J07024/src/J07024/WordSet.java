package J07024;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
	private TreeSet<String> set;
	String s;
	
	public WordSet() {
		super();
		set = new TreeSet<>();
	}

	public WordSet(String s) throws IOException {
		super();
		Scanner sc = new Scanner(new File(s));
		set = new TreeSet<>();
		while(sc.hasNext()) {
			set.add(sc.next().toLowerCase());
		}
	}
	
	public WordSet(TreeSet<String> set) {
		super();
		this.set = set;
	}
	
	/**
	 * @return the set
	 */
	public TreeSet<String> getSet() {
		return set;
	}


	private static WordSet difference(WordSet fi, WordSet se) {
		TreeSet<String> tmp = new TreeSet<>();
		for(String x : fi.getSet()) {
			if(!se.getSet().contains(x)) {
				tmp.add(x);
			}
		}
		return new WordSet(tmp);
	}
	
	public WordSet difference(WordSet se) {
		return difference(this, se);
	}

	public String toString() {
		String ans = "";
		for(String x : set) {
			ans += x + " ";
		}
		return ans.trim();
	}
	
}
