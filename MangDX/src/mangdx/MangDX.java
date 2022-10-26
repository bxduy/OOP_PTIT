/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mangdx;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MangDX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean check = true;
            for(int i = 0; i < n/2; i++){
                if(a[i] != a[n-i-1]){
                    System.out.println("NO");
                    check = false;
                    break;
                }
                
            }
            if(check){
                System.out.println("YES");
            }
        }
            
    }
    
}
