/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_3_1;

import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class Day_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        kalkulators();
        
    }
    private static void kalkulators() {

        int beigt = 1;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("***KALKULATORS***");

        while (beigt != 0) {

            System.out.print("Ievadiet pirmo skaitli: ");

            int sk1 = sc.nextInt();

            System.out.print("Ievadiet otro skaitli: ");

            int sk2 = sc.nextInt();

            System.out.println("\nIzvelies darbibu: saskaitit '+', atnemt '-',");
            System.out.println("reizinat '*', dalit '/', kapinat '^'");

            String izvele = sc.next();

            switch (izvele) {

                case "+":
                    System.out.println("Summa ir: " + (saskaitisana(sk1, sk2)));
                    break;
                case "-":
                    System.out.println("Starpiba ir: " + (atnemsana(sk1, sk2)));
                    break;
                case "*":
                    System.out.println("Reizinajums ir: " + (reizinasana(sk1, sk2)));
                    break;
                case "/":
                    System.out.println("Dalijums ir: " + (dalijums(sk1, sk2)));
                    break;
                case "^":
                    System.out.println("Kapinajums ir: " + (kapinasana(sk1, sk2)));
                    break;
                default:
                    System.out.println("Nepareiza ievade!");
                    break;

            }

            System.out.println("Ja gribat turpinat, ievadiet 1, ja ne - 0");

            beigt = sc.nextInt();

        }
        System.out.println("***BEIGAS***");

    }
    private static int saskaitisana(int a, int b){
        
        int summa = a + b;
        
        return summa;
    }
    private static int atnemsana(int a, int b){
        
        int starpiba = a - b;
        
        return starpiba;
        
    }
    private static int reizinasana(int a, int b){
        
        int reizinajums = a * b;
        
        return reizinajums;
    }
    private static double dalijums(double a, double b){
        
        double dali = a / b;
        
        return dali;
    }
    private static int kapinasana(int a, int b){// vai Math.pow(sk1, sk2)
                                                // bez cikla.
        int rezultats = 1;
        
        for(int i = 0; i < b; i++){
            
            rezultats = rezultats * a;
        }
        return rezultats;
    }
    
}
