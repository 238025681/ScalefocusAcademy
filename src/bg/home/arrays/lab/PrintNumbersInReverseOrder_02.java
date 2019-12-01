/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class PrintNumbersInReverseOrder_02 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String[] numbers = new String[Integer.parseInt(inputScaner.nextLine())];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = inputScaner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            String shiftedNumber = numbers[i];
            if (i == (numbers.length / 2)) {
                break;
            }
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = shiftedNumber;
        }
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[,\\]]", ""));
    }
}
