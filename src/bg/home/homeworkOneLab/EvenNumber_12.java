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
public class EvenNumber_12 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        int number = Integer.parseInt(inputScaner.nextLine());
        while (true) {

            if ((number % 2) != 0) {
                System.out.println("Please write an even number.");
            } else {
                System.out.println(String.format("The number is: %d", Math.abs(number)));
                break;
            }
            number = Integer.parseInt(inputScaner.nextLine());
        }
    }
}
