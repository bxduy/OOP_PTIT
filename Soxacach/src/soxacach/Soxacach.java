/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soxacach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Soxacach {

    /**
     * @param args the command line arguments
     */
    static int n;
    static int[] a  =new int[15];
    static boolean[] kt = new boolean[15];
    static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            al.clear();
            n = sc.nextInt();
            for(int i = 0; i < 15; i++){
                kt[i] = true;
            }
            Try(1);
            if(al.isEmpty()){
                System.out.println("");
            }else{
                for(ArrayList it : al){
                    for(int i = 0; i < it.size(); i++){
                        System.out.print(it.get(i));
                    }
                    System.out.println("");
                }
            }
        }
    }
    public static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(kt[j]){
                a[i] = j;
                kt[j] = false;
                if(i == n){
                    
                    if(check()){
                        ArrayList<Integer> al1 = new ArrayList<>();
                        for(int x = 1; x <= n; x++){
                            al1.add(a[x]);
                        }
                        al.add(al1);
                    }

                    
                }else{
                    Try(i+1);
                }
                kt[j] = true;
            } 
        }
    }
    public static boolean check(){
        for(int i = 1; i < n; i++){
            if(Math.abs(a[i] - a[i+1]) == 1){
                return false;
            }
        }
        return true;
    }
}
