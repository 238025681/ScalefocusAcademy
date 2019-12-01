/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.DataTypesAndVariablesLab;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class SpecialNumbers_10 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int number = Integer.parseInt(inputScaner.nextLine());
        for (int i = 1; i <= number; i++) {
            int sum = i;
            if (i >= 10) {
                sum = getSum(i);
            }

            if ((sum == 5) || (sum == 7) || (sum == 11)) {

                System.out.println(String.format("%d -> True", i));
            } else {
                System.out.println(String.format("%d -> False", i));

            }

        }
    }

    private static int getSum(int sum) {
        int result = 0;

        int currentNumber = sum;
        while (true) {
            int lastDigit = currentNumber % 10;
            result += lastDigit;
            currentNumber = currentNumber / 10;
            if (currentNumber == 0) {

                break;
            }
        }
        return result;
    }
}
