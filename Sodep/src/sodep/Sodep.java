/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sodep;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sodep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = new String();
            boolean check = true;
            s = sc.next();
            int n = s.length();
//            int sum = 0;
            
                for(int i = 0; i < n/2; i++){
                    if((s.charAt(i) != s.charAt(n-1-i))){
                        check = false;
                        break;
                        
                    }
                }
//                for(int i = 0; i < n; i++){
//                    int num = Integer.parseInt(String.valueOf(s.charAt(i)));
//                    sum += num;
//                }
//                if(sum % 10 != 0){
//                    check = false;
//                }
            for(int i = 0; i < n; i++){
                if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                    check = false;
                    break;
                }
            }
            
            if(check){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
