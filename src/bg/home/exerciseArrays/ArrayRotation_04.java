/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.exerciseArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class ArrayRotation_04 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int[] numbers = Arrays.stream(inputScaner.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        int numOfShift = Integer.parseInt(inputScaner.nextLine());
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (i - numOfShift < 0) {
                result[((result.length) + ((i - numOfShift)%result.length))%result.length] = numbers[i];

            } else {
                result[(i - numOfShift)] = numbers[i];

            }
        }
        System.out.println(" " + Arrays.toString(result).replaceAll("[\\[|\\]|,]", ""));
    }
}
