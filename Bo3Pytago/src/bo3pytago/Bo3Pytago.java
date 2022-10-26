/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bo3pytago;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bo3Pytago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                a[i] = a[i] * a[i];
            }
            if(check(a, n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(long[] a, int n){
        Arrays.sort(a);
        for(int i = n-1; i >= 2; i--){
            int l = 0, r = i-1;
            while(l < r){
                if(a[l] + a[r] == a[i]){
                    return true;
                }
                if(a[l] + a[r] > a[i]){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return false;
    }
}
