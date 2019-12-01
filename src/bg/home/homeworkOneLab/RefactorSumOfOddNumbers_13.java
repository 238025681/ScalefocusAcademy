/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homeworkOneLab;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class RefactorSumOfOddNumbers_13 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int number = Integer.parseInt(inputScaner.nextLine());
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int currentNumber = (2 * i) + 1;
            System.out.println(currentNumber);
            sum += currentNumber;
        }
        System.out.println(String.format("Sum: %d", sum));
    }
}
