/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_luy_thua;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tinh_luy_thua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long  m = 1000000000 + 7;
        while(true){ 
            long a = sc.nextLong(); long b = sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(powmod(a, b, m));
        }
    }
    public static long powmod(long a, long b, long m){
        if(b == 0){
            return 1;
        }
        long tmp = powmod(a, b/2, m);
        if(b % 2 == 1){
            return (a % m * ((tmp % m) * (tmp % m) % m)) % m;
        }
        return (tmp % m) * (tmp % m) % m;
    }
       
    

}
