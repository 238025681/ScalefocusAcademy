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
public class EqualArrays_06 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] firstArray = inputScaner.nextLine().split("\\s+");
        String[] secondArray = inputScaner.nextLine().split("\\s+");

        for (int i = 0; i < firstArray.length; i++) {
            if (!firstArray[i].equals(secondArray[i])) {
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                return;
            }
        }
        System.out.println(String.format("Arrays are identical. Sum: %d",
                Arrays.stream(firstArray).mapToInt(s -> Integer.parseInt(s)).sum()));
    }
}
