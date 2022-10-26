package J05025;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Lecturers> list = new ArrayList<>();
		while(t-- > 0) {
			list.add(new Lecturers(sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(list);
		for(Lecturers x : list) {
			System.out.println(x);
		}
		sc.close();
	}
}
