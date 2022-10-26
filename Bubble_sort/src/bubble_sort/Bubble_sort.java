/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble_sort;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bubble_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i = 0; i < n-1; i++){
            boolean check = false;
            for(int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    check = true;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if(check){
                cnt++;
                System.out.print("Buoc " + cnt + ": ");
                for(int k = 0; k < n; k++){
                    System.out.print(a[k] + " ");
                }
            }else{
                break;
            }
            System.out.println("");
        }
    }
    
}
