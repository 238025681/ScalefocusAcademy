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
public class P04_WordFilter {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        Arrays
                .stream(inputScaner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .forEach(w -> System.out.println(w));

    }
}
