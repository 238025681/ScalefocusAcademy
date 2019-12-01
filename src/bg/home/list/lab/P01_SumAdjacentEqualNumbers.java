/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.list.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Chobi
 */
public class P01_SumAdjacentEqualNumbers {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(inputScaner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        String output = joinElementByDelimiter(numbers, " ");
        System.out.println(output);
    }

    private static String joinElementByDelimiter(List<Double> numbers, String delimiter) {
        String result = "";
        result = numbers.stream()
                .map((number) -> (new DecimalFormat("0.#").format(number) + delimiter))
                .reduce(result, String::concat);

        return result;
    }

}
