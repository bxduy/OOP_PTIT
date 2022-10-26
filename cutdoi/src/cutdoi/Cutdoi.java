/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cutdoi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cutdoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            boolean check = true, kt = true;
            long tmp = 0, cnt = 0;
            while(n > 0){
                long a = n % 10;
                n /= 10;
                if(a != 1 && a != 0 && a != 9 && a != 8){
                    check = false;
                    break;
                }else{
                    if(a == 8 || a == 0 || a == 9){
                        tmp = tmp * 10;
                        if(kt){
                            cnt++;
                        }
                    }else{
                        tmp = tmp * 10 + 1;
                        kt = false;
                    }
                }
            }
            if(check){
                if(tmp == 0){
                    check = false;
                }
            }
            if(!check){
                System.out.println("INVALID");
            }else{
                long x = 0;
                while(tmp > 0){
                    x = x * 10 + (tmp % 10);
                    tmp /= 10;
                }
                x = x * (long)Math.pow(10, cnt);
                System.out.println(x);
            }
        }
    }
    
}
