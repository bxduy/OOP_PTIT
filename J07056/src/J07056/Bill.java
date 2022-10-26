package J07056;

public class Bill implements Comparable<Bill>{
	public static int cnt = 1;
	private String iD, name, type;
	private long total, vat, exceed, notEx, quota, old, neww;
	
	
	
	
	public Bill(String name, String type, long old, long neww) {
		super();
		this.iD = "KH" + String.format("%02d", cnt);
		cnt++; 
		this.name = chuanTen(name);
		this.type = type;
		this.old = old;
		this.neww = neww;
		long amount = this.neww - this.old;
		if(this.type.equals("A")) this.quota = 100;
		else if(this.type.equals("B")) this.quota = 500;
		else this.quota = 200;
		this.exceed = 0;
		this.vat = 0;
		if(amount < this.quota) {
			this.notEx = amount * 450;
		}else {
			this.notEx = this.quota * 450;
			amount -= this.quota;
			this.exceed = amount * 1000;
			this.vat = this.exceed/20;
		}
		this.total = this.notEx + this.exceed + this.vat;
	}

	


	private String chuanTen(String s) {
		String tmp[] = s.trim().toLowerCase().replaceAll("\\s+", " ").split(" ");
		s = "";
		int n = tmp.length;
		for(int i = 0; i < n; i++) {
			s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
			if(i < n-1) s += " ";
		}
		return s;
	}




	@Override
	public int compareTo(Bill o) {
		// TODO Auto-generated method stub
		if(this.total > o.total) return -1;
		return 1;
	}
	
	public String toString() {
		return iD + " " + name + " " + this.notEx + " " + this.exceed + " " + this.vat + " " + this.total;
	}
	
}
