/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class ReverseArrayOfStrings_04 {
    
    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] words = inputScaner.nextLine().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String shiftedNumber = words[i];
            if (i == (words.length / 2)) {
                break;
            }
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = shiftedNumber;
        }
        System.out.println(Arrays.toString(words).replaceAll("[\\[,\\]]", ""));
    }
    
}
