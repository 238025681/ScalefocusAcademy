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
public class RefactorSpecialNumbers_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int result = 0;
        boolean isSpecialNum = false;
        for (int number = 1; number <= count; number++) {
            int cuurenNumber = number;
            while (number > 0) {
                result += number % 10;
                number = number / 10;
            }
            isSpecialNum = (result == 5) || (result == 7) || (result == 11);
            System.out.printf("%d -> %s%n", cuurenNumber, isSpecialNum ? "True": "False");
            result = 0;
            number = cuurenNumber;
        }

    }
}
