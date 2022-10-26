package j08020;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) {
			String s = sc.nextLine();
			if(isCorrectBracket(s)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	public static boolean isCorrectBracket(String s) {
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
				st.push(s.charAt(i));
			}else {
				if(!st.isEmpty()) {
					if(s.charAt(i) == ')' && st.peek() == '(') st.pop();
					else if(s.charAt(i) == '}' && st.peek() == '{') st.pop();
					else if(s.charAt(i) == ']' && st.peek() == '[') st.pop();
					else return false;
				}
				else return false;
			}
		}
		return st.isEmpty();
	}
}
