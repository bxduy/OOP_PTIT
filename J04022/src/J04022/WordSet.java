package J04022;


import java.util.TreeSet;



public class WordSet {
	private TreeSet<String> set;
	String s;
	
	public WordSet(TreeSet<String> set) {
		super();
		this.set = set;
	}
	public WordSet(String s) {
		super();
		set = new TreeSet<>();
		String tmp[] = s.trim().toLowerCase().split("\\s+");
		for(int i = 0; i < tmp.length; i++) set.add(tmp[i]);
	}
	
	/**
	 * @return the set
	 */
	public TreeSet<String> getSet() {
		return set;
	}

	
	private static WordSet union(WordSet fi, WordSet se) {
		TreeSet<String> tmp = new TreeSet<>();
		for(String x : fi.getSet()) {
			tmp.add(x);
		}
		for(String x : se.getSet()) {
			tmp.add(x);
		}
		return new WordSet(tmp);
	}
	
	public WordSet union(WordSet se) {
		return union(this, se);
	}
	
	private static WordSet intersection(WordSet fi, WordSet se) {
		TreeSet<String> tmp = new TreeSet<>();
		for(String x : fi.getSet()) {
			if(se.getSet().contains(x)) {
				tmp.add(x);
			}
		}
		return new WordSet(tmp);
	}
	
	public WordSet intersection(WordSet se) {
		return intersection(this, se);
	}
	
	public String toString() {
		String ans = "";
		for(String x : set) {
			ans += x + " ";
		}
		return ans.trim();
	}
	
	
}
