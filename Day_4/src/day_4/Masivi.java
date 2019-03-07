/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class Masivi {

    public void viendimensiju() {

        int[] masivs = new int[3];// izveide
//
//        masivs[0] = 1;            //piešķirsana
//        masivs[1] = 3;
//        masivs[2] = 5;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < masivs.length; i++) {
            masivs[i] = sc.nextInt();
            //for (int j = 0; j < masivs.length; j++){
                
            System.out.println(masivs[i]);
            
            
        }

    }

    public void skaitluMasivs() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cik garu masivu gribat?");
        int garums = sc.nextInt();

        int[] array = new int[garums];

        for (int i = 0; i < array.length; i++) {

            System.out.print("Ievadi skaitli: ");

            array[i] = sc.nextInt();

        }
        int summa = 0;

        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }

        System.out.println("Summa ir: " + summa);
    }

    public void zvaignites() {

        String[] zvaigznes = new String[4];

        for (int i = 0; i < zvaigznes.length; i++) {
            if (i == 0) {
                zvaigznes[i] = "*";
            } else {
                zvaigznes[i] = zvaigznes[i - 1] + "*";
            }
            System.out.println(zvaigznes[i]);

        }

        for (int j = zvaigznes.length - 2; j >=0; j--) {
          
            System.out.println(zvaigznes[j]);
        }
        
    }

    public void nepara() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cik garu masivu gribat?");

        int gar = sc.nextInt();

        int[] masiv = new int[gar];

        for (int i = 0; i < masiv.length; i++) {

            System.out.println("Ievadi skaitli.");

            masiv[i] = sc.nextInt();

        }
        for (int i = 0; i < masiv.length; i++) {

            if (masiv[i] % 2 != 0) {// nepara skaitlus nomaina uz 0
                masiv[i] = 0;
            }

            System.out.print(masiv[i] + " ");

        }
    }

    public void saraksts() {

        List<Integer> skaitluSaraksts = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        skaitluSaraksts.add(2);
        skaitluSaraksts.add(5);
        
        for (int i = 0; i<5; i++){
            skaitluSaraksts.add(sc.nextInt());//ievade Listaa
        }

        System.out.println(skaitluSaraksts.get(2));

        for (int i = 0; i < skaitluSaraksts.size(); i++) {
            //iziet cauri sarakstam
        }
    }

}
