/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkfibo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Checkfibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long fibo[];
        fibo = new long[93];
        fibo[1] = fibo[2] = 1;
        for(int i = 3; i <= 92; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        int t; long n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t > 0){
            boolean check = false;
            n = sc.nextLong();
            for(int i = 1; i <= 92; i++){
                if(n == fibo[i] || n == 0){
                    System.out.println("YES");
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("NO");
            }
            t--;
        }
    }
    
}
