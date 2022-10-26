/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinhchunhat;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        
        int a1 = a.nextInt(), b1 = a.nextInt();
        if(a1 <= 0 || b1 <= 0){
            System.out.println("0");
        }
        else{
            System.out.println(2 * (a1 + b1) + " " + a1 * b1);
        }
    }
    
}
