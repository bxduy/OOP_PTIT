/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xaudoixung;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Xaudoixung {

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
        int cnt;
        int n = s.length();
        if(n == 1){
            return true;
        }
        cnt = 0;
        
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
               cnt++;
            }
        }
        if(n % 2 == 0){
            return cnt == 1;
        }
        if(n % 2 != 0){
            return (cnt == 1 || cnt == 0);
        }
        return false;
    }
}
