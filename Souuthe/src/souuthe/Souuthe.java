/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package souuthe;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Souuthe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(!check1(s)){
                System.out.println("INVALID");
            }else{
                if(check2(s)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
    public static boolean check2(String s){
        if(s.length() % 2 == 0){
            int cnt = 0;
            for(int i = 0; i < s.length(); i++){
                
                if(s.charAt(i) == '0' || s.charAt(i) == '2' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8'){
                    cnt++;
                }
            }
            if(cnt > s.length()/2){
                return true;
            }
            return false;
        }
        if(s.length() % 2 != 0){
            int cnt = 0;
            for(int i = 0; i < s.length(); i++){
                
            if(s.charAt(i) == '1' || s.charAt(i) == '3' || s.charAt(i) == '5' || s.charAt(i) == '7' || s.charAt(i) == '9'){
                    cnt++;
                }
            }
            if(cnt > s.length()/2){
                return true;
            }
            return false;
        }
        
        return false;
    }
    public static boolean check1(String s){
        if(s.charAt(0) == '0') {
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
