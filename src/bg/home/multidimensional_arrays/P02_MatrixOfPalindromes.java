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
public class P02_MatrixOfPalindromes {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] dementions = inputScaner.nextLine().split("\\s+");

        String[][] result = createPalindromes(dementions);

        print(result);
    }

    private static String[][] createPalindromes(String[] dementions) {
        int rows = Integer.parseInt(dementions[1]);
        int columns = Integer.parseInt(dementions[0]);
        int letter = 'a';
        String[][] palindromes = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            StringBuilder currentPalindrom = new StringBuilder();
            for (int col = 0; col < columns; col++) {
                currentPalindrom.append((char) (letter + col)).append((char) (letter + col + row)).append((char) (letter + col));
                palindromes[row][col] = currentPalindrom.toString();
                currentPalindrom.delete(0, currentPalindrom.length());
            }
        }
        return palindromes;
    }

    private static void print(String[][] result) {

        for (int col = 0; col < result[0].length; col++) {
            for (int row = 0; row < result.length; row++) {
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
        }
    }
}
