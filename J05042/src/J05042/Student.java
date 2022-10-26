package J05042;

public class Student implements Comparable<Student>{
	private String name;
	private int ac, submit;
	
	public Student(String name, int ac, int submit) {
		super();
		this.name = name;
		this.ac = ac;
		this.submit = submit;
	}
	
	public int compareTo(Student o) {
		if(this.ac > o.ac) return -1;
		if(this.ac < o.ac) return 1;
		if(this.submit < o.submit) return -1;
		if(this.submit > o.submit) return 1;
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		return name + " " + ac + " " + submit;
	}
	
}
