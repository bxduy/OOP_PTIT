/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tohop1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tohop1 {

    /**
     * @param args the command line arguments
     */
    static int n, k;
    static int[]a = new int[15];
    static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        for(ArrayList it : al){
            for(int i = 0; i < it.size(); i++){
                System.out.print(it.get(i));
            }
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("Tong cong co " + al.size() + " to hop");        
    }
    public static void Try(int i){
        for(int j = a[i-1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                ArrayList<Integer> al1 = new ArrayList<>();
                for(int x = 1; x <= k; x++){
                    al1.add(a[x]);
                }
                al.add(al1);
            }else{
                Try(i+1);
            }
        }
    }
}
