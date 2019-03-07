/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class Day_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pieciSkaitli();

//        String path = "C:\\Users\\Nils\\Desktop\\sample.txt";
//
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
//
//            String fileContent = "My day is fun.";
//            bufferedWriter.write(fileContent);
//            bufferedWriter.close();
//
//        } catch (IOException e) {
//            System.out.println("error");
//        }
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//            bufferedReader.close();
//        } catch (IOException ex) {
//
//        }
    }

    private static void pieciSkaitli() {
        
        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\Nils\\Desktop\\sample.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true))) {

            System.out.println("Ievadi piecu skaitlus!");
            for (int i = 1; i <= 5; i++) {
                String sk = sc.nextLine();

            String fileContent = sk;
            bufferedWriter.write(fileContent);
            bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
