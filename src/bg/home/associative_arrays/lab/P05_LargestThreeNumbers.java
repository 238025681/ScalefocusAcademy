/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.associative_arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class P05_LargestThreeNumbers {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        Arrays
                .stream(inputScaner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .forEach(n -> System.out.print(n+" "));
    }
}
