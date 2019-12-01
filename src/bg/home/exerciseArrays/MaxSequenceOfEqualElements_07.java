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
public class MaxSequenceOfEqualElements_07 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int[] numbers = Arrays.stream(inputScaner.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();

        int[] result = getBestSequence(numbers);
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, result[0], result[0] + result[1])).replaceAll("[\\[|\\]|,]", ""));
    }

    public static int[] getBestSequence(int[] sequence) {
        int[] result = new int[2];
        int bestCount = 0;
        int startIndex = -1;
        for (int i = 0; i < sequence.length; i++) {
            int counter = 1;
            int testIndex = i;
            if (i == sequence.length - 1 && counter > bestCount) {
                bestCount = counter;
                startIndex = testIndex;
            }
            for (int j = i + 1; j < sequence.length; j++) {
                if (sequence[i] == sequence[j]) {
                    counter++;
                } else {
                    if (counter > bestCount) {
                        bestCount = counter;
                        startIndex = testIndex;
                    }

                    break;
                }
                if (j == sequence.length - 1 && counter > bestCount) {
                    bestCount = counter;
                    startIndex = testIndex;
                }
            }

        }
        result[0] = startIndex;
        result[1] = bestCount;
        return result;
    }

}
