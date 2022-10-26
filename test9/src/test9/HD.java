package test9;

public class HD implements Comparable<HD>{
	SV std;
	DT topic;
	String res;
	public HD(SV std, DT topic, String res) {
		super();
		this.std = std;
		this.topic = topic;
		this.res = res;
	}
	@Override
	public int compareTo(HD o) {
		if(this.res.equals(o.res)) {
			return this.std.getSiD().compareTo(o.std.getSiD());
		}
		
		return this.res.compareTo(o.res);
	}
	
	public String toString() {
		return "" + std + topic;
	}
	
}
