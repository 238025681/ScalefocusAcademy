/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 *
 * @author Chobi
 */
public class CharactersInRange_03 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int firstCharacter = (int) inputScaner.nextLine().charAt(0);
        int secondCharacter = (int) inputScaner.nextLine().charAt(0);

        String sequenceOfCharacter = getSequence(firstCharacter, secondCharacter);
        System.out.println(sequenceOfCharacter);
    }

    private static String getSequence(int firstCharacter, int secondCharacter) {
        StringJoiner sequence = new StringJoiner(" ");
        int startIndex = Integer.compare(firstCharacter, secondCharacter) <= 0
                ? firstCharacter + 1 : secondCharacter + 1;
        int endIndex = Integer.compare(firstCharacter, secondCharacter) > 0
                ? firstCharacter : secondCharacter;

        for (int i = startIndex; i < endIndex; i++) {
            sequence.add(new String(Character.toChars(i)));

        }
        return sequence.toString();
    }
}
