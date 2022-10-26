/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package souoc2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoUoc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            int check = 0;
            int n = sc.nextInt();
            if(n % 2 != 0){
                System.out.println("0");
                check = 1;
            }
            if(check == 0){
                System.out.println(dem(n));
            }
        }
    }
    public static int dem(int n){
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i % 2 == 0){
                    cnt++;
                }
                if((n/i) % 2 == 0){
                    cnt++;
                }
                
                if(i * i == n && i % 2 == 0){
                    cnt--;
                }
            }
        }
        return cnt;
    }
}
