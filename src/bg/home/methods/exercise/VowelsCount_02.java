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
public class VowelsCount_02 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String word = inputScaner.nextLine();

        int result = getVowelsNumberFromAWord(word);
        System.out.println(result);
    }

    private static int getVowelsNumberFromAWord(String word) {
        int vowelsCount = 0;

        for (int i = 0; i < word.length(); i++) {
            //A, E, I, O, U, and sometimes Y
            switch (word.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    vowelsCount++;
                    break;
                default:
                    break;
            }

        }

        return vowelsCount;
    }
}
