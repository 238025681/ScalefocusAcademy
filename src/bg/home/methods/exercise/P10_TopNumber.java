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
public class P10_TopNumber {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int number = Integer.parseInt(inputScaner.nextLine());

        for (int i = 1; i < number; i++) {
            if (sumOfDigits(i)) {
                if (haveOdsDigits(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean sumOfDigits(int i) {
        int sum = 0;
        int number = i;
        if ((i / 10) == 0) {
            return (i % 8) == 0;
        }
        while (true) {
            sum += (number % 10);
            number = number / 10;
            if (number == 0) {
                break;
            }
        }

        return (sum % 8) == 0;
    }

    private static boolean haveOdsDigits(int number) {

        while (true) {
            int currentNumber = number % 10;

            if (currentNumber % 2 != 0) {
                return true;
            }
            number = number / 10;
            if (number == 0) {
                return false;
            }
        }
    }
}
