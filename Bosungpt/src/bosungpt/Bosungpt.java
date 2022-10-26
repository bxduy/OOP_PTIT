/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bosungpt;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bosungpt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean check = true;
            for(int i = 1; i < a[0]; i++){
                System.out.println(i);
                check = false;
            }
            for(int i = 0; i <= n-2; i++){
                for(int j = a[i] + 1; j < a[i+1]; j++){
                    System.out.println(j);
                    check = false;
                }
            }
            if(check){
                System.out.println("Excellent!");
            }
        
    }
    
}
