/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daotu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Daotu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int t = Integer.parseInt(k);
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            String tmp[] = s.split(" ");
            for(int i = 0; i < tmp.length; i++){
                for(int j = tmp[i].length()-1; j >= 0; j--){
                    System.out.print(tmp[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
