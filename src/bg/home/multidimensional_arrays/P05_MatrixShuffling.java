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
public class P05_MatrixShuffling {

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

        String command = "";
        while (!"end".equalsIgnoreCase(command = inputScaner.nextLine())) {
            String[] tokens = command.split("\\s+");
            if (tokens.length != 5) {
                System.out.println("Invalid input!");
            } else {
                swapNumbers(matrix, tokens);
            }
        }
    }

    private static void swapNumbers(Integer[][] matrix, String[] tokens) {
        int firsRow = Integer.parseInt(tokens[1]);
        int firsCol = Integer.parseInt(tokens[2]);
        int secondRow = Integer.parseInt(tokens[3]);
        int secondCol = Integer.parseInt(tokens[4]);

        if (firsRow >= matrix.length
                || firsCol >= matrix[0].length
                || secondCol >= matrix[0].length
                || secondRow >= matrix.length
                || firsRow < 0
                || firsCol < 0
                || secondCol < 0
                || secondRow < 0) {

            System.out.println("Invalid input!");
            return;
        }

        int firsNumber = matrix[firsRow][firsCol];
        int secondNumber = matrix[secondRow][secondCol];
        matrix[firsRow][firsCol] = secondNumber;
        matrix[secondRow][secondCol] = firsNumber;
        print(matrix);
    }

    public static <T> void print(T[][] result) {

        for (T[] elements : result) {
            for (T element : elements) {

                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
