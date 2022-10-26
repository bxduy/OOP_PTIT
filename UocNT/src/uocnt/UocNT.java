/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uocnt;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UocNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            while(n % 2 == 0){
                n /= 2;
            }
            if(n == 1){
                System.out.println("2");
            }else{
                for(long i = 3; i <= Math.sqrt(n); i+= 2){
                    if(n % i == 0){
                        while(n % i == 0){
                            n /= i;
                            if(n == 1){
                                System.out.println(i);
                            }
                        }
                    }
                }
                if(n != 1){
                    System.out.println(n);
                }
            }
        }
    }
    
}
