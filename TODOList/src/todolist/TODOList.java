/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

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
public class TODOList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ja gribat nolasit-1, ja ievadit-2");

        int izvele = sc.nextInt();
        switch (izvele) {
            case 1:
                lasit();
                break;
            case 2:
                rakstit();
                break;
            default:
                System.out.println("Nepareiza ievade!");
        }
    }

    private static void lasit() {

        String path = "C:\\Users\\Nils\\Desktop\\todolist.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }

    private static void rakstit() {

        String path = "C:\\Users\\Nils\\Desktop\\todolist.txt";

        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {

            System.out.println("Ievadi uzdevumu.");

            String uzd = sc.nextLine();

            String fileContent = uzd;
            bufferedWriter.append(fileContent);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
