package J07058;

import java.util.ArrayList;
import java.util.Collections;

public class SubjectList {
	private ArrayList<Subject> list;

	public SubjectList() {
		list = new ArrayList<>();
	}
	
	public void add(Subject a) {
		list.add(a);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void show() {
		list.forEach((subject) -> {System.out.println(subject);});
	}
	
}
