package J07009;

import java.util.TreeSet;

public class IntSet {
	private TreeSet<Integer> set;



	public IntSet(int[] a) {
		super();
		set = new TreeSet<>();
		for(Integer x : a) set.add(x);
	}

	

	public IntSet(TreeSet<Integer> set) {
		super();
		this.set = set;
	}
	
	
	/**
	 * @return the set
	 */
	public TreeSet<Integer> getSet() {
		return set;
	}




	private IntSet intersection(IntSet fi, IntSet se) {
		TreeSet<Integer> set = new TreeSet<>();
		for(Integer x : fi.getSet()) {
			if(se.getSet().contains(x)) {
				set.add(x);
			}
		}
		return new IntSet(set);
	}
	
	public IntSet intersection(IntSet se) {
		return intersection(this, se);
	}
	
	public String toString() {
		String ans = "";
		for(Integer x : set) {
			ans += x + " ";
		}
		return ans.trim();
	}
	
}
