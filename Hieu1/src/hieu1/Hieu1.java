/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hieu1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hieu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            System.out.println(sub(a, b));
        }
    }
    public static String dao(String s){
        String ss = "";
        int n = s.length();
        for(int i = 0; i <n; i++){
            ss += s.charAt(n-i-1);        
        }
        return ss;
    }
    public static String sub(String s1, String s2){
        String s = "";
        if(s1.length() > s2.length() || (s1.length() == s2.length() && s1.compareTo(s2) >= 0)){
            int nho = 0, tmp = 0;
            while(s2.length() < s1.length()){
                s2 = "0" + s2;
            }
            
            for(int i = s1.length()-1; i >= 0; i--){
                
                tmp = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') -nho;
                if(tmp < 0){
                    tmp += 10;
                    nho = 1;
                }else{
                    nho = 0;
                }
                s = String.valueOf(tmp) + s;
            }
        }else{
            s = sub(s2, s1);
            
        }
             
             
        
        return s;
    }
}
