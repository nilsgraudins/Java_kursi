/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class Saraksti {
    
    private ArrayList<Integer> Ievade(){
        
        ArrayList<Integer> saraksts = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cik skaitlus gribat ievadit?");

        int gar = sc.nextInt();

        for (int i = 0; i < gar; i++) {

            System.out.print("Ievadi " + i + " vertibu: ");

            saraksts.add(sc.nextInt());
        }
        return saraksts;
    }

    public void skaitluSumma() {
        // ievada, cik skaitlus ievadit
        // skaitlus saglaba un izvada summu

        ArrayList<Integer> saraksts = Ievade();
        
        
        int sum = 0;
        for (int j : saraksts) {

            sum = sum + j;  // vai sum+=j

        }
        System.out.println(sum);

    }

    public void paraVaiNepara() {

        
        // ievada, cik skaitlus ievadit
        // saprot, para vai nepara
        // ja para, aizstaj ar 0
        // izvada visu sarakstu
        ArrayList<Integer> parNepar = Ievade();

 
        for (int j = 0; j < parNepar.size(); j++) {// vai "parNepar.size()" 
            // "gar" vietaa
            if (parNepar.get(j) % 2 == 0) {

                parNepar.set(j, 0);

            }
            System.out.print(parNepar.get(j) + " ");
        }
        //System.out.println(parNepar);
    }

}
