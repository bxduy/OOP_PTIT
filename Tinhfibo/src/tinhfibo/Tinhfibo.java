/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhfibo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tinhfibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long fibo[];
        fibo = new long[95];
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i <= 92; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while(t > 0){
            n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }
    
}
