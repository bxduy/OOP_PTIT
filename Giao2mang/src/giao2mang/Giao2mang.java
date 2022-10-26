/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giao2mang;


import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Giao2mang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> set = new TreeSet<>();
        
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i  =0; i < n+m; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        
        for(int x : set){
            System.out.print(x + " ");
        }
    }
    
}
