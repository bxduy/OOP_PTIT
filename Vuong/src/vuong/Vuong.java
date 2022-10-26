/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x11 = sc.nextInt();
        int y11 = sc.nextInt();
        int x22 = sc.nextInt();
        int y22 = sc.nextInt();
        int m1 = Math.min(x1, x11), m2 = Math.max(x2, x22), m3 = Math.min(y1, y11), m4 = Math.max(y2, y22);
        int m = Math.max(m2-m1, m4-m3);
        System.out.println(m*m);
    }
    
}
