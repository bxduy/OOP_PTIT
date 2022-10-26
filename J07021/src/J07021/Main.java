package J07021;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		while(true) {
			
			String s = sc.nextLine();
			if(s.equals("END")) {
				break;
			}
			s = s.replaceAll("\\s+", " ");
			s = s.trim().toLowerCase();
			String[] tmp = s.split(" ");
			s = "";
			for(int i = 0; i < tmp.length; i++) {
				s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
				if(i != tmp.length-1) {
					s += " ";
				}
			}
			System.out.println(s);
		}
	}
}
