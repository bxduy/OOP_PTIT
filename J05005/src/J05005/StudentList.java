package J05005;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	private ArrayList<Student> list;
	
	public StudentList() {
		list = new ArrayList<>();
	}
	
	public void add(Student o) {
		list.add(o);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void show() {
		list.forEach((student) -> {System.out.println(student);});
	}
	
}
