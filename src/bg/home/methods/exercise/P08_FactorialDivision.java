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
public class P08_FactorialDivision {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(inputScaner.nextLine());
        int secondNumber = Integer.parseInt(inputScaner.nextLine());

        double firstFactorial = calculateFactorial(firstNumber);
        double secondFactorial = calculateFactorial(secondNumber);

        System.out.println(String.format("%.2f", getDivision(firstFactorial, secondFactorial)));

    }

    private static double calculateFactorial(int number) {
        double factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static double getDivision(double firstFactorial, double secondFactorial) {
        return firstFactorial / secondFactorial;
    }
}
