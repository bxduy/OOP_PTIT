/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Songuyento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while(t > 0){
            n = sc.nextInt();
            if(check(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean check(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
}
