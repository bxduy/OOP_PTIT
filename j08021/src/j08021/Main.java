package j08021;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String s = sc.nextLine();
			System.out.println(countCorrectBracket(s));
		}
		sc.close();
	}

	private static int countCorrectBracket(String s) {
		// TODO Auto-generated method stub
		int res = 0;
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		for(int i = 0; i < s.length(); i++) {
			 if(s.charAt(i) == '(') st.push(i);
			 else {
				 st.pop();
				 if(!st.isEmpty()) {
					 res = Math.max(res, i-st.peek());
				 }else {
					 st.push(i);
				 }
			 }
		}
		return res;
	}
	
}
