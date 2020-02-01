/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.functional_programming.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Chobi
 */
public class P09_ListOfPredicates {

    public static void main(String[] args) {
        Scanner inputScaner = new Scanner(System.in);
        int range = Integer.parseInt(inputScaner.nextLine());
        List<Integer> numbers = Stream
                .of(inputScaner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        Predicate<Integer> divisible = num -> {
            return numbers.stream().noneMatch(p -> num % p != 0);
        };
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= range; i++) {
            if (divisible.test(i)) {
                result.append(i).append(" ");
            }
        }
        result.trimToSize();
        System.out.println(result.toString());
    }

}
