package J07081;

public class Student implements Comparable<Student>{
	private String iD, fullName, phone, email, sur, middle, name;

	public Student(String iD, String fullName, String phone, String email) {
		super();
		this.iD = iD;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		String tmp[] = fullName.split(" ");
		int n = tmp.length;
		this.sur = tmp[0];
		this.name = tmp[n-1];
		this.middle = "";
		for(int i = 1; i < n-1; i++) this.middle += tmp[i] + " ";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int i = this.name.compareTo(o.name);
		if(i != 0) return i;
		i = this.sur.compareTo(o.sur);
		if(i != 0) return i;
		i = this.middle.compareTo(o.middle);
		if(i != 0) return i;
		return this.iD.compareTo(o.iD);
	}
	
	public String toString() {
		return iD + " " + fullName + " " + phone + " " + email;
	}
	
	
}
