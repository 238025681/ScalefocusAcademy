/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.methods.lab;

import java.util.Scanner;

/**
 *
 * @author ns3
 */
public class MultipyEvensByOdds_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int result = getMultipleOfEvensAndOdds(Math.abs(number));
        System.out.println(result);
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int odsSum = getSumOfOddDigits(number);

        return evenSum * odsSum;
    }

    private static int getSumOfOddDigits(int number) {
        int odsSum = 0;
        while (true) {
            if ((number % 10) % 2 != 0) {
                odsSum += (number % 10);
            }
            number = number / 10;

            if (number == 0) {
                break;
            }
        }
        return odsSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (true) {
            if ((number % 10) % 2 == 0) {
                evenSum += (number % 10);
            }
            number = number / 10;

            if (number == 0) {
                break;
            }
        }
        return evenSum;
    }
}
