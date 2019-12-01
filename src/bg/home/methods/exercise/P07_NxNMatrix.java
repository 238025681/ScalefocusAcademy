/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.exercise;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P07_NxNMatrix {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        int matrixDimension = Integer.parseInt(inputScaner.nextLine());

        printMatrix(matrixDimension);
    }

    private static void printMatrix(int matrixDimension) {
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                System.out.print(matrixDimension + " ");
            }
            System.out.println("");
        }
    }
}
