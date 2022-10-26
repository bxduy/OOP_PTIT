/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuanhoaht;

import java.nio.charset.CodingErrorAction;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ChuanhoaHT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int k = Integer.parseInt(t);
        while(k-- > 0){
            String s;
            s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            s = s.trim().toLowerCase();
            
            String tmp[] = s.split(" ");
             s = "";
            for(int i = 0; i < tmp.length; i++){
                s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                if(i < tmp.length){
                    s += " ";
                }
            }
            System.out.println(s);
        }
        
    }
    
}
