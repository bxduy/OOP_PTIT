/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biendep;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Biendep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s){
        if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(9) == s.charAt(10)){
            return true;
        }
        if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7)  && s.charAt(7) == s.charAt(9) && s.charAt(9) == s.charAt(10)){
            return true;
        }
        if(s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) && s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10)){
            return true;
        }
        for(int i = 5; i < 8; i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        if((s.charAt(9) == '6' || s.charAt(9) =='8') && (s.charAt(10) == '6' || s.charAt(10) == '8')){
            return true;
        }
        return false;
    }
}
