/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package khaibaolopthisinh;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhaiBaoLopThiSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThiSinh a = new ThiSinh("", "", 0, 0, 0);
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        a.setTen(s);
        s = sc.next();
        a.setNgay(s);
        double tmp;
        tmp = sc.nextDouble();
        a.setDiem1(tmp);
        tmp = sc.nextDouble();
        a.setDiem2(tmp);
        tmp = sc.nextDouble();
        a.setDiem3(tmp);
        a.in();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(a.tong()));
    }
    
}
