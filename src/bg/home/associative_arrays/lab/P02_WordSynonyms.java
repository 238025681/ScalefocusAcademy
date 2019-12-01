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
public class P02_WordSynonyms {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int numberOfInputlines = Integer.parseInt(inputScaner.nextLine());
        Map<String, List<String>> words = new LinkedHashMap();
        for (int i = 0; i < numberOfInputlines; i++) {
            String word = inputScaner.nextLine();
            String synonym = inputScaner.nextLine();

            words.putIfAbsent(word, new ArrayList());
            words.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {

            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue().toString().replaceAll("[\\[\\]]", ""));
        }
    }
}
