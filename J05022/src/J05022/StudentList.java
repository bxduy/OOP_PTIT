package J05022;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> list;
	
	public StudentList() {
		list = new ArrayList<>();
	}
	
	public void add(Student o) {
		list.add(o);
	}
	
	public void show() {
		list.forEach((stu) -> {System.out.println(stu);});
	}
	
	
}
