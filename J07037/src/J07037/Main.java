package J07037;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DN.in"));
		CompanyList list = new CompanyList();
		int t = Integer.parseInt(sc.nextLine());
		String iD, name, amount;
		while(t-- > 0) {
			iD = sc.nextLine();
			name = sc.nextLine();
			amount = sc.nextLine();
			Company company  = new Company(name, iD, amount);
			list.add(company);
		}
		sc.close();
		list.sort();
		list.show();
	}
}
