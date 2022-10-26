/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diemcb;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DiemCB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int s = 0, s1;
            boolean check = true;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                s += a[i];
            }
            s1 = a[0];
            for(int i = 1; i < n; i++){
                if((s - a[i]) % 2 == 0 && s1 * 2 == s - a[i]){
                    System.out.println(i + 1);
                    check = false;
                    break;
                }
                s1 += a[i];
            }
            if(check){
                System.out.println("-1");
            }
        }
    }
    
}
