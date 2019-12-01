/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class MagicSum_08 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(inputScaner.nextLine().split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
        int magicNumber = Integer.parseInt(inputScaner.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == magicNumber) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }

        }
    }
}
