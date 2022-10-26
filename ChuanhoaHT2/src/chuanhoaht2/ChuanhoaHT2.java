/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuanhoaht2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ChuanhoaHT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int k = Integer.parseInt(t);
        while(k-- > 0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String tmp[] = s.split(" ");
            s = "";
            for(int i = 1; i < tmp.length; i++){
                s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1) ;
                if(i < tmp.length - 1){
                    s += " ";
                }else{
                    s += ", ";
                }
            }
            s += tmp[0].toUpperCase();
            System.out.println(s);
        }
    }
    
}
