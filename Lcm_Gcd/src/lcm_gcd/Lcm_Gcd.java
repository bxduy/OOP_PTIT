/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lcm_gcd;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lcm_Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = Gcd(a, b);
            System.out.println(a * b / c + " " + c);
        }
    }
    public static long Gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return Gcd(b, a % b);
    }
}
