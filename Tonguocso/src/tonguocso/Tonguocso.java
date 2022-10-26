/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tonguocso;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tonguocso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int prime[];
        prime = new int[2000001];
        for(int i = 0; i <= 2000000; i++){
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        for(int i = 2; i <= 1420; i++){
            if(prime[i] == 1){
                for(int j = i*i; j <= 2000000; j+=i){
                    prime[j] = 0;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while(t > 0){
            t--;
            
            int n = sc.nextInt();
            if(prime[n] == 1){
                sum += n;
            }
            else{   
                while(n % 2 == 0){
                    sum += 2;
                    n /= 2;
                }
                for(int i = 3; i <= Math.sqrt(n); i += 2){
                    while(n % i == 0){
                        sum += i;
                        n /= i;
                    }
                }
                if(n != 1){
                    sum += n;
                }
            }
         
        }
           System.out.println(sum);
    }
    
}
