/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tonggiathua;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tonggiathua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1, cnt = 1;
        for(int i = 2; i <= n; i++){
            cnt *= i;
            sum += cnt;
        }
        System.out.println(sum);
    }
    
}
