/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chiahet11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chiahet11 {

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
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
    public static boolean check(String s){
        int du = 0;
        for(int i = 0; i < s.length(); i++){
            du = du * 10 + (s.charAt(i) - '0');
            du %= 11;
        }
        return du == 0;
    }
}
