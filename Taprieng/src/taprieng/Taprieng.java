/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taprieng;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Taprieng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int t = Integer.parseInt(k);
        while(t-- > 0){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            s1 = s1.replaceAll("\\s+", " ");
            String tmp[] = s.split(" ");
            String tmp1[] = s1.split(" ");
            TreeSet<String> set = new TreeSet<>();
            for(String x : tmp){
                set.add(x);
            }
//            for(String x : set){
//                System.out.println(x);
//            }
            for(String x : tmp1){
                if(set.contains(x)){
                    set.remove(x);
                }
            }
            for(String x : set){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
    
}
