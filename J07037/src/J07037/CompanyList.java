package J07037;

import java.util.ArrayList;
import java.util.Collections;

public class CompanyList {
	private ArrayList<Company> list;
	
	public CompanyList() {
		list = new ArrayList<>();
	}
	
	public void add(Company a) {
		list.add(a);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void show() {
		list.forEach((company) -> {System.out.println(company);});
	}
	
}
