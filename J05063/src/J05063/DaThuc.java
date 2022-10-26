package J05063;

import java.util.Map;

import java.util.TreeMap;

public class DaThuc {
	//private int factor, indexnum;
	private TreeMap<Integer, Integer> map;
	
	public DaThuc(String s) {
		super();
		map = new TreeMap<>();
		pushMap(s);
		
	}
	
	
	
	public DaThuc() {
		super();
	}



	private void pushMap(String s) {
		String[] tmp = s.trim().split("\\s+");
		
		for(int i = 0; i < tmp.length; i++) {
			if(!tmp[i].equals("+")) {
				int res = find(tmp[i]);
				int key = Integer.parseInt(tmp[i].substring(res+3)), val = Integer.parseInt(tmp[i].substring(0, res));
				if(map.containsKey(val)) {
					map.put(key, map.get(key)+val);
				}else {
					map.put(key, val);
				}
			}
		}
	}
	
	public static int find(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '*') return i;
		}
		return 0;
	}
	
	public DaThuc cong(DaThuc se) {
		DaThuc ans = new DaThuc();
		ans.map = new TreeMap<>();
		ans.map.putAll(this.map);
		for(Map.Entry<Integer, Integer> entry : se.map.entrySet()) {
			if(ans.map.containsKey(entry.getKey())) {
				ans.map.put(entry.getKey(), ans.map.get(entry.getKey())+entry.getValue());
			}else {
				ans.map.put(entry.getKey(), entry.getValue());
			}
		}
		return ans;
	}
	
	public String toString() {
		String ans = "";
		for(Map.Entry<Integer, Integer> en : map.entrySet()) {
			ans = en.getValue() + "*x^" + en.getKey() + " ";		 
		}
		return ans.trim();
	}
	
}
//1
//3*x^8 + 7*x^2 + 4*x^0
//11*x^6 + 9*x^2 + 2*x^1 + 3*x^0
