/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chiahet1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chiahet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger n = sc.nextBigInteger();
            
            BigInteger m = sc.nextBigInteger();
            if(n.compareTo(m) < 0){
                n = m.mod(n);
            }else{
                n = n.mod(m);
            }
            
            BigInteger c = n.subtract(n);
            if(n.equals(c)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
        
    }
    
}
