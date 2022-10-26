/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dienthoai;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dienthoai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        reduce(s);
    }
    public static String remove(String s){
        if(s.length() == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            char d = s.charAt(i+1);
            if(c != d){
                sb.append(c);
                if(i == s.length() - 2){
                    sb.append(d);
                            
                }
            }else{
                for(int j = i+2; j < s.length(); j++){
                    sb.append(s.charAt(j));
                }
                return sb.toString();
            }
        }
        return sb.toString();
        
    }
    public static void reduce(String s){
        String ans = "";
        String pre = s;
        while(true){
            ans = remove(pre);
            if(ans.equals(pre)){
                break;
            }
            pre = ans;
        }
        if(ans.length() != 0){
            System.out.println(ans);
        }else{
            System.out.println("Empty String");
        }
    }
}
