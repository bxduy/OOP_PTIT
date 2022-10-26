/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xaunp;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class XauNP {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] dp = new long[93];
        dp[2] = dp[1] = 1;
        for(int i = 3; i < 93; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fibo(n, k, dp));
            
        }
    }
    public static long fibo(int n, long k, long[] dp){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(k <= dp[n-2]){
            return fibo(n-2, k, dp);
        }
        return fibo(n-1, k-dp[n-2], dp);
    }
    
    
}
