package jkt013;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-- > 0) {
			 int n = sc.nextInt();
			 Queue<String> q = new LinkedList<String>();
			 q.add("6");
			 q.add("8");
			 ArrayList<String> list = new ArrayList<>();
			 while(true) {
				 String tmp = q.peek();
				 q.poll();
				 list.add(tmp);
				 if(tmp.length() < n) {
					 q.add(tmp + "6");
					 q.add(tmp + "8");
				 }
				 else break;
			 }
			 while(!q.isEmpty()) {
				 list.add(q.peek());
				 q.poll();
			 }
			 System.out.println(list.size());
			 Collections.reverse(list);
			 for(String x : list) {
				 System.out.print(x + " ");
			 }
			 System.out.println();
		 }
		 sc.close();
	}
}
