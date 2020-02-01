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
public class P04_MaximalSum {

    public static int maxSum = 0;
    public static String finalMatrix = new StringBuilder()
            .append("0 ").append("0 ").append("0")
            .append(System.lineSeparator())
            .append("0 ").append("0 ").append("0")
            .append(System.lineSeparator())
            .append("0 ").append("0 ").append("0").toString();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] dementions = inputScaner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dementions[0]);
        int columns = Integer.parseInt(dementions[1]);
        Integer[][] matrix = new Integer[rows][columns];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.
                    stream(inputScaner.nextLine().split("\\s+"))
                    .mapToInt(s -> Integer.parseInt(s))
                    .boxed().toArray(Integer[]::new);
        }

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[0].length - 2; col++) {
                getSum(matrix, row, col);
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        System.out.print(finalMatrix);
    }

//    private static void getMaximalSum(Integer[][] matrix, int row, int col) {
//
//        if ((row + 3) > (matrix.length) || (col + 3) > (matrix[0].length)) {
//            return;
//        }
//
//        int currentSum = 0;
//        StringBuilder bestMatrix = new StringBuilder();
//        for (int r = row; r < row + 3; r++) {
//            for (int c = col; c < col + 3; c++) {
//                currentSum += matrix[r][c];
//                bestMatrix.append(matrix[r][c]).append(" ");
//            }
//            bestMatrix.trimToSize();
//            bestMatrix.append(System.lineSeparator());
//        }
//        if (currentSum > maxSum) {
//            maxSum = currentSum;
//            finalMatrix = bestMatrix.toString();
//
//        }
//        getMaximalSum(matrix, row, col + 1);
//        getMaximalSum(matrix, row + 1, col);
//    }
    private static void getSum(Integer[][] matrix, int row, int col) {
        if ((row + 3) > (matrix.length) || (col + 3) > (matrix[0].length)) {
            return;
        }
        int currentSum = 0;
        StringBuilder bestMatrix = new StringBuilder();
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                currentSum += matrix[r][c];
                bestMatrix.append(matrix[r][c]).append(" ");
            }
            bestMatrix.trimToSize();
            bestMatrix.append(System.lineSeparator());
        }
        if (currentSum > maxSum) {
            maxSum = currentSum;
            finalMatrix = bestMatrix.toString();
        }
    }
}
