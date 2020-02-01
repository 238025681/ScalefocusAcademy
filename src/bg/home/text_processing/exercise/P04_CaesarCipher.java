/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.text_processing.exercise;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P04_CaesarCipher {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String text = inputScaner.nextLine();

        String result = encryptedText(text);
        System.out.println(result);
    }

    private static String encryptedText(String text) {
        return String.valueOf(
                text
                        .chars()
                        .map(c -> c + 3)
                        .mapToObj(c -> Character.toString((char)c))
                        .collect(Collectors.joining())
                        .toCharArray());

    }
}
