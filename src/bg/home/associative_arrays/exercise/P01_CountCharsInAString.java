/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Chobi
 */
public class P01_CountCharsInAString {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        String textSequence = inputScaner.nextLine();

        Map<Character, Integer> counts = new LinkedHashMap();

        for (int i = 0; i < textSequence.length(); i++) {
            if (' ' != (textSequence.charAt(i))) {

                if (!counts.containsKey(textSequence.charAt(i))) {

                    counts.put(textSequence.charAt(i), 1);
                } else {
                    counts.put(textSequence.charAt(i), counts.get(textSequence.charAt(i)) + 1);
                }
            }
        }

        counts
                .entrySet()
                .stream()
                .forEach(c -> System.out.println(String.format("%c -> %d", c.getKey(), c.getValue())));
    }
}
