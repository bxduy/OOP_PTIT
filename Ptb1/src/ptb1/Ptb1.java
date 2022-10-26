/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ptb1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ptb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a == 0 && b != 0){
            System.out.println("VN");
        }else if(a == 0 && b == 0){
            System.out.println("VSN");
        }else{
            c = -b / a;
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(c));
        }
    }
    
}
