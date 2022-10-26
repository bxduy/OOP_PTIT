package J07071;

public class Name implements Comparable<Name>{
	private String[] name;

	public Name(String name) {
		this.name = name.split("\\s+");
	}
	
	public String shortName() {
		String ans = "";
		int n = name.length;
		for(int i = 0; i < n; i++) {
			ans += name[i].charAt(0);
			if(i < n-1) ans += ".";
		}
		return ans;
	}
	
	public boolean check(String s) {
		String res = this.shortName();
		if(s.length() != res.length()) return false;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '*') continue;
			if(s.charAt(i) != res.charAt(i)) return false;
		}
		return true;
	}
	
	public int compareTo(Name o) {
		if(this.name[this.name.length - 1].compareTo(o.name[o.name.length-1]) != 0) {
			return this.name[this.name.length - 1].compareTo(o.name[o.name.length-1]);
		}
		return this.name[0].compareTo(o.name[0]);
	}
	
	public String toString() {
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < name.length; i++) {
			ans.append(name[i]);
			ans.append(" ");
		}
		return ans.toString().trim();
	}
	
}
