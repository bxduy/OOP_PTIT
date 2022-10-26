package J07072;

public class Name implements Comparable<Name>{
	private String fullName, surname, middle, name;

	public Name(String fullName) {
		super();
		String s = fullName;
		this.surname = "";
		this.middle = "";
		this.name = "";
		String tmp[] = s.trim().toLowerCase().split("\\s+");
		int n = tmp.length;
		this.surname = String.valueOf(tmp[0].charAt(0)).toUpperCase() + tmp[0].substring(1);
		for(int i = 1; i < n-1; i++) {
			this.middle += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1) + " ";
		}
		this.name = String.valueOf(tmp[n-1].charAt(0)).toUpperCase() + tmp[n-1].substring(1);
	}
	
	public int compareTo(Name o) {
		int i = this.name.compareTo(o.name);
		if(i != 0) return i;
		i = this.surname.compareTo(o.surname);
		if(i != 0) return i;
		return this.middle.compareTo(o.middle);
	}
	
	public String toString() {
		return (surname + " " + middle).trim() + " " + name;
	}
	
}
