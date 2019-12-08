/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.object_and_classes.lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P01_RandomizeWords {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Random rnd = new Random();
        String[] words = inputScaner.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            int randomIndex = rnd.nextInt(words.length);
            String randomWord = words[randomIndex];
            String currentWord = words[i];
            words[randomIndex] = currentWord;
            words[i] = randomWord;
        }
        Arrays.stream(words).forEach(s -> System.out.println(s));
    }
}
