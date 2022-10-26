/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucln;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UCLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            String b = sc.next();
            long res = du(b, a);
            System.out.println(gcd(res, a));
        }
    }
    public static long du(String a, long b){
        long res = 0;
        for(int i = 0; i < a.length(); i++){
            res = res * 10 + ( a.charAt(i) - '0');
            res %= b;
        }
        return res;
    }
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
