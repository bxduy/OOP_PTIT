/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package email1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Email1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int t = Integer.parseInt(k);
        Map<String, Integer> map = new HashMap<>();
        while(t-- > 0){
            String s = sc.nextLine();
            
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String tmp[] = s.split(" ");
            s = tmp[tmp.length-1];
            for(int i = 0; i < tmp.length-1; i++){
                s += tmp[i].charAt(0);
                
                
                
            }
            
            
           String ss ;
           if(map.containsKey(s)){
                    int cnt = map.get(s);
                    
                    ++ cnt;
                    
                    
                    map.put(s, cnt);
                    ss= String.valueOf(cnt);
                    
              }else{
                    map.put(s, 1);
                    ss = "";
                }
           s = s + ss + "@ptit.edu.vn";
            System.out.println(s);
            
        }
    }
    
}
