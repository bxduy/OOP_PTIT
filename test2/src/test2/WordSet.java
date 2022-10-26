package test2;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
	private TreeSet<String> set;
	String s;
	public WordSet(String s) throws FileNotFoundException {
		super();
		//Scanner sc = new Scanner(new File(s));
		set = new TreeSet<>();
		StringTokenizer sc = new StringTokenizer(s);
		while(sc.hasMoreTokens()) {
			set.add(sc.nextToken().toLowerCase());
		}
	}
	
	public String toString() {
		StringBuffer ans = new StringBuffer();
		for(String x : set) {
			ans.append(x + " ");
		}
		return ans.toString().trim();
	}
	
	
	
	public WordSet union(WordSet se) {
		WordSet ans = new WordSet();
		for(String x : this.set) {
			ans.set.add(x);
		}
		for(String x : se.set) {
			ans.set.add(x);
		}
		return ans;
	}
	
	public WordSet intersection(WordSet se) {
		WordSet ans = new WordSet();
		for(String x : this.set) {
			if(se.set.contains(x)) {
				ans.set.add(x);
			}
		}
		return ans;
	}

	public WordSet() {
		super();
		set = new TreeSet<>();
	}
	
}
