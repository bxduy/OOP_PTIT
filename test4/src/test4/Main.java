package test4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Email> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Email(sc.nextLine()));
		}
		for(Email x : list) {
			System.out.println(x);
		}
	}
}
