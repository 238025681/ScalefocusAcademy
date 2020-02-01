/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P01_FillTheMatrix {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] inputParams = inputScaner.nextLine().split(",");
        int[][] matrix = createMatrix(inputParams);
        print(matrix);
    }

    private static int[][] createMatrix(String[] inputParams) {
        String order = inputParams[1].trim();
        int size = Integer.parseInt(inputParams[0].trim());
        int[][] currentMatrix = new int[size][size];

        for (int row = 0, counter = 1; row < size; row++) {
            if (order.equalsIgnoreCase("a")) {
                for (int col = 0; col < size; col++) {
                    currentMatrix[row][col] = counter++;
                }
            } else {
                for (int col = 0; col < size; col++) {
                    if (row % 2 != 0) {

                        currentMatrix[row][(size - 1) - col] = counter++;
                    } else {
                        currentMatrix[row][col] = counter++;

                    }
                }
            }
        }
        return currentMatrix;
    }

    private static void print(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[col][row]+" ");
            }
            System.out.println();
        }
    }
}
