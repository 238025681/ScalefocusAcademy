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
public class CondenseArrayToNumber_07 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int[] numbers = Arrays.stream(inputScaner.nextLine()
                .split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
        while (numbers.length > 1) {
            int[] condense = new int[numbers.length - 1];
            for (int i = 0; i < condense.length; i++) {
                condense[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condense;
        }
        System.out.println(numbers[0]);
    }
}
