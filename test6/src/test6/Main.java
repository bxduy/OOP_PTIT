package test6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream sc = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
		ArrayList<String> list = (ArrayList<String>)sc.readObject();
		sc.close();
		for(String x : list) {
			String res = "";
			for(int i = 0; i < x.length(); i++) {
				if(x.charAt(i) == '0' || x.charAt(i) == '1') {
					res += x.charAt(i);
				}
			}
			System.out.println(res + " " + Integer.parseInt(res, 2));
		}
	}
}
