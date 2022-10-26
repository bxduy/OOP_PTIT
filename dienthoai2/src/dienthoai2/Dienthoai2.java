/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dienthoai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dienthoai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = s.toLowerCase();
            String a = "";
            int n = s.length();
            for(int i = 0; i < n; i++){
                if( s.charAt(i) >= 'a' && s.charAt(i) <= 'c') a += "2";
		else if( s.charAt(i) >= 'd' && s.charAt(i) <= 'f')a += "3";
		else if( s.charAt(i) >= 'g' && s.charAt(i) <= 'i')a += "4";
		else if( s.charAt(i) >= 'j' && s.charAt(i) <= 'l')a += "5";
		else if( s.charAt(i) >= 'm' && s.charAt(i) <= 'o')a += "6";
		else if( s.charAt(i) >= 'p' && s.charAt(i) <= 's')a += "7";
		else if( s.charAt(i) >= 't' && s.charAt(i) <= 'v')a += "8";
		else if( s.charAt(i) >= 'w' && s.charAt(i) <= 'z')a += "9";
            }
            a = reduce(a);
            if(check(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static String remove(String s){
        if(s.length() == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            char d = s.charAt(i+1);
            if(c != d){
                sb.append(c);
                if(i == s.length()-2){
                    sb.append(d);
                }
            }else{
                for(int j = i+1; j < s.length(); j++){
                    sb.append(s.charAt(j));
                }
                return sb.toString();
            }
        }
        return sb.toString();         
    }
    public static String reduce(String s){
        String ans = "";
        String pre = s;
        while(true){
            ans = remove(pre);
            if(ans.equals(pre)){
                break;
            }
            pre = ans;
        }
        return ans;
    }
    public static boolean check(String s){
        int n = s.length();
                
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
