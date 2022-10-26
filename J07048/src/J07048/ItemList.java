package J07048;

import java.util.ArrayList;
import java.util.Collections;

public class ItemList {
	private ArrayList<Item> list;
	
	public ItemList() {
		list = new ArrayList<>();
	}
	
	public void add(Item o) {
		list.add(o);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void show() {
		list.forEach((item) -> {System.out.println(item);});
	}
	
}
