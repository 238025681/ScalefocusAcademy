/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homeworkOne;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class StrongNumber_06 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        char[] number = inputScaner.nextLine().toCharArray();
        int sumOffactorials = 0;

        for (int i = 0; i < number.length; i++) {
            int factorial = getFactorial(Integer.parseInt(String.valueOf(number[i])));
            sumOffactorials += factorial;
        }
        if (Integer.parseInt(new String(number)) == sumOffactorials) {
            System.out.println("yes");
        } else {
            System.out.println("no");

        }
    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
