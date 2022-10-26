package J02017;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			int n = sc.nextInt();
			if(al.size() == 0 || (al.get(al.size() - 1) + n)% 2 != 0) {
				al.add(n);
			}else {
				al.remove(al.size()-1);
			}
		}
		System.out.println(al.size());
		sc.close();
	}
}
