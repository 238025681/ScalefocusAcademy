/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P03_OddOccurrences {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] words = inputScaner.nextLine().split("\\s+");
        Map<String, Integer> counts = new LinkedHashMap();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);

            }

        }
        List<String> odds = new ArrayList();

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }

        }
        System.out.println(odds.toString().replaceAll("[\\[\\]]", ""));
    }
}
