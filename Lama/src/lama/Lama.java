/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lama;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lama {

    /**
     * @param args the command line arguments
     */
    static String L = "IVXLCDM";
    static int[] a = {1, 5, 10, 50, 100, 500, 1000};
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
    public static int vt(char c){
        for(int i = 0; i < 7; i++){
            if(L.charAt(i) == c){
                return i;
            }
        }
        return 0;
    }
    public static int solve(String s){
        int n = s.length();
        int ans = a[vt(s.charAt(n-1))];
        for(int i = n-1; i > 0; i--){
            int sau = vt(s.charAt(i));
            int truoc = vt(s.charAt(i-1));
            if(a[truoc] >= a[sau]){
                ans += a[truoc];
            }else{
                ans -= a[truoc];
            }
        }
        return ans;
    }
}
