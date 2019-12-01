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
public class SignOfInteger_01 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = Integer.parseInt(inputScanner.nextLine());
        getSign(number);
    }

    private static void getSign(int number) {
        if (number > 0) {
            System.out.println(String.format("The number %d is positive.", number));
        } else if (number < 0) {
            System.out.println(String.format("The number %d is negative.", number));
        } else {
            System.out.println(String.format("The number %d is zero.", number));

        }

    }
}
