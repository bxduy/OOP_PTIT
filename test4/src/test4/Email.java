package test4;

import java.util.HashMap;

public class Email {
	private String name;
	static HashMap<String, Integer> map = new HashMap<>();
	
	
	public Email(String name) {
		super();
		this.name = chuanTen(name);
		if(map.containsKey(this.name)) {
			map.put(this.name, map.get(this.name)+1);
		}else {
			map.put(this.name, 1);
		}
		if(map.get(this.name) > 1)
			this.name += map.get(this.name);
	}
	
	private String chuanTen(String s) {
		String[] tmp = s.trim().toLowerCase().split("\\s+");
		s = tmp[tmp.length-1];
		for(int i = 0; i < tmp.length-1; i++) {
			s += tmp[i].substring(0, 1);
		}
		return s ;
	}
	
	public String toString() {
		return name + "@ptit.edu.vn";
	}
	
}
