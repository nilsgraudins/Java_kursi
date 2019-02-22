/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_3;

import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class Day_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        menu1();
        //Summa();
        
    }
    private static void Summa(){
        
        int summa = 0;
        
      for(int i = 1; i <=5; i++){
          
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Ievadi " + i + "." + "skaitli: ");
          
          summa = summa + sc.nextInt();
          
          
      }
        System.out.println("Skaitlu summa ir: " + summa);
    }
    private static void menu1(){
        
        Scanner sc = new Scanner(System.in);
        
        int izvele = 1;
        
        while(izvele!=0){
            System.out.println("Izvelaties, ko gribat darit - 1, 2, vai 0?");
            
            izvele = sc.nextInt();
            
            switch(izvele){
                
                case 1:
                    System.out.println("1.izvele");
                    break;
                case 2:
                    System.out.println("2.izvele");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nepareiza ievade!");
                    break;
            }
        }
    }
}
