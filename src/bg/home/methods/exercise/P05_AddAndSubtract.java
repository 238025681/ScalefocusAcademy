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
public class P05_AddAndSubtract {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(inputScaner.nextLine());
        int secondNumber = Integer.parseInt(inputScaner.nextLine());
        int thirdNumber = Integer.parseInt(inputScaner.nextLine());

        int sumNumber = getSum(firstNumber, secondNumber);
        int subtractNumber = getsubtract(sumNumber, thirdNumber);

        System.out.println(subtractNumber);
    }

    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int getsubtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
