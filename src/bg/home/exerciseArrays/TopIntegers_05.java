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
public class TopIntegers_05 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int[] numbers = Arrays.stream(inputScaner.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        for (int i = 0; i < numbers.length; i++) {

            boolean bigInt = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    bigInt = false;
                    break;
                }

            }
            if (bigInt) {
                System.out.print(numbers[i] + " ");

            }

        }

    }
}
