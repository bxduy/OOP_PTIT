/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs47;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cs47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        long n = sc.nextLong();
        while(n > 0){
            if(n % 10 == 4 || n % 10  == 7){
                cnt++;
            }
            n /= 10;
        }
        if(cnt  == 7 || cnt == 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
