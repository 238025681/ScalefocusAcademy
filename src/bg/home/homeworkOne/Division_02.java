/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.homeworkOne;

import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Division_02 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int number = Integer.parseInt(inputScaner.nextLine());
        String result = "";
        if (number % 10 == 0) {
            result = "10";
        } else if (number % 7 == 0) {
            result = "7";
        } else if (number % 6 == 0) {
            result = "6";
        } else if (number % 3 == 0) {
            result = "3";
        } else if (number % 2 == 0) {
            result = "2";
        }
        if ("".equals(result)) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %s%n", result);
        }
    }

}
