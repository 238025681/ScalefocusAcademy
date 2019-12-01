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
public class P09_PalindromeIntegers {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        String number = "";

        while (!(number = inputScaner.nextLine()).equalsIgnoreCase("end")) {

            if (isPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");

            }

        }
    }

    private static boolean isPalindrome(String number) {
        int lastIndex = number.length() - 1;

        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(lastIndex--)) {
                return false;
            }
        }
        return true;
    }

}
