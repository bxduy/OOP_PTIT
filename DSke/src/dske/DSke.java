/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dske;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DSke {

    /**
     * @param args the command line arguments
     */
    static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
//    am.get(d).add(s);
  }

  public static void main(String[] args) {

    // Create the graph
    Scanner sc = new Scanner(System.in);
    int V = sc.nextInt();
    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      am.add(new ArrayList<Integer>());

    // Add edges
    for(int i = 0; i < V; i++){
        for(int j = 0; j < V; j++){
            int t = sc.nextInt();
            if(t == 1){
                addEdge(am, i, j);
            }
        }
    }

    printGraph(am);
  }

  // Print the graph
  static void printGraph(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.print("List(" + (i+1) + ") = ");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print((am.get(i).get(j) + 1) + " ");
      }
      System.out.println();
    }
  }
    
}
