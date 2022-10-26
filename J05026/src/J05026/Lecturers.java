package J05026;

public class Lecturers {
	public static int cnt = 1;
	private String iD, name, subject;
	
	public Lecturers(String name, String subject) {
		super();
		this.iD = "GV" + String.format("%02d", cnt);
		cnt++;
		this.name = name;
		subject = subject.toUpperCase();
		String[] tmp = subject.split(" ");
		subject = "";
		for(int i = 0; i < tmp.length; i++) {
			subject += String.valueOf(tmp[i].charAt(0));
		}
		this.subject = subject;
	}
	
	
	
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}


	public String toString() {
		return iD + " " + name + " " + subject;
	}
	
}
