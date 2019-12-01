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
public class SumEvenNumbers_03 {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        int[] numbers = Arrays.stream(inputScaner.nextLine()
                .split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
        System.out.println(Arrays.stream(numbers).filter(s -> s % 2 == 0).sum());
    }
}
