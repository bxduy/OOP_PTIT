/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sotp;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            boolean check = true;
            String s = sc.next();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '0'){
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }
        }
    }
    
}
