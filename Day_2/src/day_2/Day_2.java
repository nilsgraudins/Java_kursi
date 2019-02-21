/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_2;

import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class Day_2 {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        
        
        
        kapinasana();
        //zvaigznites();
        //cikli();
    }
     
    private static void zarosanasUzdevumi(){
        
           int sk1,sk2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli: ");
        sk1 = sc.nextInt();
        System.out.println("Ievadi otro skaitli: ");
        sk2 = sc.nextInt();
        
        System.out.println("+ vai -?");
        
        String izvele = sc.next();
        
        
        
        if(izvele.equals("+")){
            System.out.println(saskaitisana(sk1, sk2));
        }else if(izvele.equals("-")){
            System.out.println(atnemsana(sk1,sk2));
        }else if(izvele.equals("desmit")){
            
            boolean c = nulleLidzDesmit(sk1, sk2);
            if(c==true){//vai vienkarsi(c), ja false, tad (!c)
                System.out.println("OK");
                
            }else{
                System.out.println("Not OK");
            }
        }
        
        
        else{
            System.out.println("Ievades kluda!");
        }
        
        
        
    }
        
    private static int saskaitisana(int a, int b){
        
        int result = a + b;
        
        return result;
    }
    private static int atnemsana(int a, int b){

        
        int result = a - b;
        
        return result;
    }
    private static boolean nulleLidzDesmit(int a, int b){
        
        boolean result = true;
        
        if(a>=0 && a<=10 && b>=0 && b<=10){
            
            result = true;
        }else{
            result = false;
        }
        
        return result;
    }
    private static void cikli(){
        
        // for, foreach, while, do..while
        
        for(int i = 0; i < 10; i++){// ja zin, cik reizu jādara cikls, tad "for"
            System.out.println(i);
        }
        //............................
        int j = 0;              // tas pats, kas "for"
        while(j<10){
            
            System.out.println(j);
            j++;
        }
        //..............................
        j = 0;                  // tas pats, kas "for", tikai parbauda pec tam
        do{                     // "do while" izpildas vienu reizi, pat ja nosacijums neatbilst
            System.out.println(j);
            
        }while(j<10);
        
        String a = "aa";
        String b = "bb";
        
        String c = a + b;
        c = c + a + b; //  aabbaabb
        System.out.println(c);
        
    }
    private static void zvaigznites(){
        
        String a = "";
        
        for(int i = 0; i <= 3; i++){
            
            a = a + "*";
            System.out.println(a);
            
        }
        
    }
    private static void kapinasana(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadi pirmo skaitli:");
        int sk1 = sc.nextInt();
        
        System.out.println("Ievadi otro skaitli:");
        int sk2 = sc.nextInt();
        int summa = 1;
        
        for(int i = 0; i < sk2; i++){
            summa = summa * sk1;
        }
        System.out.println(sk1 + " " + sk2 + ".pakāpē = " + summa);
        
    }
 }   
    

    

