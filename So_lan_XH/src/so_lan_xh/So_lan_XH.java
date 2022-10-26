/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_lan_xh;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class So_lan_XH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 1; x <= t; x++){
            int n = sc.nextInt();
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < n; i++){
                int j = sc.nextInt();
                if(map.containsKey(j)){
                    int cnt = map.get(j);
                    cnt++;
                    map.put(j, cnt);
                }else{
                    map.put(j, 1);
                }
            }
            System.out.println("Test " + x + ": ");
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
    
}
