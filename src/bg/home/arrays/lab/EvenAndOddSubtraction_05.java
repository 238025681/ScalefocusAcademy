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
public class EvenAndOddSubtraction_05 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        int[] numbers = Arrays.stream(inputScaner.nextLine()
                .split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {

            if ((numbers[i] % 2) == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }

        }
        System.out.println(evenSum - oddSum);
    }
}
