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
        
        
        
        loginsUnParole();
        //zvaigznite();
        //zarosanas();
        //ards();
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
    private static void zarosanas(){
        
//        String b = "c";
//        String d = "aa";
//        if(b.equals("c")){
//            
//        }else if(b.equals("c")){
//            
//        }else{
//            
//        }
//        switch(a){
//            case 1:
//                //kas notiek
//                break;
//            case 2:
//                break;
//            default:
//                break;
//        }
    }
    private static void zvaigznite(){
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Ievadi skaitli: ");
        int sk = sc.nextInt();
        if(sk >= 5){
            System.out.println("**");
        }else{
            System.out.println("*");
        }
        String simbols = "aaaa";
        int a = simbols.length();// stringa garums...
        
    }
    private static void loginsUnParole(){
        Scanner sc = new Scanner (System.in);
        
        String log = "lietotajs";
        String parol = "abc123";
        
        //3-12 logins
        //5-10 parole
        //vai sakrit
        System.out.print("Ievadi loginu: ");
        String logins = sc.nextLine();
        System.out.print("Ievadi paroli: ");
        String parole = sc.nextLine();
        
        
        //int sim = logins.length(); 
        // var netaisit jaunu int, "logins" var likt "sim" vietā
        
        if(logins.length() >= 3 && logins.length() <= 12 && parole.length() >= 5 && parole.length() <= 10){
           
            if(log.equals(logins) && parol.equals(parole)){// !!!PAPRASIT PAR LOG UN LOGINS SAKARIBU!!!
                                                        // Var salidzinat ari otradi (log.equals(logins)
                System.out.println("Veiksmigi!");       // vai ari var (logins.equals(log), bus tas pats.
            }else{
                
                System.out.println("Neveiksmigi!");
            }
        }else{
            System.out.println("Ievades garums nav pareizs!");
        }
        
        
    }
}
