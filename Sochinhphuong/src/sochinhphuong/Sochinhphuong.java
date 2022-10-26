/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sochinhphuong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sochinhphuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int tmp = (int)Math.sqrt(n);
            if(tmp * tmp == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
