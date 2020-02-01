/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.text_processing.exercise;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P03_ExtractFile {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        String[] input = inputScaner.nextLine().split("\\\\");
        for (String string : input) {
            if (string.contains(".")) {
                String[] file = string.split("\\.");
                System.out.printf("File name: %s%n", file[0]);
                System.out.printf("File extension: %s%n", file[1]);
            }
        }
    }
}
