/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P07_RemoveNegativesAndReverse {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(inputScaner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numbers = numbers.stream()
                .filter(n -> n >= 0).collect(Collectors.toList());
        if (numbers.size() > 0) {

            Collections.reverse(numbers);
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("empty");
        }
    }
}
