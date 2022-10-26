package J07033;

public class Student implements Comparable<Student>{
	private String iD, name, cl, email;

	public Student(String iD, String name, String cl, String email) {
		super();
		this.iD = iD;
		this.name = chuanTen(name);
		this.cl = cl;
		this.email = email;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.iD.compareTo(o.iD);
	}
	
	public String toString() {
		return iD + " " + name + " " + cl + " " + email;
	}
	
	private String chuanTen(String s) {
		String tmp[] = s.trim().toLowerCase().split("\\s+");
		int n = tmp.length;
		s = "";
		for(int i = 0; i < n; i++) {
			s += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1);
			if(i < n-1) s += " ";
		}
		return s;
	}
	
}
