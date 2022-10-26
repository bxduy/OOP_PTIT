package J07079;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream sc = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
		ArrayList<String> list= (ArrayList<String>) sc.readObject();
		sc.close();
		for(String x : list) {
			String ans = "";
			for(int i = 0; i < x.length(); i++) {
				if(x.charAt(i) == '1' || x.charAt(i) == '0') {
					ans += x.charAt(i);
				}
			}
		
			System.out.println(ans + " " + Long.parseLong(ans, 2));
		}
		
	}
}
