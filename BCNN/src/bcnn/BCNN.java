/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bcnn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BCNN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long x = 1;
            for(long i = 2; i <= n; i++){
                x = bn(i, x);
            }
            System.out.println(x);
        }
    }
    public static long uc(long a, long b){
        if(b == 0){
            return a;
        }
        return uc(b, a%b);
    }
    public static long bn(long a, long b){
        return (long)(a / uc(a, b) * b);
    }
}
