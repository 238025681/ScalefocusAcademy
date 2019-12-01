/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.exercise;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P06_MiddleCharacters {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = inputScaner.nextLine();

        String result = getMiddleCharacters(input);

        System.out.println(result);
    }

    private static String getMiddleCharacters(String text) {
        int startIndex = (text.length() / 2);

        if (text.length() % 2 == 0) {
            return text.substring(startIndex - 1, startIndex + 1);
        }

        return text.substring(startIndex, startIndex + 1);
    }
}
