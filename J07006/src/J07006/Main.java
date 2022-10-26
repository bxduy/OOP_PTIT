package J07006;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		 ObjectInputStream sc = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
		 ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
		 sc.close();
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for(Integer x : list) {
			 if(map.containsKey(x)) {
				 int tmp = map.get(x);
				 tmp++;
				 map.put(x, tmp);
			 }else {
				 map.put(x, 1);
			 }
		 }
		 Set<Integer> set = map.keySet();
		 for(Integer it : set) {
			 System.out.println(it + " " + map.get(it));
		 }
	}
}
