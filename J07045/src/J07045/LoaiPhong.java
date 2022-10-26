package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
	private String s, name;

	public LoaiPhong(String s) {
		super();
		this.s = s;
		String[] tmp = s.split(" ");
		name = tmp[1];
	}
	
	public int compareTo(LoaiPhong x) {
		return this.name.compareTo(x.name);
	}
	
	public String toString() {
		return s;
	}
	
}
