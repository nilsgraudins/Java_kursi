/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_1;

import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class Day_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vards();
        // TODO code application logic here
//        System.out.println("Hello World!"); //"sout" uzreiz dod 
//                                            // System.out.println
//        Scanner sc = new Scanner (System.in);
//        
//        String sim = "aa";
//        
//        sim = sc.nextLine(); // lietotaja ievade. uzreiz ir vajadzigais tips
    }
    public static void Vards(){
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.print("Ievadi savu vārdu: ");
        String var = sc.nextLine();
        
        System.out.println("Tavs vards ir " + var);
              
    }
}
