/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phantichtsnt;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhantichTSNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t;
        t = sc.nextInt();
        int k = t;
        while(t > 0){
            t--;
            n = sc.nextInt();
            System.out.print("Test " + (k - t) + ":");
            pt(n);
        }
    }
    public static void pt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                int cnt = 0;
                while(n % i == 0){
                    cnt++;
                    n /= i;
                }
                System.out.print(" " + i + "(" + cnt + ")");
            }
        }
        if(n != 1){
            System.out.print(" " + n + "(1)");
        }
        System.out.println("");
    }
}
