package J05009;

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
	
	public void show(double m) {
		list.forEach((student) -> {if(student.getTotalPoint() >= m) {System.out.println(student);}});
	}
	
	
	
}
