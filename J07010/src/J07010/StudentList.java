package J07010;

import java.util.ArrayList;

public class StudentList{
	private ArrayList<Student> list;
	
	public StudentList() {
		list = new ArrayList<>();
	}
	
	public void add(Student a) {
		list.add(a);
	}
	
	public void show() {
		list.forEach((student) -> {System.out.println(student);});;
	}
	
}
