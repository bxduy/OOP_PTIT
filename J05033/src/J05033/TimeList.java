package J05033;

import java.util.ArrayList;
import java.util.Collections;

public class TimeList {
	private ArrayList<Time> list;
	
	public TimeList() {
		list = new ArrayList<>();
	}
	
	public void add(Time o) {
		list.add(o);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void show() {
		list.forEach((time) -> {System.out.println(time);});
	}
	
}
