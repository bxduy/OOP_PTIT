/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_lien_ke;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class So_lien_ke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(check(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(long n){
        long sum = 0;
        while(n >= 10){
            long a = n % 10;
            n /= 10;
            long b = n % 10;
            sum += a;
            if(n < 10){
                sum += b;
            }
            if(Math.abs(a-b) != 2){
                return false;
            }
        }
        return sum % 10 == 0;
    }
}
