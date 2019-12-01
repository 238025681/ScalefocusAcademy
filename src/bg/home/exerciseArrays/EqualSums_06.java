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
public class EqualSums_06 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int[] numbers = Arrays.stream(inputScaner.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            int[] leftArr = Arrays.copyOfRange(numbers, 0, i);
            int[] rightArr = Arrays.copyOfRange(numbers, i + 1, numbers.length);
            if (Arrays.stream(leftArr).sum() == Arrays.stream(rightArr).sum()) {
                result = true;
                System.out.println(i);
            }
        }
        if (!result) {
            System.out.println("no");
        }
    }
}
