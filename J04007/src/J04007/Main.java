package J04007;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, birthday, sex, taxCode, address, contactDate;
		name = sc.nextLine();
		sex = sc.nextLine();
		birthday = sc.nextLine();
		
		address = sc.nextLine();
		taxCode = sc.nextLine();
		contactDate = sc.nextLine();
		Staff staff = new Staff(name, birthday, taxCode, sex, address, contactDate);
		System.out.println(staff);
		sc.close();
	}
}
