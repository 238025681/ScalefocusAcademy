/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.multidimensional_arrays;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P03_DiagonalDifference {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int dimensions = Integer.parseInt(inputScaner.nextLine());
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < dimensions; i++) {
            String[] input = inputScaner.nextLine().split(" ");
            primaryDiagonalSum += Integer.parseInt(input[i]);
            secondaryDiagonalSum += Integer.parseInt(input[dimensions - 1 - i]);
        }

        int difference = primaryDiagonalSum - secondaryDiagonalSum;
        System.out.println(Math.abs(difference));

    }
}
