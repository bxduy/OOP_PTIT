package J05025;

public class Lecturers implements Comparable<Lecturers>{
	public static int cnt = 1;
	private String iD, name, subject;

	public Lecturers(String name, String subject) {
		super();
		this.iD = "GV" + String.format("%02d", cnt);
		cnt++;
		this.name = name;
		subject = subject.toUpperCase();
		String tmp[] = subject.split(" ");
		subject = "";
		for(int i = 0; i < tmp.length; i++) {
			subject += String.valueOf(tmp[i].charAt(0));
		}
		this.subject = subject;
	}
	
	public int compareTo(Lecturers o) {
		String tmp1[] = this.name.split(" ");
		String tmp2[] = o.name.split(" ");
		if(tmp1[tmp1.length - 1].compareTo(tmp2[tmp2.length - 1]) != 0) 
			return tmp1[tmp1.length - 1].compareTo(tmp2[tmp2.length - 1]);
		else {
			return this.iD.compareTo(o.iD);
		}
	}
	
	public String toString() {
		return iD + " " + name + " " + subject;
	}
	
}
