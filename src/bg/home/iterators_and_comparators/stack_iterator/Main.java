/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.iterators_and_comparators.stack_iterator;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chobi
 */
public class Main {

    public static StackIterator<Integer> numbers = new StackIterator<>();

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        String input = "";

        while (!"end".equalsIgnoreCase(input = inputScaner.nextLine())) {
            String[] tokens = input.replaceAll(",", " ").split("\\s+");

            if ("push".equalsIgnoreCase(tokens[0])) {
                pushNumbers(Arrays.copyOfRange(tokens, 1, tokens.length));

            } else if ("pop".equalsIgnoreCase(tokens[0])) {
                if (numbers.pop() == null) {

                    System.out.println("No elements");
                }
            }
        }
        numbers.forEach(num -> System.out.println(num));
        numbers.forEach(num -> System.out.println(num));
    }

    private static void pushNumbers(String[] inputNumbers) {
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers.push(Integer.parseInt(inputNumbers[i]));
        }

    }
}
