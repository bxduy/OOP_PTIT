package J05010;

import java.util.ArrayList;
import java.util.Collections;

public class ProductList {
	private ArrayList<Product> list;
	
	public ProductList() {
		list = new ArrayList<>();
	}
	
	public void add(Product o) {
		list.add(o);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void show() {
		list.forEach((product) -> {System.out.println(product);});
	}
	
}
