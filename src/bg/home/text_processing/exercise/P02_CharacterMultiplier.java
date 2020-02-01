/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.text_processing.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P02_CharacterMultiplier {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] characters = inputScaner.nextLine().split("\\s+");
        int result = multiplieCharacter(characters);

        System.out.println(result);
    }

    private static int multiplieCharacter(String[] characters) {
        String firstWord = characters[0];
        String secondWord = characters[1];
        int result = 0;
        int maxIndex = firstWord.length() <= secondWord.length() ? firstWord.length() : secondWord.length();
        for (int i = 0; i < maxIndex; i++) {
            int charFromFirstWord = firstWord.charAt(i);
            int charFromSecondWord = secondWord.charAt(i);
            result += charFromFirstWord * charFromSecondWord;
        }

        if ((firstWord.length() - secondWord.length()) != 0) {

            int minIndex = (firstWord.length() - secondWord.length()) < 0
                    ? firstWord.length()
                    : secondWord.length();

            String word = (firstWord.length() - secondWord.length()) > 0
                    ? firstWord
                    : secondWord;
            
            result += word.chars().skip(minIndex).sum();
        }
        return result;
    }
}
