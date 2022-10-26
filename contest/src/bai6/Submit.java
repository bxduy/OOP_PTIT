package bai6;

public class Submit implements Comparable<Submit>{
	private String name;
	private int ac, sub;
	
	public Submit(String name, int ac, int sub) {
		super();
		this.name = name;
		this.ac = ac;
		this.sub = sub;
	}
	
	public int compareTo(Submit o) {
		if(this.ac > o.ac) return -1;
		if(this.ac < o.ac) return 1;
		if(this.sub < o.sub) return -1;
		if(this.sub > o.sub) return 1;
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		return name + " " + ac + " " + sub;
	}
	
}
