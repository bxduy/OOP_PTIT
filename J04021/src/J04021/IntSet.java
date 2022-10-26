package J04021;

public class IntSet {
	private int[] arr;
	
	public IntSet() {
		arr = new int[1000];
	}

	public IntSet(int[] arr) {
		super();
		this.arr = new int[1000];
		for(Integer x : arr) {
			this.arr[x] = 1;
		}
	}
	
	public void add(int num) {
		arr[num] = 1;
	}
	
	private static IntSet union(IntSet fir, IntSet se) {
		IntSet is = new IntSet();
		for(int i = 0; i < 1000; i++) {
			if(fir.arr[i] == 1 || se.arr[i] == 1) {
				is.add(i);
			}
		}
		return is;
	}
	
	public IntSet union(IntSet se) {
		return IntSet.union(this, se);
	}
	
	public String toString() {
		StringBuffer ans = new StringBuffer();
		for(int i = 0; i < 1000; i++) {
			if(arr[i] == 1) {
				ans.append(i + " ");
			}
		}
		return ans.toString();
	}
	
}
