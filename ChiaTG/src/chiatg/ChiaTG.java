/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chiatg;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ChiaTG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int h = sc.nextInt();
            for(int i = k-1; i > 0; i--){
                DecimalFormat df = new DecimalFormat("0.000000");
                double l = Math.sqrt((k-i) * 1.0 / k * Math.pow(h, 2));
                System.out.print(df.format(l) + " ");
            }
            System.out.println("");
        }
    }
    
}
