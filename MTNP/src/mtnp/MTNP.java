/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mtnp;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MTNP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[][] a = new int[n][3];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
            if(sum > 1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}
