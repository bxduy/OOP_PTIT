package J07034;

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
		list.forEach((sub) -> {System.out.println(sub);});
	}
	
}
